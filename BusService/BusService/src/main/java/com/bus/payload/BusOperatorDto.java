package com.bus.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BusOperatorDto {
    private Long busId;
    private String busNumber;
    private String busType;
    private String departureCity;
    private String arrivalCity;
    private String departureTime;
    private String arrivalTime;

    public Long getBusId() {
        return busId;
    }

    public void setBusId(Long busId) {
        this.busId = busId;
    }

    public String getBusNumber(String busNumber) {
        return this.busNumber;
    }

    public void setBusNumber(String busNumber) {
        this.busNumber = busNumber;
    }

    public String getBusType(String busType) {
        return this.busType;
    }

    public void setBusType(String busType) {
        this.busType = busType;
    }

    public String getDepartureCity(String departureCity) {
        return this.departureCity;
    }

    public void setDepartureCity(String departureCity) {
        this.departureCity = departureCity;
    }

    public String getArrivalCity(String arrivalCity) {
        return this.arrivalCity;
    }

    public void setArrivalCity(String arrivalCity) {
        this.arrivalCity = arrivalCity;
    }

    public String getDepartureTime(String departureTime) {
        return this.departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getArrivalTime(String arrivalTime) {
        return this.arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public List<BusTicket> getBusTicketList(ArrayList busTicketList) {
        return this.busTicketList;
    }

    public void setBusTicketList(List<BusTicket> busTicketList) {
        this.busTicketList = busTicketList;
    }

    List<BusTicket> busTicketList;

    public void getBusId(Long busId) {
    }
}
