package com.cao.client;

import com.cao.annotation.Component;

import java.io.File;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ComponentScan {
    public static void main(String[] args) {

        Map<String,Object> beanMap = new HashMap<>();
        //目前只知道一个包的名字，扫描这个包下所有的类，当这个类上有@Component注解时，实例化对象放到Map集合。
        String packageName = "com.cao.bean";

        //开始扫描程序
            //.这个正则表达式代表任意字符，这里的“.”必须是一个普通的字符。不能是正则中的“.”
            //在正则中如何表达一个普通的“.”字符，使用\.
        String packagePath = packageName.replaceAll("\\.", "/");
        //com是在类的根路径下的目录
        URL url = ClassLoader.getSystemResource(packagePath);
        String path = url.getPath();
        //获取绝对路径下的所有文件
        File file = new File(path);
        File[] files = file.listFiles();
        Arrays.stream(files).forEach(f->{
            try {
                //获得包名+类名
                String className = packageName + "." + f.getName().split("\\.")[0];
                //通过反射机制解析注解
                Class<?> clazz = Class.forName(className);
                //判断是否有这个注解
                if (clazz.isAnnotationPresent(Component.class)) {
                    //获取注解
                    Component annotation = clazz.getAnnotation(Component.class);
                    String value = annotation.value();
                    //创建对象
                    Object obj = clazz.newInstance();
                    beanMap.put(value,obj);

                }


            }catch (Exception e){
                e.printStackTrace();
            }


        });
        System.out.println(beanMap);
    }
}
