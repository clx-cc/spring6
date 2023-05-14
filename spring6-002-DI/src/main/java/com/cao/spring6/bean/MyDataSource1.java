package com.cao.spring6.bean;


import java.util.Properties;

public class MyDataSource1{
    private Properties properties;

    @Override
    public String toString() {
        return "MyDataSource1{" +
                "properties=" + properties +
                '}';
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
}
