package com.sl.thread;

/**
 * @author shuliangzhao
 * @Title: RetryTest
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/6/1 23:43
 */
public class RetryTest {

    public static void main(String[] args) {
        testRetry();
    }

    public static void testRetry() {
        //retry:注释1
        for (int i = 0; i < 10; i++) {
            retry: //注释2
            while (i == 5) {
                continue retry;
            }
            System.out.print(i + " ");
        }
    }
}
