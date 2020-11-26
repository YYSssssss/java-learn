package com.wkcto.threadsafe;

public class Test01 {
    public static void main(String[] args) {
        MyInt myInt = new MyInt();
        for (int i = 0; i < 2; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    while (true){
                        System.out.println(Thread.currentThread().getName() + " -> " + myInt.getNum());
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }).start();
        }
    }

    static  class MyInt{
        int num;
        public int getNum(){
            return num++;
        }
    }
}
