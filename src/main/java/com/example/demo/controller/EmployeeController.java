package com.example.demo.controller;


import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;
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
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;



    @PostMapping("/makeemployee")
    public void makeemployee(@RequestBody Employee employee){

        employeeRepository.save(employee);



    }

    @GetMapping("/getemployees")
    public List<Employee> getemployees(){

        return employeeRepository.findAll();

    }

    @GetMapping("/getemployee")
    public Optional<Employee> getemployee(@RequestParam long id){

        return employeeRepository.findById(id);

    }

   @GetMapping("/getemloyeeByEmployeeno")
    public Employee getemloyeeByEmployeeno(@RequestParam String employeeNo){


      return employeeRepository.findByEmployeeNo(employeeNo);

    }

    @GetMapping("/getemplyoeePay")
    public Employee getemplyoeePay(@RequestParam String pay){

        return employeeRepository.findBypay(pay);

    }

}
