package com.wkcto.threadmethod.p1currentthread;

public class SubThread2 extends Thread {
    public SubThread2(){
        System.out.println("构造方法中，Thread.currentThread.getName():" + Thread.currentThread().getName());
        System.out.println("构造方法,this.getName():" + this.getName());
    }

    @Override
    public void run() {
        System.out.println("构造方法中，Thread.currentThread.getName():" + Thread.currentThread().getName());
        System.out.println("构造方法,this.getName():" + this.getName());
    }
}
