package com.ilyashutko.buspark.dal;


import com.ilyashutko.buspark.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
}
