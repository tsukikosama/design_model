package com.miku.simple_factory;

public class test {
    public static void main(String[] args) {
        //创建一个工厂来实现对应的功能
        work_factory factory = com.miku.simple_factory.factory.factory("4");
        factory.work();
    }
}
