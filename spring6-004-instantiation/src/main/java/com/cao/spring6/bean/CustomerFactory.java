package com.cao.spring6.bean;

import org.springframework.beans.factory.FactoryBean;

//工厂bean，用来返回bean对象的
public class CustomerFactory implements FactoryBean<Customer> {
    @Override
    public Customer getObject() throws Exception {
        return new Customer();
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
}
