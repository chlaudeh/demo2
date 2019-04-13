package com.example.demo.repository;

import com.example.demo.model.ItemOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<ItemOrder, Long> {


    ItemOrder  findByemployee(String employee);
}
