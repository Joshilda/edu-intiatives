package com.example.creational.singleton;
public class SingletonDemo {
    public static void main(String[] args) {
        LoggerSingleton logger1 = LoggerSingleton.getInstance();
        LoggerSingleton logger2 = LoggerSingleton.getInstance();
        logger1.log("Application started");
        logger2.log("Still the same logger instance");
        System.out.println("logger1 == logger2 ? " + (logger1 == logger2));
    }
}
