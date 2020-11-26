package com.wkcto.threadsafe;

import java.util.Random;

public class Test02 {
    public static void main(String[] args) throws InterruptedException {
        MyTask task = new MyTask();
        new Thread(task).start();

        Thread.sleep(1000);

        task.cancel();
    }
    static class MyTask implements Runnable{
        private boolean toCancel = false;

        @Override
        public void run() {
            while (!toCancel){
                if(doSomething()){
                    break;
                }
            }
            if(toCancel){
                System.out.println("任务被取消");
            }
        }

        private boolean doSomething(){
            System.out.println("执行某个任务。。。。");
            try {
                Thread.sleep(new Random().nextInt(1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return true;
        }

        public void cancel(){
            toCancel = true;
            System.out.println("收到取消线程的消息");
        }
    }
}
