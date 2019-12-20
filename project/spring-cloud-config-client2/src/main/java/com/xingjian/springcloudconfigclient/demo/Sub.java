package com.xingjian.springcloudconfigclient.demo;

import org.apache.tomcat.jni.Error;

public class Sub extends Sup {
    public Sub(String name) {
        super(name);
        System.err.println("Sub(String name)");
    }

    public Sub() {
        //super();
        System.err.println("Sub()");
    }

    public String getName(String name, Integer age) {
        System.err.println("Sub.getName()");
        return "sub";
    }

    public void getName(String name, String age) {
        System.err.println("getName(String name, String age)");
    }

    public void getName(Integer name, Integer age) {
        System.err.println("Sub.getName()");
    }

    public void setException() throws Exception {
        throw new Exception();
    }

    public void setMyException() throws MyException {
        throw new MyException();
    }

    public void setThrowable() throws Throwable {
        throw new Throwable();
    }

    public void setMyThrowable() throws MyThrowable {
        throw new MyThrowable();
    }

    public void setRunException() {
        throw new RuntimeException();
    }

    public void setMyRuntimeException() {
        throw new MyRunException();
    }

    public void setError() {
        throw new MyError();
    }
}
