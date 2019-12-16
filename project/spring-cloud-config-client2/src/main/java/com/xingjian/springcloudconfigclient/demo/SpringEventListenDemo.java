package com.xingjian.springcloudconfigclient.demo;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringEventListenDemo {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        context.addApplicationListener(new ApplicationListener<MyApplicationEvent>() {
            @Override
            public void onApplicationEvent(MyApplicationEvent applicationEvent) {
                applicationEvent.printName();
                System.err.println(applicationEvent);
            }
        });
        context.refresh();
        context.publishEvent(new MyApplicationEvent("hello world1!!!!"));
        context.publishEvent(new MyApplicationEvent("hello world2!!!!"));
        context.publishEvent(new MyApplicationEvent("hello world3!!!!"));
    }


    public static class MyApplicationEvent extends ApplicationEvent {

        public MyApplicationEvent(Object source) {
            super(source);
        }

        public void printName() {
            System.err.println("hhhhhh");
        }
    }

}
