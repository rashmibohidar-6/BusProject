package com.bus.service;

import com.bus.entity.BusOperator;
import com.bus.repository.BusRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BusServiceImpl implements BusService{

    private BusRepository busRepository;

    public BusServiceImpl(BusRepository busRepository) {
        this.busRepository = busRepository;
    }

    @Override
    public BusOperator addBuses(BusOperator busOperator) {
        return busRepository.save(busOperator);
    }

    @Override
    public List<BusOperator> getAll() {
        return busRepository.findAll();
    }

    @Override
    public BusOperator getBusById(Long busId) {
        return busRepository.findById(busId).orElseThrow(() -> new RuntimeException("Bus Details not found"));
    }


}
