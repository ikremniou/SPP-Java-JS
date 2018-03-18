package com.ilyashutko.buspark.bl.impl;

import com.ilyashutko.buspark.bl.BusService;
import com.ilyashutko.buspark.dal.BusRepository;
import com.ilyashutko.buspark.model.Bus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusServiceImpl implements BusService {
    @Autowired
    private BusRepository busRepository;

    @Override
    public Bus create(Bus bus) {
        return busRepository.save(bus);
    }

    @Override
    public Bus update(int oldBusId, Bus bus) {
        Bus selectedBus = busRepository.findOne(Long.valueOf(oldBusId));
        selectedBus.setCapacity(bus.getCapacity());
        selectedBus.setDriver(bus.getDriver());
        selectedBus.setModel(bus.getModel());
        selectedBus.setGovNumber(bus.getGovNumber());
        return busRepository.save(selectedBus);
    }

    @Override
    public Bus read(int busId) {
        return busRepository.findOne(Long.valueOf(busId));
    }

    @Override
    public void delete(int busId) {
        busRepository.delete(Long.valueOf(busId));
    }

    @Override
    public List<Bus> getAll() {
        return busRepository.findAll();
    }
}
