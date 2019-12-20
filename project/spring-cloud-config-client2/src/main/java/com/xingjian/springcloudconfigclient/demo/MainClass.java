package com.xingjian.springcloudconfigclient.demo;

public class MainClass {

    public static void main(String[] args) throws MyThrowable {
        //        Sup sup = new Sup();
//        Sub obj = (Sub) sup;

        //1.子类转父类：可以|父类转子类：报错
        //2.方法重载：方面名称相同，参数列表不同，备注：方面名称相同，参数列表相同，返回值不同报错编译不通过
        //3.子类转父类，调用相同方法（覆盖或是未覆盖），返回子类方法
        Sub sub = new Sub("abc");
        Sup obj = (Sup) sub;
        obj.getName("name001", 100);

        //sub.setRuntimeException();
//        try {
//            sub.setException();
//        } catch (MyException e) {
//
//        }
        try {
            sub.setRunException();
        } catch (RuntimeException e) {
            System.err.println(e);
        }
        try{
            sub.setError();
        }catch (Error e){
            System.err.println(e);
        }
        System.err.println("aaaa");
    }
}
