package com.wkcto.createthread.p3;

public class Test {
    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();

        Thread thread = new Thread(runnable);
        
        thread.start();

        for (int i = 0; i < 100; i++) {
            System.out.println("main==>" + i);
        }
    }
}
