package com.cao.spring6.bean;

import java.util.Arrays;
import java.util.List;

public class Animal {
    //简单数组注入
    private String[] foods;
    //自定义数组注入
    private Cat[] cats;
    //简单类型list集合注入
    private List<String> listSimple;
    //自定义类型list集合注入
    private List<Cat> list2;


    public void setListSimple(List<String> listSimple) {
        this.listSimple = listSimple;
    }

    public void setList2(List<Cat> list2) {
        this.list2 = list2;
    }

    public void setCats(Cat[] cats) {
        this.cats = cats;
    }

    public void setFoods(String[] foods) {
        this.foods = foods;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "foods=" + Arrays.toString(foods) +
                ", cats=" + Arrays.toString(cats) +
                ", listSimple=" + listSimple +
                ", list2=" + list2 +
                '}';
    }
}
