package com.mkyong.common;

/**
 * Created by a.shipulin on 14.10.16.
 */
public class HelloWorld {
    private String name;

    public void setName(String name) {
        this.name = name;
    }
    public void printHello() {
        System.out.println("Spring3: Hello ! " + name);
    }
}
