package com.cao.spring.bean;

public class CatFactory extends AnimalFactory {
    @Override
    public Animal get() {
        return new Cat();
    }
}
