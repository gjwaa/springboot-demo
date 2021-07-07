package com.gjw.springbootdemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
class SpringbootDemoApplicationTests {

//    @Autowired
//    private Person person;
//
//
    @Test
    void contextLoads() {


    }
//
//    public static void main(String[] args) {
//        Dog dog1 = new Dog("ahuang",1);
//        Dog dog2 = new Dog("ahuang222",2);
//        Dog result = Optional.ofNullable(dog1).orElse(te("1"));
//        System.out.println(result);
//        Dog result2 = Optional.ofNullable(dog2).orElseGet(() -> te("2"));
//        System.out.println(result2);
//        Dog dog = null;
//        Optional.ofNullable(dog).orElseThrow(()->new NullPointerException());
//    }
//
//    public static Dog te(String name){
//        Dog dog = new Dog(name,123456);
//        System.out.println("==="+dog);
//        return dog;
//    }

}
