package com.passenger.repository;

import com.passenger.entity.BusPassenger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepository extends JpaRepository<BusPassenger, Long> {
}
