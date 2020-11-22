package com.wkcto.threadmethod.p8daemon;

public class Test {
    public static void main(String[] args) {
        SubDaemonThread thread = new SubDaemonThread();
        thread.setDaemon(true);
        thread.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("main==" + i);
        }
    }
}
