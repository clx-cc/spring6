package com.cao.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test4 {
    public static void main(String[] args) throws Exception {
        /*
            需求：
                假设现在已知以下信息：
                    1.有一个类，类名叫做：com.cao.reflect.User
                    2.这个类符合javaBean规范。属性私有化，对外提供公开的setter和getter方法
                    3.这个类中有一个属性，属性的名字叫做age
                    4.并且知道age属性的类型是int类型
                请使用反射机制调用相关方法，给User对象的age属性赋值。
         */
        String className = "com.cao.reflect.User";
        String propertyName = "age";

        //通过反射机制调用setAge方法给age赋值。
        Class<?> clazz = Class.forName(className);
        String setMethodName = "set" + propertyName.toUpperCase().charAt(0) + propertyName.substring(1);
        //获取属性
        Field field = clazz.getDeclaredField(propertyName);
        //获取方法
        Method setAge = clazz.getDeclaredMethod(setMethodName , field.getType());
        //准备对象
        Object obj = clazz.newInstance();
        //调用方法：哪个对象的什么方法？参数是什么？
        setAge.invoke(obj,23);
        System.out.println(obj);

    }
}
