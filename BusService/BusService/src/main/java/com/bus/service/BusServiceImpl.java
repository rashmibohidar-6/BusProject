package com.bus.service;

import com.bus.config.RestTemplateConfig;
import com.bus.entity.BusOperator;
import com.bus.payload.BusOperatorDto;
import com.bus.repository.BusRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class BusServiceImpl implements BusService{

    private BusRepository busRepository;

    private RestTemplateConfig restTemplate;

    public BusServiceImpl(BusRepository busRepository, RestTemplateConfig restTemplate) {
        this.busRepository = busRepository;
        this.restTemplate = restTemplate;
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


    @Override
    public BusOperatorDto getBusWithTicketsDetails(Long busId) {
        BusOperator buses = busRepository.findById(busId).get();
        ArrayList busTicketList = restTemplate.getRestTemplate().getForObject("http://localhost:8084/api/busticket/"+ busId, ArrayList.class);
        BusOperatorDto dto = new BusOperatorDto();
        dto.getBusId(buses.getBusId());
        dto.getBusNumber(buses.getBusNumber());
        dto.getBusType(buses.getBusType());
        dto.getArrivalTime(buses.getArrivalTime());
        dto.getDepartureTime(buses.getDepartureTime());
        dto.getDepartureCity(buses.getDepartureCity());
        dto.getArrivalCity(buses.getArrivalCity());
        dto.getBusTicketList(busTicketList);
        return null;
    }


}
