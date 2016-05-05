package com.ThinkJ.threads.concurrency;

/**
 * Created by ttt on 2016/5/5.
 */
public class MoreBasicThreads {

    public static void main(String[] args) {
        for(int i=0;i<5;i++)
        {
            new Thread(new LiftOff()).start();
        }
        System.out.println("waitting for liftoff");
    }
}
