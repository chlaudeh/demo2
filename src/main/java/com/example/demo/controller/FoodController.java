package com.example.demo.controller;


import com.example.demo.model.Account;
import com.example.demo.model.Food;
import com.example.demo.repository.AccountRepository;
import com.example.demo.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/food")
public class FoodController {


    List<Food> foodList = new ArrayList<Food>();
    Random random = new Random();

    //long index = 1;



    @Autowired
    FoodRepository foodRepository;


    @GetMapping("/getFoodList")
    public List<Food> getFoodList(){
        // return foodList;
        return foodRepository.findAll();

    }



    @PostMapping("/makeFood")

    public void makeFood(@RequestBody Food food){
        //Food food;
        //food = new Food();

        //long id = random.nextLong();


        //food.setId(id);


        //숫자를 증가시키기 위한 자바 구문
        // index++;
       // food.setId(index);


        //food.setName("짜장면");
        //food.setEmail("chlaudeh@naver.com");
        //food.setPw("0000");


        foodRepository.save(food);



    }

    @GetMapping("/getFood")
    public Food  getFood(){
        return foodList.get(0);

    }


    @GetMapping("/makeFood2")
    public void getmakeFood2(@RequestParam String foodName,@RequestParam String eamil,@RequestParam String pw){

        foodRepository.save(new Food());


    //조회용도로 사용한다 , 삭제 ,보안에 노출되도 되는것

    }






}
