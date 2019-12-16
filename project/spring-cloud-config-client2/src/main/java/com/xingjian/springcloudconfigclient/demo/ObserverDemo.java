package com.xingjian.springcloudconfigclient.demo;


import java.util.Observable;
import java.util.Observer;

public class ObserverDemo {

    public static void main(String[] args) {
        MyObservable observable = new MyObservable();
        observable.addObserver(new Observer() {
            @Override
            public void update(Observable o, Object arg) {
                System.err.println(arg+"777");
            }
        });

        observable.addObserver(new Observer() {
            @Override
            public void update(Observable o, Object arg) {
                System.err.println(arg+"888");
            }
        });
        observable.setChanged();
        observable.notifyObservers("hello world!!!");

    }

    public static class MyObservable extends Observable {
        @Override
        protected synchronized void setChanged() {
            super.setChanged();
        }
    }
}
