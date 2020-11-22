package com.wkcto.threadmethod.p1currentthread;

public class Test01CurrentThread {
    public static void main(String[] args) {
        System.out.println("main方法中打印当前线程" + Thread.currentThread().getName());

        SubThread1 t1 = new SubThread1();
        t1.start();

        t1.run();
    }
}
