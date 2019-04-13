package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
    //사원 번호 , 사원 아이디 , 사원 직책 , 부서 , 연봉 , 전화번호 , 국적


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    private String name;
    private String position;
    private String country;
    private String pw;
    private String employeeNo;
    private String pay;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getEmployeeNo() {
        return employeeNo;
    }

    public void setEmployeeNo(String employeeNo) {
        this.employeeNo = employeeNo;
    }

    public String getPay() {
        return pay;
    }

    public void setPay(String pay) {
        this.pay = pay;
    }
}
