package com.cruddemo.cruddemo.controller;

import com.cruddemo.cruddemo.model.Customer;
import com.cruddemo.cruddemo.service.CustomerService;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import javax.ws.rs.core.Response;

import java.util.List;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping(path="/api/v1", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
public class CrudController {


    CustomerService customerService;

    @GetMapping(path = "/customerDetails")
    public List<Customer> showResults(){
        return customerService.getCustomers();
    }

    @PostMapping( path = "/addcustomer")
    public Response addUser(@RequestBody Customer customer){
        customerService.createCustomer(customer);
         return Response.ok(customer).build();
    }


}
