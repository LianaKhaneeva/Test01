package com.example.Laba2.repositiries;


import com.example.Laba2.models.Client;
import com.example.Laba2.models.Driver_D;
import org.springframework.data.repository.CrudRepository;
import org.springframework.http.ResponseEntity;

public interface Driver_Repo extends CrudRepository<Driver_D,Long> {
    Driver_D findById(long id);
    Driver_D findByPhone(String phone);


}
