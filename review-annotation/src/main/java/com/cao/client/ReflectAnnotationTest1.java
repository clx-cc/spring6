package com.cao.client;

import com.cao.annotation.Component;

public class ReflectAnnotationTest1 {
    public static void main(String[] args) throws Exception{

        Class<?> clazz = Class.forName("com.cao.bean.User");
        if (clazz.isAnnotationPresent(Component.class)) {
            Component annotation = clazz.getDeclaredAnnotation(Component.class);
            System.out.println(annotation.value());
        }
    }
}
