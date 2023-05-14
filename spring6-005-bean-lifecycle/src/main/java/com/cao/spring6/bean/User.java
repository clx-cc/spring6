package com.cao.spring6.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

public class User implements BeanNameAware , InitializingBean, DisposableBean {
    private String name;

    public User() {
        System.out.println("实例化Bean");
    }

    public void setName(String name) {
        System.out.println("Bean属性赋值");
        this.name = name;
    }

    public void initBean(){
        System.out.println("初始化Bean");
    }
    public void destroyBean(){
        System.out.println("销毁Bean");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("检查是否实现了Aware接口相关中的的BeanNameAware接口。Bean的名字的：" + s);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("检查Bean是否实现了InitializingBean接口，并调用接口方法");

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("检查Bean是否实现了DisposableBean接口，并调用接口方法");

    }
}
