package com.wkcto.threadmethod.p2Alive;

public class SubThread3 extends Thread {
    @Override
    public void run() {
        System.out.println("run方法，islive = " + this.isAlive());

    }
}
