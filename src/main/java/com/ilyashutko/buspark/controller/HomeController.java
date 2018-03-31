package com.ilyashutko.buspark.controller;

import com.ilyashutko.buspark.bl.RoleService;
import com.ilyashutko.buspark.bl.UserService;
import com.ilyashutko.buspark.dal.RoleRepository;
import com.ilyashutko.buspark.dal.UserRepository;
import com.ilyashutko.buspark.model.Role;
import com.ilyashutko.buspark.model.Ticket;
import com.ilyashutko.buspark.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.Arrays;

@Controller
public class HomeController {

    @Autowired
    public HomeController(UserService userService, RoleService roleService)
    {
        Role userRole = new Role();
        userRole.setName("USER");
        roleService.create(userRole);

        Role adminRole = new Role();
        userRole.setName("ADMIN");
        roleService.create(adminRole);

        Role driverRole = new Role();
        driverRole.setName("DRIVER");
        roleService.create(driverRole);

        User adminUser = new User();
        adminUser.setName("Ilya");
        adminUser.setSurname("Kremniou");
        adminUser.setUsername("SuperAdmin");
        adminUser.setPassword("123123123");
        userService.save(adminUser);
        userService.addRoleToUser(userService.findByUsername("SuperAdmin"), roleService.findByName("ADMIN"));

        User simpleUser = new User();
        simpleUser.setName("Kostya");
        simpleUser.setSurname("Shutko");
        simpleUser.setUsername("SuperAdmin2");
        simpleUser.setPassword("123123123");
        userService.save(simpleUser);
    }


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
