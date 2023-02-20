package com.miku.simple_factory;

/**
 * 这是一个代理工厂用来创建不同的类型的工厂的一个类
 */
public class factory {
    //通过传入不同的工厂类型来创建不同的工厂类
    public  static  work_factory factory(String fac){
        switch (fac){
            case "1":
                return new one_factory();
            case "2":
                return new two_factory();
            case "3":
                return new three_facorty();
            default:
                 throw new RuntimeException("工厂创建失败");
        }
    }
}
