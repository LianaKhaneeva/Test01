package com.example.Laba2.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String phone;
    private String password;
    private String city;
    private String need_w;
    private String need_sity;
    private String need_v;
    private String date_otpr;



    public Client() {
    }

    public String getDate_otpr() {
        return date_otpr;
    }

    public void setDate_otpr(String date_otpr) {
        this.date_otpr = date_otpr;
    }

    public void setNeed_w(String need_w) {
        this.need_w = need_w;
    }

    public void setNeed_sity(String need_sity) {
        this.need_sity = need_sity;
    }

    public void setNeed_v(String need_v) {
        this.need_v = need_v;
    }

    public String getNeed_w() {
        return need_w;
    }

    public String getNeed_sity() {
        return need_sity;
    }

    public String getNeed_v() {
        return need_v;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getPassword() {
        return password;
    }

    public String getCity() {
        return city;
    }
}
