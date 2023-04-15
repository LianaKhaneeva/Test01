package com.example.Laba2.repositiries;



import com.example.Laba2.models.Zakaz;
import org.springframework.data.repository.CrudRepository;

public interface Zakaz_Repo extends CrudRepository<Zakaz,Long> {
    Iterable<Zakaz> findAllByDriverIsNull();
    Iterable<Zakaz> findAllByClientIsNull();
    Iterable<Zakaz> findAllByClient_Phone(String phone);

}
