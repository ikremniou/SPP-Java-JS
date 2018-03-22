package com.ilyashutko.buspark.controller;

import com.ilyashutko.buspark.modelViews.TicketView;
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
        TicketView ticket1 = FillTicket();
        TicketView ticket2 = FillTicket();
        TicketView ticket3 = FillTicket();

        model.addAttribute("tickets", new ArrayList<TicketView>(Arrays.asList(ticket1, ticket2,ticket3)));

        return "tickets";
    }

    private TicketView FillTicket(){
        TicketView ticket = new TicketView();
        ticket.setId(1);
        ticket.setArrivalCity("Minsk");
        ticket.setDepartmentCity("Grodno");
        ticket.setArrivalTime("10/11/2018");
        ticket.setDepartmentTime("1/11/2018");
        ticket.setPrice(1000);

        return ticket;
    }
}
