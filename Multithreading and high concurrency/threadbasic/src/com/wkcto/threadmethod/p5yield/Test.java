package com.wkcto.threadmethod.p5yield;

public class Test {
    public static void main(String[] args) {
        SubThread6 t6 = new SubThread6();
        t6.start();

        long begin = System.currentTimeMillis();
        long sum = 0;
        for (int i = 0; i < 1000000; i++) {
            sum += i;
        }

        long end = System.currentTimeMillis();

        System.out.println("main方法，用时：" + (end - begin));
    }
}
