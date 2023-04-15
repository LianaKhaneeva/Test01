package com.example.Laba2.models;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Zakaz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    private Driver_D driver;
    @ManyToOne
    private Client client;
    private Date date;


    public Zakaz() {
    }

    public void setDriver(Driver_D driver) {
        this.driver = driver;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public long getId_zakaz() {
        return id;
    }

    public Driver_D getDriver() {
        return driver;
    }

    public Client getClient() {
        return client;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }
}
