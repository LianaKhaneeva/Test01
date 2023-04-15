package com.example.Laba2.Controllers;

import com.example.Laba2.models.Client;
import com.example.Laba2.models.Driver_D;
import com.example.Laba2.models.Zakaz;
import com.example.Laba2.serverces.Reg_service;
import com.example.Laba2.serverces.sdelka_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Random;

@Controller
public class sdelka {
    @Autowired
    public sdelka_service sdelka_service;
    @Autowired
    public Reg_service reg_service;


    @RequestMapping(value = "/drivers",method = RequestMethod.GET)
    public String getDrivers(Model model) throws Exception {
        model.addAttribute("List",sdelka_service.get_Drivers());
        return "drivers";
    }
    @RequestMapping(value = "/clients",method = RequestMethod.GET)
    public String getClients(Model model) throws Exception {
        model.addAttribute("List",sdelka_service.get_Clients());
        return "clients";
    }
    @RequestMapping(value = "/ChoiseC/{id}",method = RequestMethod.GET)
    public String chClients(@PathVariable("id") long id, Model model) throws Exception {
        model.addAttribute("L",sdelka_service.get_Client(id));
        model.addAttribute("driver_d", new Driver_D());
        return "client";
    }
    @RequestMapping(value = "/ChoiseD/{id}",method = RequestMethod.GET)
    public String chDrivers(@PathVariable("id") long id, Model model) throws Exception {
        model.addAttribute("L",sdelka_service.get_Driver(id));
        model.addAttribute("client_d", new Client());
        return "driver";
    }
    @RequestMapping(value = "/sdelC/{id}",method = RequestMethod.POST)
    public String cDrivers(@ModelAttribute("client_c") Client cl, BindingResult result, @PathVariable("id") long id) throws Exception {
      Driver_D dr=  sdelka_service.get_Driver(id);
      try {
          Client cll = sdelka_service.get_Client(cl.getPhone());
          if(cll==null){
              return "singin_page";
          }
      }
      catch (Exception e){
          return "reg_page";
      }
        Client cll = sdelka_service.get_Client(cl.getPhone());
      sdelka_service.sdelC(dr,cll);
        return "Done";
    }@RequestMapping(value = "/sdelD/{id}",method = RequestMethod.POST)
    public String cClient(@ModelAttribute("driver_d") Driver_D dr, BindingResult result, @PathVariable("id") long id) throws Exception {
       Client cl=  sdelka_service.get_Client(id);
        try {
            Driver_D drr = sdelka_service.get_Driver(dr.getPhone());
            if(drr==null){
                return "singin_page";
            }
        }
        catch (Exception e){
            return "driverReg_page";
        }
        Driver_D drr = sdelka_service.get_Driver(dr.getPhone());

        sdelka_service.sdelC(drr,cl);
        return "Done";
    }
    @RequestMapping(value = "/zakaz",method = RequestMethod.GET)
    public String Zakazi(Model model) throws Exception {
        model.addAttribute("client_d", new Client());
        return "zakaz";
    }
    @RequestMapping(value = "/zakaz",method = RequestMethod.POST)
    public String Zaka(@ModelAttribute("client_d") Client cl, BindingResult result,Model model) throws Exception {
        Iterable<Zakaz> z=sdelka_service.get_zakaz(cl.getPhone());
        if(z!=null) model.addAttribute("List",z);
        return "zakaz";
    }
}
