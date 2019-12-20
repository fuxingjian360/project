package com.xingjian.springcloudconfigclient.demo;

public class Sup {
    public Sup(String name) {
        System.err.println("Sup(String name)");
    }

    public Sup() {
        System.err.println("Sup()");
    }


    public String getName(String name, Integer age) {
        System.err.println("Sup.getName()");
        return "hello=" + name + ",age=" + age;
    }
}
