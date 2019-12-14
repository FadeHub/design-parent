package com.sl.synchronizeds;

/**
 * @author shuliangzhao
 * @Title: SyncThread1
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/6/17 23:53
 */
public class CountThread implements Runnable{

    private static int count;

    public CountThread() {
        count = 0;
    }

    public void count() {
        synchronized(this) {
            for (int i = 0; i < 5; i ++) {
                try {
                    System.out.println(Thread.currentThread().getName() + ":" + (count++));
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void print() {
        for (int i = 0; i < 5; i ++) {
            try {
                System.out.println(Thread.currentThread().getName() + ":count:" + (count));
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        if (threadName.equals("A")) {
            count();
        } else if (threadName.equals("B")) {
            print();
        }
    }

    public static void main(String[] args) {
        CountThread countThread = new CountThread();
        Thread thread1 = new Thread(countThread, "A");
        Thread thread2 = new Thread(countThread, "B");
        thread1.start();
        thread2.start();
    }
}
