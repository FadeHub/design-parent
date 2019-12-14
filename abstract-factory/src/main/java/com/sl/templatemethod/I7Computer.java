package com.sl.templatemethod;

/**
 * @author shuliangzhao
 * @Title: I7Computer
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/5/28 23:04
 */
public class I7Computer extends Computer {
    @Override
    protected void open() {
        System.out.println("电脑cup是i7的开机");
    }

    @Override
    protected void close() {
        System.out.println("电脑cup是i7的关机");
    }
}
