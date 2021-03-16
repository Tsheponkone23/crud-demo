package com.cruddemo.cruddemo.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Customer {

    public Customer(final String name, final String surname, final String address, final int age, final String race, final String maritalStatus) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.age = age;
        this.race = race;
        this.maritalStatus = maritalStatus;
    }

    public Customer() {

    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public String getRace() {
        return race;
    }

    public String getMaritalStatus() {
        return maritalStatus;
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
