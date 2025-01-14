package com.egorov;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
        Dog mydog = context.getBean("myPet", Dog.class);
        Dog yourdog = context.getBean("myPet", Dog.class);
        mydog.setName("Belka");
        yourdog.setName("Strelka");
        System.out.println(mydog.getName());
        System.out.println(yourdog.getName());

        System.out.println(mydog);
        System.out.println(yourdog);
        System.out.println(mydog==yourdog);


    }
}
