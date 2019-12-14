package com.sl.thread;

import java.util.concurrent.TimeUnit;

/**
 * @author shuliangzhao
 * @Title: ThreadTaskId
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/6/1 23:03
 */
public class ThreadTaskId implements Runnable {

    private final int id;

    public ThreadTaskId(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        for (int i = 0;i < 2;i++) {
            System.out.println("ThreadTaskId-["+id+"] is running phase-"+i);
            try {
                TimeUnit.SECONDS.sleep(1);
                System.out.println("ThreadTaskId-["+id+"] is over");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
