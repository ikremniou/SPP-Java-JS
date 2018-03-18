package com.ilyashutko.buspark.bl;

import com.ilyashutko.buspark.model.City;
import java.util.List;

public interface CityService {
    City create(City city);
    City update(int oldCityId, City city);
    City read(int cityId);
    void delete(int cityId);
    List<City> getAll();
}
