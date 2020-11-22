package com.wkcto.threadmethod.p7interrupt;

public class Test02 {
    public static void main(String[] args) {
        SubThread2 t1 = new SubThread2();
        t1.start();

        for (int i = 0; i < 100; i++) {
            System.out.println("main ==>" + i);
        }

        t1.interrupt();
    }
}
