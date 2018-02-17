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
public class HomeController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(ModelMap modelMap){
        return "index";
    }

    @RequestMapping(value = "/contact", method = RequestMethod.GET)
    public String contactsPrint(ModelMap modelMap){
        return "contact";
    }

    @RequestMapping("/about")
    public String aboutPrint(ModelMap modelMap){
        return "about";
    }
}
