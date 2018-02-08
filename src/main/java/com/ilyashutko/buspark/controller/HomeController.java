package com.ilyashutko.buspark.controller;

import com.ilyashutko.buspark.bl.BusParkService;
import com.ilyashutko.buspark.bl.exception.ServiceOperationFailException;
import com.ilyashutko.buspark.dal.BusParkRepository;
import com.ilyashutko.buspark.dal.IRepository;
import com.ilyashutko.buspark.model.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/tables")
public class HomeController {
    @RequestMapping(method = RequestMethod.GET)
    public String printTables(ModelMap model) {
        IRepository repository = new BusParkRepository();
        BusParkService busParkService = new BusParkService(repository);
        try{
            List<City> cities = busParkService.GetAllCites();
            List<Bus> buses = busParkService.GetAllBuses();
            List<Buyer> buyers = busParkService.GetAllBuyers();
            List<Ticket> tickets = busParkService.GetAllTickets();
            List<Worker> workers = busParkService.GetAllWorkers();

            model.addAttribute("cities", cities);
            model.addAttribute("buses", buses);
            model.addAttribute("tickets", tickets);
            model.addAttribute("workers",workers);
            model.addAttribute("buyers", buyers);

            return "tables";
        }
        catch (ServiceOperationFailException ex){
            model.addAttribute("error", ex.getMessage() + "/" + ex.getCause().getMessage());
            return "error";

        }
    }
}
