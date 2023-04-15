package com.example.Laba2.serverces;

import com.example.Laba2.models.*;
import com.example.Laba2.repositiries.Client_Repo;
import com.example.Laba2.repositiries.Driver_Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class Reg_service {
    @Autowired
    private Driver_Repo driver_repo;
    @Autowired
    private Client_Repo client_repo;
    public ResponseEntity saveClient(Client cl){
        try{
            client_repo.save(cl);
            return ResponseEntity.ok("OK");
        }
        catch (Exception ex){
            return ResponseEntity.badRequest().body(ex.getMessage());
        }
    }
    public ResponseEntity saveDriver_D(Driver_D dr){
        try{
            driver_repo.save(dr);
            return ResponseEntity.ok("OK");
        }
        catch (Exception ex){
            return ResponseEntity.badRequest().body(ex.getMessage());
        }
    }

    public Driver_D findbyIdDr(long id_dr) throws Exception {
        try {
           return driver_repo.findById(id_dr);
        }
        catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
    public ResponseEntity updateDr(Driver_D d) throws Exception {
        try {
            driver_repo.deleteById(d.getId());
            driver_repo.save(d);
           return ResponseEntity.ok("ok");
        }
        catch (Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }


}
