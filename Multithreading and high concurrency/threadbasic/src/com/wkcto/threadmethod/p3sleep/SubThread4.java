package com.wkcto.threadmethod.p3sleep;

public class SubThread4 extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("run,threadname=" + Thread.currentThread().getName()
                        + ",begin=" + System.currentTimeMillis());
            Thread.sleep(2000);
            System.out.println("run,threadname=" + Thread.currentThread().getName()
                    + ",begin=" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
