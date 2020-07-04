package com.stark.trackzilla.service;

import com.stark.trackzilla.entity.Ticket;

public interface TicketService {
    Iterable<Ticket> listTickets();
}
