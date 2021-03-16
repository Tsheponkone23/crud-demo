package com.cruddemo.cruddemo.controller;

import com.cruddemo.cruddemo.model.Customer;
import com.cruddemo.cruddemo.model.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="/customer")
public class CrudController {


   private CustomerRepository customerRepository;

    @GetMapping(path = "/customerDetails")
    public List<Customer> showResults(){
        return customerRepository.findAll();
    }

    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE}, path = "/addcustomer")
    public Customer addUser(@RequestBody Customer customer){
   //  customerRepository.save(customer);
     return customer;
    }


}
