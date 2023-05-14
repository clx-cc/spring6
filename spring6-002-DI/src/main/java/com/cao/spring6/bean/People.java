package com.cao.spring6.bean;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class People {
    private List<String> list;//list集合注入
    private Set<String> phones;//set集合注入
    private Map<String,Integer> ages;//map集合注入
    private Map<String,Goods> goodsMap;//注入非简单类型map集合
    /*
        properties本质上也是一个Map集合
        Properties的父类Hashtable实现了Map接口
        Properties的key和value只能是String类型
     */
    private Properties properties;

    @Override
    public String toString() {
        return "People{" +
                "list=" + list +
                ", phones=" + phones +
                ", ages=" + ages +
                ", goodsMap=" + goodsMap +
                ", properties=" + properties +
                '}';
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public void setGoodsMap(Map<String, Goods> goodsMap) {
        this.goodsMap = goodsMap;
    }

    public void setAges(Map<String, Integer> ages) {
        this.ages = ages;
    }

    public void setPhones(Set<String> phones) {
        this.phones = phones;
    }

    public void setList(List<String> list) {
        this.list = list;
    }
}
