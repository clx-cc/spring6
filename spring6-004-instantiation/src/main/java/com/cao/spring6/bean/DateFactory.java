package com.cao.spring6.bean;

import org.springframework.beans.factory.FactoryBean;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFactory implements FactoryBean<Date> {
    //这个参数是用来接收用户传递过来的日期数组
    private String date;

    public DateFactory(String date) {
        this.date = date;
    }

    @Override
    public Date getObject() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(this.date);
        return date;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
}
