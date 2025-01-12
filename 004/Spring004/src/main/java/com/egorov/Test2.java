package com.egorov;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Pet pet = context.getBean("myPet", Dog.class);
        Pet pet2 = context.getBean("myCat", Cat.class);
        pet.say();
        pet2.say();
        context.close();
    }
}