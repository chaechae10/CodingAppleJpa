package com.apple.shop.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.RequiredArgsConstructor;

@Entity
@RequiredArgsConstructor
public class MyInfo {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Integer age;

    public MyInfo(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public void incrementAge(){
       this.age =this.age  +1;
    }

    public void setUpAge(Integer age) {
        if(age>0 && age<100){
            this.age=age;
        }
    }
}
