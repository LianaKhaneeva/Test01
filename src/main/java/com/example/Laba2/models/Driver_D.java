package com.example.Laba2.models;

import javax.persistence.*;

@Entity
public class Driver_D {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String phone;
    private String password;
    private String city;
    private String PRname;
    private String V;
    private String max_w;
    private String CAname;
    private String model;

    public void setId(long id) {
        this.id = id;
    }

    public void setPRname(String PRname) {
        this.PRname = PRname;
    }

    public void setV(String v) {
        V = v;
    }

    public void setMax_w(String max_w) {
        this.max_w = max_w;
    }

    public void setCAname(String CAname) {
        this.CAname = CAname;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public long getId() {
        return id;
    }

    public String getPRname() {
        return PRname;
    }

    public String getV() {
        return V;
    }

    public String getMax_w() {
        return max_w;
    }

    public String getCAname() {
        return CAname;
    }

    public String getModel() {
        return model;
    }



    public Driver_D() {
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
