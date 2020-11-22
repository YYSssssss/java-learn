package com.wkcto.threadmethod.p2Alive;

public class Test {
    public static void main(String[] args) {
        SubThread3 t3 = new SubThread3();
        System.out.println("begin==" + t3.isAlive());
        t3.start();
        System.out.println("end==" + t3.isAlive());

    }
}
