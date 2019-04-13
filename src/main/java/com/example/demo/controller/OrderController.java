package com.example.demo.controller;



import com.example.demo.model.ItemOrder;
import com.example.demo.repository.OrderRepository;
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
@RequestMapping ("/order")
public class OrderController {





    @Autowired
    OrderRepository orderRepository;

    @PostMapping("/makeorder")
    public void makeorder(@RequestBody ItemOrder itemOrder){

        orderRepository.save(itemOrder);
    }

    @GetMapping("/getitemOrder")
    public List<ItemOrder> getitemOrders(){

        return orderRepository.findAll();
    }

    //바깥에서 가져올떄 형태를 주고 가져온다 아이디 조회

    @GetMapping("/getoder")
    public Optional<ItemOrder> getoder(@RequestParam long id){

        return orderRepository.findById(id);

    }

    //임플로이 조회

    @GetMapping("/getemployee")
    public ItemOrder  getemployee(@RequestParam String employee){

        return orderRepository.findByemployee(employee);

    }


}
