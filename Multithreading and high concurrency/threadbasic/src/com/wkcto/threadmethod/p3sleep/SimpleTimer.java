package com.wkcto.threadmethod.p3sleep;

public class SimpleTimer {
    public static void main(String[] args) {
        int remaining = 10;

        if(args.length == 1){
            remaining = Integer.parseInt(args[0]);
        }

        while (true){
            System.out.println("Remaining:" + remaining);
            remaining--;

            if (remaining < 0){
                break;
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Done");
    }
}
