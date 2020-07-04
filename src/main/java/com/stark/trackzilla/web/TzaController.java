package com.stark.trackzilla.web;

import com.stark.trackzilla.service.ApplicationService;
import com.stark.trackzilla.service.ReleaseService;
import com.stark.trackzilla.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TzaController {

    private ApplicationService applicationService;
    private TicketService ticketService;
    private ReleaseService releaseService;

    @Autowired
    public TzaController(ApplicationService applicationService, TicketService ticketService, ReleaseService releaseService) {
        this.applicationService = applicationService;
        this.ticketService = ticketService;
        this.releaseService = releaseService;
    }

    @GetMapping("/applications")
    public String retrieveApplications(Model model) {
        model.addAttribute("applications", applicationService.listApplications());
        return "applications";

    }

    @GetMapping("/tickets")
    public String retrieveTickets(Model model){
        model.addAttribute("tickets", ticketService.listTickets());
        return "tickets";
    }

    @GetMapping("/releases")
    public String retrieveReleases(Model model){
        model.addAttribute("releases", releaseService.listReleases());
        return "releases";
    }

}
