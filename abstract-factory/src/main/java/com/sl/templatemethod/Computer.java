package com.sl.templatemethod;

/**
 * @author shuliangzhao
 * @Title: Computer
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/5/28 23:02
 */
public abstract class Computer {

    protected abstract void open();
    protected abstract void close();
    public void run() {
        this.open();
        this.close();
    }
}
