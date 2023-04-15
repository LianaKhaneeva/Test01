package com.example.Laba2.serverces;

import com.example.Laba2.models.Client;
import com.example.Laba2.models.Driver_D;
import com.example.Laba2.models.Zakaz;
import com.example.Laba2.repositiries.Client_Repo;
import com.example.Laba2.repositiries.Driver_Repo;
import com.example.Laba2.repositiries.Zakaz_Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Random;

@Service
public class sdelka_service {
    @Autowired
    private Zakaz_Repo zakaz_repo;
    @Autowired
    private Client_Repo client_repo;
    @Autowired
    private Driver_Repo driver_repo;


    public Iterable<Client> get_Clients() throws Exception {
        try{
            return client_repo.findAll();
        }
        catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
    public Iterable<Driver_D> get_Drivers() throws Exception {
        try{
            return driver_repo.findAll();
        }
        catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
    public Driver_D get_Driver(long id) throws Exception {
        try{
            return driver_repo.findById(id);
        }
        catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
    public Driver_D get_Driver(String phone) throws Exception {
        try{
            return driver_repo.findByPhone(phone);
        }
        catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
    public Client get_Client(long id) throws Exception {
        try{
            return client_repo.findById(id);
        }
        catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
    public Client get_Client(String phone) throws Exception {
        try{
            return client_repo.findByPhone(phone);
        }
        catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
    public ResponseEntity sdelC(Driver_D d,Client c) throws Exception {
        Zakaz zs=new Zakaz();
        zs.setId(new Random().nextLong());
        zs.setDate(new Date());
        zs.setClient(c);
        zs.setDriver(d);

        try {
            zakaz_repo.save(zs);
            return ResponseEntity.ok("Заказ оформлен");
        }catch (Exception e){
            return  ResponseEntity.badRequest().body(e.getMessage());
        }

    }
    public Iterable<Zakaz> get_zakaz(String phone) throws Exception {
        try{
           Client cl= client_repo.findByPhone(phone);
            return zakaz_repo.findAllByClient_Phone(cl.getPhone());
        }
        catch (Exception e){
            return null;
        }
    }
}
