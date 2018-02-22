package com.ilyashutko.buspark.controller;

import com.ilyashutko.buspark.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

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

    @RequestMapping("/login")
    public String loginPrint(ModelMap modelMap){
        return "login";
    }

    @PostMapping("/loginUser")
    public String loginUserSubmit(@ModelAttribute User user) {
        return "/";
    }

    @RequestMapping("/register")
    public String registerPrint(ModelMap modelMap){
        return "register";
    }

    @PostMapping("/registerUser")
    public String registerUserSubmit(@ModelAttribute User user) {
        return "/";
    }

    @RequestMapping("/tickets")
    public String ticketsPrint(ModelMap model){
        return "tickets";
    }
}
