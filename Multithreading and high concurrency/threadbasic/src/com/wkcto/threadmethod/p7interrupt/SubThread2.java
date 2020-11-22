package com.wkcto.threadmethod.p7interrupt;

public class SubThread2 extends Thread {
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 10000; i++) {
            if (this.isInterrupted()){
                System.out.println("当前线程的中断标志为true，我要退出了");
                break;
            }
            System.out.println("sub thread -->" + i);
        }
    }
}
