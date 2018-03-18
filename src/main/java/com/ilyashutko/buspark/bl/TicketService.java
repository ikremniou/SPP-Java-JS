package com.ilyashutko.buspark.bl;

import com.ilyashutko.buspark.model.Ticket;
import java.util.List;

public interface TicketService {
    Ticket create(Ticket ticket);
    Ticket update(int oldTicketId, Ticket ticket);
    Ticket read(int ticketId);
    void delete(int ticketId);
    List<Ticket> getAll();
}
