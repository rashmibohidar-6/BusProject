package com.passenger.controller;

import com.passenger.entity.BusPassenger;
import com.passenger.service.PassengerService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/passengers")
public class PassengerController {

    private PassengerService passengerService;

    public PassengerController(PassengerService passengerService) {
        this.passengerService = passengerService;
    }
    @PostMapping
    public ResponseEntity<BusPassenger> createPassenger(@Valid @RequestBody BusPassenger busPassenger){
        BusPassenger busPassenger1 = passengerService.addDetails(busPassenger);
        return new ResponseEntity<>(busPassenger1, HttpStatus.CREATED);
    }
    @GetMapping
    public ResponseEntity<List<BusPassenger>> getAllBusDetails(){
        List<BusPassenger> passengerList = passengerService.getALL();
        return new ResponseEntity<>(passengerList, HttpStatus.OK);
    }
    @GetMapping("/{psngId}")
    public ResponseEntity<BusPassenger> getBusDetailsById(@PathVariable Long psngId){
        BusPassenger savedDetaild = passengerService.getById(psngId);
        return new ResponseEntity<>(savedDetaild, HttpStatus.OK);
    }
    @DeleteMapping("/{psngId}")
    public ResponseEntity<BusPassenger> deleteById(@PathVariable Long psngId){
        BusPassenger deleteTicket = passengerService.deleteDetails(psngId);
        return new ResponseEntity<>(deleteTicket, HttpStatus.OK);
    }

}
