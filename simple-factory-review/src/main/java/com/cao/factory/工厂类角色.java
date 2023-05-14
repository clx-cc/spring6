package com.cao.factory;

public class 工厂类角色 {
    public 抽象产品角色_汽车 生成汽车(String 汽车类型){
        if (汽车类型 == null || 汽车类型.trim().length() == 0){
            return null;
        }
        抽象产品角色_汽车 汽车 = null;
        if ("宝马".equals(汽车类型)){
            汽车 =  new 具体产品角色_宝马();
        }else if ("奔驰".equals(汽车类型)){
            汽车 = new 具体产品触角_奔驰();
        } else if ("玛莎".equals(汽车类型)){
            汽车 = new 具体产品角色_玛莎();
        }
        return 汽车;
    }
}
