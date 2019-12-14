package com.sl.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author shuliangzhao
 * @Title: ThreadPoolExample
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/6/1 23:03
 */
public class ThreadPoolExample {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 5; i++) {
            executorService.execute(new ThreadTaskId(i));
        }
        executorService.shutdown();
    }
}
