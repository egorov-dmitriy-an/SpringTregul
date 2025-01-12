package com.egorov;

public class Dog implements Pet {
    @Override
    public void say() {
        System.out.println("Woof!!!");
    }
}
