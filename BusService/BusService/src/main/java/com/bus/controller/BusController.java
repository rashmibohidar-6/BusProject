package com.bus.controller;

import com.bus.entity.BusOperator;
import com.bus.service.BusService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/busOperator")
public class BusController {

    private BusService busService;

    public BusController(BusService busService) {
        this.busService = busService;
    }
    //create
    @PostMapping
    public ResponseEntity<BusOperator> createBuses(@RequestBody BusOperator busOperator){
        BusOperator busOperator1 = busService.addBuses(busOperator);
        return new ResponseEntity<>(busOperator1, HttpStatus.CREATED);
    }

    //get all details
    @GetMapping
    public ResponseEntity<List<BusOperator>> getAllDetails(){
        List<BusOperator> getData = busService.getAll();
        return new ResponseEntity<>(getData, HttpStatus.OK);
    }
    @GetMapping("/{busId}")
    public BusOperator getByBusId(@PathVariable Long busId){
        return busService.getBusById(busId);
    }
}
