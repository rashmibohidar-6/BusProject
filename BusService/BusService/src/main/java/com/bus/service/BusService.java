package com.bus.service;

import com.bus.entity.BusOperator;
import com.bus.payload.BusOperatorDto;

import java.util.List;

public interface BusService {
    BusOperator addBuses(BusOperator busOperator);
    List<BusOperator> getAll();

    BusOperator getBusById(Long busId);

    BusOperatorDto getBusWithTicketsDetails(Long busId);

}
