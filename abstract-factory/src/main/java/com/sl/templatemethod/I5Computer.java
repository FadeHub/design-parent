package com.sl.templatemethod;

/**
 * @author shuliangzhao
 * @Title: I5Computer
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/5/28 23:04
 */
public class I5Computer extends Computer {
    @Override
    protected void open() {
        System.out.println("电脑cup是i5的开机");
    }

    @Override
    protected void close() {
        System.out.println("电脑cup是i5的开机");
    }
}
