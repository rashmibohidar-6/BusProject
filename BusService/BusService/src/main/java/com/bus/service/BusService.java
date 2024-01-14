package com.bus.service;

import com.bus.entity.BusOperator;

import java.util.List;

public interface BusService {
    BusOperator addBuses(BusOperator busOperator);
    List<BusOperator> getAll();

    BusOperator getBusById(Long busId);

}
