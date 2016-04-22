package commonalgorithms.Threads;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by ttt on 2016/4/22.
 */
public class ThreadTest {

    private int j;
    Lock lock = new ReentrantLock();

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ThreadTest tt = new ThreadTest();
        for (int i = 0; i < 2; i++) {
            new Thread(tt.new Adder()).start();
            new Thread(tt.new Subtractor()).start();
        }
    }

    private class Subtractor implements Runnable
    {

        @Override
        public void run() {
            // TODO Auto-generated methodstub
            while (true) {
 /*synchronized (ThreadTest.this) {
 System.out.println("j--="+ j--);
 //这里抛异常了，锁能释放吗？
 }*/
                lock.lock();
                try {
                    System.out.println("j--=" + j--);
                } finally {
                    lock.unlock();
                }
            }
        }

    }

    private class Adder implements Runnable
    {

        @Override
        public void run() {
            // TODO Auto-generated methodstub
            while(true)
            {
 /*synchronized (ThreadTest.this) {
 System.out.println("j++="+ j++);
 }*/
                lock.lock();
                try
                {
                    System.out.println("j++="+ j++);
                }finally
                {
                    lock.unlock();
                }
            }
        }
    }

}
