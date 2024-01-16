package com.busTicket.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BusOperator {
    private Long busId;
    private String busNumber;
    private String busType;
    private String departureCity;
    private String arrivalCity;
    private String departureTime;
    private String arrivalTime;
}
