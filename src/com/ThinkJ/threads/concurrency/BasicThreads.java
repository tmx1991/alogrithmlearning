package com.ThinkJ.threads.concurrency;

/**
 * Created by ttt on 2016/5/5.
 */
public class BasicThreads {

    public static void main(String[] args) {
        Thread t = new Thread(new LiftOff());
        t.start();
        System.out.println("waitting for LiftOff");
    }
}
