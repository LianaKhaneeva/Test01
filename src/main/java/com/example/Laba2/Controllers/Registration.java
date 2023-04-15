package com.example.Laba2.Controllers;

import com.example.Laba2.models.*;
import com.example.Laba2.serverces.Reg_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Registration {
    @Autowired
    public Reg_service reg_service;

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String getMain(){
        return "main_page";
    }
    @RequestMapping(value = "/registration",method = RequestMethod.GET)
    public String getReg(Model model){
        model.addAttribute("client_d", new Client());
        return "reg_page";
    }
    @RequestMapping(value = "/regDr",method = RequestMethod.POST)
    public String getReDr(@ModelAttribute("driver_d") Driver_D d,Model model){
        reg_service.saveDriver_D(d);

        return "end_reg";
    }
    @RequestMapping(value = "/registrationDr",method = RequestMethod.GET)
    public String getRegDr(Model model){
        model.addAttribute("driver_d", new Driver_D());
        return "driverReg_page";
    }
    @RequestMapping(value = "/reg",method = RequestMethod.POST)
    public String setClient(@ModelAttribute("client_d") Client cl, BindingResult result){
        reg_service.saveClient(cl);
        return "end_reg";
    }


    @RequestMapping(value = "/singin",method = RequestMethod.GET)
    public String getSing(){
        return "singin_page";
    }

}
