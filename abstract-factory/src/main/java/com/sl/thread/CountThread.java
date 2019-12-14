package com.sl.thread;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @author shuliangzhao
 * @Title: CountThread
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/6/5 21:14
 */
public class CountThread implements Runnable {

    private CyclicBarrier cyclicBarrier;

    public CountThread(CyclicBarrier cyclicBarrier) {
        this.cyclicBarrier = cyclicBarrier;
    }

    @Override
    public void run() {
        try {
            System.out.println("计数开始====");
            cyclicBarrier.await();
            System.out.println("计数结束====");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}
