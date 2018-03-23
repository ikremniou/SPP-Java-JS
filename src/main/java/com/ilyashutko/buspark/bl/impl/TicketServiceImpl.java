package com.ilyashutko.buspark.bl.impl;

import com.ilyashutko.buspark.bl.TicketService;
import com.ilyashutko.buspark.dal.TicketRepository;
import com.ilyashutko.buspark.model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketServiceImpl implements TicketService {
    @Autowired
    private TicketRepository ticketRepository;

    @Override
    public Ticket create(Ticket ticket) {
        return ticketRepository.save(ticket);
    }

    @Override
    public Ticket update(int oldTicketId, Ticket ticket) {
        Ticket selectedTicket = ticketRepository.findOne(Long.valueOf(oldTicketId));
        selectedTicket.setArrivalCity(ticket.getArrivalCity());
        selectedTicket.setArrivalTime(ticket.getArrivalTime());
        selectedTicket.setBus(ticket.getBus());
        selectedTicket.setCount(ticket.getCount());
        selectedTicket.setDepartmentCity(ticket.getDepartmentCity());
        selectedTicket.setDepartmentTime(ticket.getDepartmentTime());
        selectedTicket.setDistance(ticket.getDistance());
        selectedTicket.setDriver(ticket.getDriver());
        selectedTicket.setIsInternational(ticket.getIsInternational());
        selectedTicket.setPrice(ticket.getPrice());
        return ticketRepository.save(selectedTicket);
    }

    @Override
    public Ticket read(int ticketId) {
        return ticketRepository.findOne(Long.valueOf(ticketId));
    }

    @Override
    public void delete(int ticketId) {
        ticketRepository.delete(Long.valueOf(ticketId));
    }

    @Override
    public List<Ticket> getAll() {
        return ticketRepository.findAll();
    }
}
