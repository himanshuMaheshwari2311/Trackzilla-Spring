package com.stark.trackzilla.service;

import com.stark.trackzilla.entity.Ticket;
import com.stark.trackzilla.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketServiceImpl implements TicketService {

    private TicketRepository ticketRepository;

    @Autowired
    public TicketServiceImpl(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    @Override
    public List<Ticket> listTickets() {
        return  (List<Ticket>) ticketRepository.findAll();
    }
}
