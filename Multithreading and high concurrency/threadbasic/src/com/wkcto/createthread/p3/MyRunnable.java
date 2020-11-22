package com.wkcto.createthread.p3;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("sub thread -->" + i);
        }
    }
}
