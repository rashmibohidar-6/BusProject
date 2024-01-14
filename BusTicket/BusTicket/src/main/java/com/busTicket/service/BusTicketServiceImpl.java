package com.busTicket.service;

import com.busTicket.entity.BusTicket;
import com.busTicket.repository.BusTicketRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusTicketServiceImpl implements BusTicketService {

    private BusTicketRepository busTicketRepository;

    public BusTicketServiceImpl(BusTicketRepository busTicketRepository) {
        this.busTicketRepository = busTicketRepository;
    }

    @Override
    public BusTicket createTicket(BusTicket busTicket) {
        return busTicketRepository.save(busTicket);
    }

    @Override
    public List<BusTicket> getAllTicket() {
        return busTicketRepository.findAll();
    }

    @Override
    public BusTicket getTicketById(Long ticketId) {
        return busTicketRepository.findById(ticketId).orElseThrow(()-> new RuntimeException("Not found"));
    }
}
