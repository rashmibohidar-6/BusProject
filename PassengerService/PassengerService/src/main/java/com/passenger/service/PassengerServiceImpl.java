package com.passenger.service;

import com.passenger.config.RestTemplateConfig;
import com.passenger.entity.BusPassenger;
import com.passenger.repository.PassengerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PassengerServiceImpl implements PassengerService{

    private RestTemplateConfig restTemplate;

    private PassengerRepository passengerRepository;

    public PassengerServiceImpl(PassengerRepository passengerRepository, RestTemplateConfig restTemplate) {
        this.passengerRepository = passengerRepository;
        this.restTemplate = restTemplate;
    }

    @Override
    public BusPassenger addDetails(BusPassenger busPassenger) {
          BusPassenger passenger = passengerRepository.save(busPassenger);
          return passenger;
    }

    @Override
    public List<BusPassenger> getALL() {
       return passengerRepository.findAll();
    }

    @Override
    public BusPassenger getById(Long psngId) {
        BusPassenger user = passengerRepository.findById(psngId).orElseThrow(()->new RuntimeException("Id not found"));
        return user;
    }

    @Override
    public BusPassenger deleteDetails(Long psngId) {
        BusPassenger passengerToDelete = passengerRepository.findById(psngId)
                .orElseThrow(() -> new RuntimeException("Passenger not found with id: " + psngId));

        passengerRepository.delete(passengerToDelete);

        return passengerToDelete;
    }
}
