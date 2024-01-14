package com.passenger.service;

import com.passenger.entity.BusPassenger;

import java.util.List;

public interface PassengerService {
    BusPassenger addDetails(BusPassenger busPassenger);

    List<BusPassenger> getALL();

    BusPassenger getById(Long psngId);

    BusPassenger deleteDetails(Long psngId);

}
