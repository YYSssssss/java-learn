package com.wkcto.createthread.p2;

public class Test {
    public static void main(String[] args) {
        MyThread2 myThread2 = new MyThread2();
        myThread2.start();

        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("main--" + i);
                int time = (int)(Math.random()*1000);
                Thread.sleep(time);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
