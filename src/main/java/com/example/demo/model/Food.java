package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Food {
    //분류 디저트인지 메인푸드인지 , 단품 ,셋트, 음식분류명
    //실제로 음식의 이름 ,
    //가격 , take out 여부 , 계절상품 활성화여부 ative y /n




    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    long id;
    private String name;
    private String foodType;
    private String set;
    private String takeOut;
    private String season;
    private String prise;
    private String Activation;

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

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public String getSet() {
        return set;
    }

    public void setSet(String set) {
        this.set = set;
    }

    public String getTakeOut() {
        return takeOut;
    }

    public void setTakeOut(String takeOut) {
        this.takeOut = takeOut;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getPrise() {
        return prise;
    }

    public void setPrise(String prise) {
        this.prise = prise;
    }

    public String getActivation() {
        return Activation;
    }

    public void setActivation(String activation) {
        Activation = activation;
    }
}
