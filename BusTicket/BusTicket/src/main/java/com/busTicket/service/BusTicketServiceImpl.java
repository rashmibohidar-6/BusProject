package com.busTicket.service;

import com.busTicket.config.RestTemplateConfig;
import com.busTicket.entity.BusTicket;
import com.busTicket.payload.BusOperator;
import com.busTicket.repository.BusTicketRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class BusTicketServiceImpl implements BusTicketService {

    private BusTicketRepository busTicketRepository;

    private RestTemplateConfig restTemplate;

    public BusTicketServiceImpl(BusTicketRepository busTicketRepository, RestTemplateConfig restTemplate) {
        this.busTicketRepository = busTicketRepository;
        this.restTemplate = restTemplate;
    }

    @Override
    public BusTicket createTicket(BusTicket busTicket) {
        BusOperator busOperator = restTemplate.getRestTemplate().getForObject("http://localhost:8081/api/busOperator"+busTicket.getTicketId(),BusOperator.class);
        if(busOperator != null){
            String ticketId = UUID.randomUUID().toString();
            busTicket.setTicketId(ticketId);
            BusTicket savedTicket = busTicketRepository.save(busTicket);
            return savedTicket;
        }else{
            return null;
        }
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
