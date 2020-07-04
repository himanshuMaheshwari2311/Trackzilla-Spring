package com.stark.trackzilla.service;

import com.stark.trackzilla.entity.Ticket;
import com.stark.trackzilla.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketServiceImpl implements TicketService {

    private TicketRepository ticketRepository;

    @Autowired
    public TicketServiceImpl(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    @Override
    public Iterable<Ticket> listTickets() {
        return ticketRepository.findAll();
    }
}
