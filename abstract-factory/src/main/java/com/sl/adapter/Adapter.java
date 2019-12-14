package com.sl.adapter;

/**
 * @author shuliangzhao
 * @Title: Adapter
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/5/26 22:31
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void doSomeing() {
        super.doAdd();
    }
}
