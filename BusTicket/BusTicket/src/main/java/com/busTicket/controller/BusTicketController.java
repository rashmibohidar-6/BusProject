package com.busTicket.controller;

import com.busTicket.entity.BusTicket;
import com.busTicket.service.BusTicketService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/busticket")
public class BusTicketController {
    private BusTicketService busTicketService;

    public BusTicketController(BusTicketService busTicketService) {
        this.busTicketService = busTicketService;
    }
    @PostMapping
    public ResponseEntity<BusTicket> createBusTickets(@RequestBody BusTicket busTicket){
        BusTicket busTicket1 = busTicketService.createTicket(busTicket);
        return new ResponseEntity<>(busTicket1, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<BusTicket>> getAllTicketDetails(){
        List<BusTicket> ticketList = busTicketService.getAllTicket();
        return new ResponseEntity<>(ticketList, HttpStatus.OK);
    }

    @GetMapping("/{ticketId}")
    public ResponseEntity<BusTicket> getTicketDetailsById(@PathVariable Long ticketId){
        BusTicket ticket = busTicketService.getTicketById(ticketId);
        return new ResponseEntity<>(ticket, HttpStatus.OK);
    }


}
