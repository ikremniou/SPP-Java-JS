package com.ilyashutko.buspark.dal;

import com.ilyashutko.buspark.model.Bus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BusRepository extends JpaRepository<Bus, Long> {
}
