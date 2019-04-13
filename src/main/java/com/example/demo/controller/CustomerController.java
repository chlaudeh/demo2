package com.example.demo.controller;

import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cumstomer")
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @PostMapping("/makeCustomer")
    public void makeCustomer(@RequestBody Customer customer){


        customerRepository.save(customer);
    }


    @GetMapping("/getCustomers")
    public List<Customer> getCustomers(){

        return customerRepository.findAll();
    }


    @GetMapping("/getCustomer")
    public Optional<Customer> getCustomer(@RequestParam long id){

        return customerRepository.findById(id);

    }

    @GetMapping("/getCustomerAge")
    public Customer getCustomerAge(@RequestParam String CustomerAge){

        return customerRepository.findByCustomerAge(CustomerAge);

    }




}
