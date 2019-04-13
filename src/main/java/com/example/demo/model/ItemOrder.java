package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ItemOrder {
    // 푸드 , employee , 좌석번호 , customer,

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    private String food;
    private String employee;
    private String tableNo;
    private String customer;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    public String getTableNo() {
        return tableNo;
    }

    public void setTableNo(String tableNo) {
        this.tableNo = tableNo;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }
}
