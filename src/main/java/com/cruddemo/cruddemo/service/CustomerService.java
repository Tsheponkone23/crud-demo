package com.cruddemo.cruddemo.service;

import com.cruddemo.cruddemo.model.Customer;

import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import java.util.List;

@Transactional
public class CustomerService {

    @PersistenceContext
    EntityManager entityManager;

    public Customer createCustomer(Customer customer){
       entityManager.persist(customer);
       return customer;
    }

    public Customer updateCustomer(Customer customer){
        entityManager.merge(customer);
        return customer;
    }

    public Customer findCustomerById(Long id){
        return entityManager.find(Customer.class,id);
    }

    public List<Customer> getCustomers(){
        return entityManager.createQuery("SELECT c  from Customer c",Customer.class).getResultList();
    }
}
