package com.egorov;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
@Scope()
public class Dog implements Pet {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Dog() {
        System.out.println("Dog bean is created");
    }

    @Override
    public void say() {
        System.out.println("Woof!!!");
    }
@PostConstract
    public void init() {
        System.out.println("Class Dog: init method");
    }
@PreDestroy
    public void destroy() {
        System.out.println("Class Dog: destroy method");
    }

}
