package com.sl.countdown;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * @author shuliangzhao
 * @Title: SemaPhoreTest
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/6/5 22:50
 */
public class SemaPhoreTest {

    private Semaphore semaphore = new Semaphore(3);

    class TaskThread implements Runnable{

        private int id;

        public TaskThread(int id) {
            this.id = id;
        }

        @Override
        public void run() {
            try {
                semaphore.acquire();
                System.out.println("Thread " + id + " is working");
                Thread.sleep(2000);
                semaphore.release();
                System.out.println("Thread " + id + " is over");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        SemaPhoreTest semaPhoreTest = new SemaPhoreTest();
        /*for (int i = 0;i<6;i++) {
            Thread thread = new Thread(semaPhoreTest.new TaskThread(i));
            thread.start();
        }*/
        ExecutorService executorService = Executors.newCachedThreadPool();//同步队列线程
        executorService.submit(semaPhoreTest.new TaskThread(1));
        executorService.submit(semaPhoreTest.new TaskThread(2));
        executorService.submit(semaPhoreTest.new TaskThread(3));
        executorService.submit(semaPhoreTest.new TaskThread(4));
        executorService.submit(semaPhoreTest.new TaskThread(5));
        executorService.submit(semaPhoreTest.new TaskThread(6));
        executorService.submit(semaPhoreTest.new TaskThread(7));
        executorService.shutdown();
    }
}
