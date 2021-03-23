package com.cruddemo.cruddemo.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {

    public long getId() {
        return id;
    }

    public void setId(final long id) {
        this.id = id;
    }

    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq")
    @Id long id;
    String name;
    String surname;
    String address;
    int age;
    String race;
    String maritalStatus;


}
