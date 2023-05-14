package com.cao.spring6.bean;

public class User {

    /*
        spring底层是怎么实例化对象的？
            默认情况下，spring会通过反射机制，调用类的无参构造方法实例化对象
            Class clazz = Class.forName("com.cao.spring6.bean.User")
            clazz.newInstance();//调用无参构造方法实例化对象
     */
    public User(){
        System.out.println("User的无参构造方法执行~");
    }
}
