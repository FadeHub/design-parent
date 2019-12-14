package com.sl.thread;

import java.util.concurrent.CyclicBarrier;

/**
 * @author shuliangzhao
 * @Title: CountTest
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/6/5 21:16
 */
public class CountTest {

    public static void main(String[] args) {
        System.out.println("主线程开始===");
        Thread thread = new Thread(new CountThread(new CyclicBarrier(1)));
        thread.start();
        System.out.println("主线程结束===");
    }
}
