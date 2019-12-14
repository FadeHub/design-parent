package com.sl;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author shuliangzhao
 * @Title: Test
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/3/10 15:53
 */
public class Test {

    public static void main(String[] args) {
        AtomicInteger atomic = new AtomicInteger(1);
        int i = atomic.get();
        int andIncrement = atomic.getAndIncrement();
        boolean b = atomic.compareAndSet(2, 2);
        System.out.println(b);
        System.out.println(i);
        System.out.println(andIncrement);
    }
}
