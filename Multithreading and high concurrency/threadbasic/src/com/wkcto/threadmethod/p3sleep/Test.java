package com.wkcto.threadmethod.p3sleep;

public class Test {
    public static void main(String[] args) {
        SubThread4 t4 = new SubThread4();
        System.out.println("main_begin = " + System.currentTimeMillis());
        t4.start();
        t4.run();
        System.out.println("main_end = " + System.currentTimeMillis());
    }
}
