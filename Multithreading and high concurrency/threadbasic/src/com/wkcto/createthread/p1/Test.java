package com.wkcto.createthread.p1;

public class Test {
    public static void main(String[] args) {
        System.out.println("JVM启动main线程，main线程执行main方法");
        Mythread mythread = new Mythread();

        mythread.start();//启动线程

        System.out.println("main线程后面的其他的代码s");

    }
}
