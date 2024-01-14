package com.busTicket.repository;

import com.busTicket.entity.BusTicket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BusTicketRepository extends JpaRepository<BusTicket, Long> {
}
