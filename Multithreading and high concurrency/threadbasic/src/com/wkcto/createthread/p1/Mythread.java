package com.wkcto.createthread.p1;

public class Mythread extends Thread {

    @Override
    public void run() {
        System.out.println("这是子线程!");;
    }
}
