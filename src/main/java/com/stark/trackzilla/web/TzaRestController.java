package com.stark.trackzilla.web;

import com.stark.trackzilla.entity.Application;
import com.stark.trackzilla.entity.Ticket;
import com.stark.trackzilla.exception.ApplicationNotFoundException;
import com.stark.trackzilla.service.ApplicationService;
import com.stark.trackzilla.service.ReleaseService;
import com.stark.trackzilla.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;


@RestController
@RequestMapping("/tza")
public class TzaRestController {

    private ApplicationService applicationService;
    private TicketService ticketService;
    private ReleaseService releaseService;

    @Autowired
    public TzaRestController(ApplicationService applicationService, TicketService ticketService, ReleaseService releaseService) {
        this.applicationService = applicationService;
        this.ticketService = ticketService;
        this.releaseService = releaseService;
    }

    @GetMapping("/tickets")
    public ResponseEntity<List<Ticket>> getAllTickets() {
        List<Ticket> list = ticketService.listTickets();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/applications")
    public ResponseEntity<List<Application>> getAllApplications() {
        List<Application> list = applicationService.listApplications();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/application/{id}")
    public ResponseEntity<Application> getApplication(@PathVariable("id") long id) {
        try {
            return new ResponseEntity<>(applicationService.findApplication(id), HttpStatus.OK);
        } catch (ApplicationNotFoundException exception) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Application Not Found");
        }
    }


}
