package com.wkcto.threadmethod.p6priority;

public class ThreadA extends Thread{
    @Override
    public void run() {
        long begin = System.currentTimeMillis();
        int sum = 0;
        for(int i = 0;i <= 1000000000; i++){
            sum += i;
        }
        long end = System.currentTimeMillis();
        System.out.println("thread A :" + (end - begin));
    }
}
