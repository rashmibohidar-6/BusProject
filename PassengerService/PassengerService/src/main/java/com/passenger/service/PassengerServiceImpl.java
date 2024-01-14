package com.passenger.service;

import com.passenger.entity.BusPassenger;
import com.passenger.repository.PassengerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PassengerServiceImpl implements PassengerService{

    private PassengerRepository passengerRepository;

    public PassengerServiceImpl(PassengerRepository passengerRepository) {
        this.passengerRepository = passengerRepository;
    }

    @Override
    public BusPassenger addDetails(BusPassenger busPassenger) {
        return passengerRepository.save(busPassenger);
    }

    @Override
    public List<BusPassenger> getALL() {
        return passengerRepository.findAll();
    }

    @Override
    public BusPassenger getById(Long psngId) {
        return passengerRepository.findById(psngId).orElseThrow(()->new RuntimeException("Id not found"));
    }

    @Override
    public BusPassenger deleteDetails(Long psngId) {
        BusPassenger passengerToDelete = passengerRepository.findById(psngId)
                .orElseThrow(() -> new RuntimeException("Passenger not found with id: " + psngId));

        passengerRepository.delete(passengerToDelete);

        return passengerToDelete;
    }
}
