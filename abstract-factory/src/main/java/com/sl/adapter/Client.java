package com.sl.adapter;

/**
 * @author shuliangzhao
 * @Title: Client
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/5/26 22:32
 */
public class Client {

    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        target.doSomeing();
        Target target1 = new Adapter();
        target1.doSomeing();
    }
}
