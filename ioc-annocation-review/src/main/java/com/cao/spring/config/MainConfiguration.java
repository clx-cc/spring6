package com.cao.spring.config;

import com.cao.spring.bean.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

//表示这是一个配置类：相当于xml文件
@Configuration
//@ComponentScan("com.cao.spring.bean")
@Import(Configuration2.class)
public class MainConfiguration {
//
//    @Bean("carBean")
//    public Car getCarBean(){
//        Car car = new Car();
//        car.setName("12");
//        return car;
//    }
}
