package com.ilyashutko.buspark.bl.impl;

import com.ilyashutko.buspark.bl.CityService;
import com.ilyashutko.buspark.dal.CityRepository;
import com.ilyashutko.buspark.model.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {
    @Autowired
    private CityRepository cityRepository;

    @Override
    public City create(City city) {
        return cityRepository.save(city);
    }

    @Override
    public City update(int oldCityId, City city) {
        City selectedCity = cityRepository.findOne(Long.valueOf(oldCityId));
        selectedCity.setDistance(city.getDistance());
        selectedCity.setName(city.getName());
        return cityRepository.save(selectedCity);
    }

    @Override
    public City read(int cityId) {
        return cityRepository.findOne(Long.valueOf(cityId));
    }

    @Override
    public void delete(int cityId) {
        cityRepository.delete(Long.valueOf(cityId));
    }

    @Override
    public List<City> getAll() {
        return cityRepository.findAll();
    }
}
