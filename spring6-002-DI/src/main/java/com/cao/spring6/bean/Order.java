package com.cao.spring6.bean;

import java.util.Arrays;

public class Order {
    //一个订单中有多个商品
    private Goods[] goods;

    public void setGoods(Goods[] goods) {
        this.goods = goods;
    }

    @Override
    public String toString() {
        return "Order{" +
                "goods=" + Arrays.toString(goods) +
                '}';
    }
}
