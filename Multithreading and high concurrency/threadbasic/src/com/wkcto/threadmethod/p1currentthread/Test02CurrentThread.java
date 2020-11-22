package com.wkcto.threadmethod.p1currentthread;

public class Test02CurrentThread {
    public static void main(String[] args) throws InterruptedException {
//        System.out.println("main方法中打印当前线程" + Thread.currentThread().getName());

        SubThread2 t2 = new SubThread2();
        t2.setName("t2");
        t2.start();

        Thread.sleep(500);

        Thread t3 = new Thread(t2);
        t3.start();
    }
}
