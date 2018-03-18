package com.ilyashutko.buspark.dal;

import com.ilyashutko.buspark.model.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Long> {
}
