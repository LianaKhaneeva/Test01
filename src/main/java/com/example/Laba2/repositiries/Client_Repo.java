package com.example.Laba2.repositiries;

import com.example.Laba2.models.Client;

import org.springframework.data.repository.CrudRepository;

public interface Client_Repo extends CrudRepository<Client,Long> {
    Client findById(long id);
    Client findByPhone(String phone);
}
