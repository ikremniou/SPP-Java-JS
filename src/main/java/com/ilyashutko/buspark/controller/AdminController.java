package com.ilyashutko.buspark.controller;

import com.ilyashutko.buspark.bl.UserService;
import com.ilyashutko.buspark.bl.validator.BusValidator;
import com.ilyashutko.buspark.bl.validator.CityValidator;
import com.ilyashutko.buspark.bl.validator.RoleValidator;
import com.ilyashutko.buspark.bl.validator.TicketValidator;
import com.ilyashutko.buspark.model.Bus;
import com.ilyashutko.buspark.model.City;
import com.ilyashutko.buspark.model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.xml.ws.Action;

@Controller
public class AdminController{

    @Autowired
    private CityValidator cityValidator;

    @Autowired
    private RoleValidator roleValidator;

    @Autowired
    private UserService userService;

    @Autowired
    private TicketValidator ticketValidator;

    @Autowired
    private BusValidator busValidator;

    @RequestMapping(value = "/admin/addTicket", method = RequestMethod.GET)
    public String addTicket(ModelMap modelMap){
        return "something";
    }

    @Action
    @RequestMapping(value = "/admin/addTicket", method = RequestMethod.POST)
    public String addTicket(@ModelAttribute Ticket ticket, BindingResult bindingResult, Model model) {
        ticketValidator.validate(ticket, bindingResult);

        if (bindingResult.hasErrors()) {
            return  "/admin/addTicket";
        }
        return  "something";
    }

    @RequestMapping(value = "/admin/updateTicket", method = RequestMethod.GET)
    public String updateTicket(ModelMap modelMap){
        return "something";
    }

    @Action
    @RequestMapping(value = "/admin/updateTicket", method = RequestMethod.POST)
    public String updateTicket(@ModelAttribute Ticket ticket, BindingResult bindingResult, Model model) {
        ticketValidator.validate(ticket, bindingResult);

        if (bindingResult.hasErrors()) {
            return  "/admin/updateTicket";
        }

        return  "something";
    }

    @RequestMapping(value = "/admin/deleteTicket", method = RequestMethod.GET)
    public String deleteTicket(ModelMap modelMap){
        return "something";
    }

    @Action
    @RequestMapping(value = "/admin/deleteTicket", method = RequestMethod.POST)
    public String deleteTicket(@ModelAttribute Ticket ticket, BindingResult bindingResult, Model model) {
        ticketValidator.validate(ticket, bindingResult);

        if (bindingResult.hasErrors()) {
            return  "/admin/addTicket";
        }
        return  "something";
    }

    @RequestMapping(value = "/admin/createBus", method = RequestMethod.GET)
    public String createBus(ModelMap modelMap){
        return "something";
    }

    @Action
    @RequestMapping(value = "/admin/createBus", method = RequestMethod.POST)
    public String createBus(@ModelAttribute Bus bus, BindingResult bindingResult, Model model) {
        busValidator.validate(bus, bindingResult);

        if (bindingResult.hasErrors()) {
            return  "/admin/createBus";
        }
        return  "something";
    }

    @RequestMapping(value = "/admin/updateBus", method = RequestMethod.GET)
    public String updateBus(ModelMap modelMap){
        return "something";
    }

    @Action
    @RequestMapping(value = "/admin/updateBus", method = RequestMethod.POST)
    public String updateBus(@ModelAttribute Bus bus, BindingResult bindingResult, Model model) {
        busValidator.validate(bus, bindingResult);

        if (bindingResult.hasErrors()) {
            return  "/admin/updateBus";
        }
        return  "something";
    }

    @RequestMapping(value = "/admin/deleteBus", method = RequestMethod.GET)
    public String deleteBus(ModelMap modelMap){
        return "something";
    }

    @Action
    @RequestMapping(value = "/admin/deleteBus", method = RequestMethod.POST)
    public String deleteBus(@ModelAttribute Bus bus, BindingResult bindingResult, Model model) {
        busValidator.validate(bus, bindingResult);

        if (bindingResult.hasErrors()) {
            return  "/admin/addTicket";
        }
        return  "something";
    }

    @RequestMapping(value = "/admin/createCity", method = RequestMethod.GET)
    public String createCity(ModelMap modelMap){
        return "something";
    }

    @Action
    @RequestMapping(value = "/admin/createCity", method = RequestMethod.POST)
    public String createCity(@ModelAttribute City city, BindingResult bindingResult, Model model) {
        cityValidator.validate(city, bindingResult);

        if (bindingResult.hasErrors()) {
            return  "/admin/createCity";
        }

        return  "something";
    }

    @RequestMapping(value = "/admin/updateCity", method = RequestMethod.GET)
    public String updateCity(ModelMap modelMap){
        return "something";
    }

    @Action
    @RequestMapping(value = "/admin/updateCity", method = RequestMethod.POST)
    public String updateCity(@ModelAttribute City city, BindingResult bindingResult, Model model) {
        cityValidator.validate(city, bindingResult);

        if (bindingResult.hasErrors()) {
            return  "/admin/updateCity";
        }
        return  "something";
    }

    @RequestMapping(value = "/admin/deleteCity", method = RequestMethod.GET)
    public String deleteCity(ModelMap modelMap){
        return "something";
    }

    @Action
    @RequestMapping(value = "/admin/deleteCity", method = RequestMethod.POST)
    public String deleteCity(@ModelAttribute City city, BindingResult bindingResult, Model model) {
        cityValidator.validate(city, bindingResult);

        if (bindingResult.hasErrors()) {
            return  "/admin/deleteCity";
        }
        return  "something";
    }
}
