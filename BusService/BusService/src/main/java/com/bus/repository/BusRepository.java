package com.bus.repository;

import com.bus.entity.BusOperator;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BusRepository extends JpaRepository<BusOperator, Long> {
}
