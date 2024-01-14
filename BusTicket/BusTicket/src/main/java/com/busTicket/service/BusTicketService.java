package com.busTicket.service;

import com.busTicket.entity.BusTicket;

import java.util.List;

public interface BusTicketService {

    BusTicket createTicket(BusTicket busTicket);

    List<BusTicket> getAllTicket();

    BusTicket getTicketById(Long ticketId);
}
