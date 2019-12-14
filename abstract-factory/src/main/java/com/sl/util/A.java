package com.sl.util;

/**
 * @author shuliangzhao
 * @Title: A
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/1/27 15:47
 */
public interface A {

    default void hello() {
        System.out.println("Hello from A");
    }
}
