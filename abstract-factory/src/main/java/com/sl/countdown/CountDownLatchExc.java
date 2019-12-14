package com.sl.countdown;

import java.util.concurrent.CountDownLatch;

/**
 * @author shuliangzhao
 * @Title: TestCountDownLatch
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/6/2 12:19
 */
public class CountDownLatchExc {

    private static final int i = 2;

    static class MyRunable implements Runnable {

        private int num;

        private CountDownLatch countDownLatch;

        public MyRunable(int num,CountDownLatch countDownLatch) {
            this.num = num;
            this.countDownLatch = countDownLatch;
        }

        @Override
        public void run() {
            try {
                System.out.println("第" + num + "个线程开始执行任务...");
                Thread.sleep(2000);
                System.out.println("第" + num + "个线程开始执行结束...");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            countDownLatch.countDown();
        }
    }

    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(i);
        for (int i = 0;i < 2;i++) {
            Thread thread = new Thread(new MyRunable(i,countDownLatch));
            thread.start();
        }
        System.out.println("main thread wait.");
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("main thread end...");
    }
}
