package com.ilyashutko.buspark.controller;

import com.ilyashutko.buspark.model.Ticket;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.Arrays;

@Controller
public class HomeController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(ModelMap modelMap){
        return "tables";
    }

    @RequestMapping(value = "/contact", method = RequestMethod.GET)
    public String contactsPrint(ModelMap modelMap){
        return "contact";
    }

    @RequestMapping("/about")
    public String aboutPrint(ModelMap modelMap){
        return "about";
    }

    @RequestMapping("/tickets")
    public String ticketsPrint(ModelMap model){
        Ticket ticket1 = FillTicket();
        Ticket ticket2 = FillTicket();
        Ticket ticket3 = FillTicket();

        model.addAttribute("tickets", new ArrayList<Ticket>(Arrays.asList(ticket1, ticket2,ticket3)));

        return "tickets";
    }

    private Ticket FillTicket(){
        Ticket ticket = new Ticket();
        ticket.setId(1);
        ticket.setPrice(1000);

        return ticket;
    }
}
