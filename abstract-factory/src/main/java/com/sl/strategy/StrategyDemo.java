package com.sl.strategy;

/**
 * @author shuliangzhao
 * @Title: StrategyDemo
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2020/1/11 11:22
 */
public class StrategyDemo {

    public static void main(String[] args) {
        Context context = new Context(new AddStrategy());
        System.out.println(context.doSomething(1,2));

        Context context1 = new Context(new SubStrategy());
        System.out.println(context1.doSomething(1,2));

        Context context2 = new Context(new MubStrategy());
        System.out.println(context2.doSomething(1,2));
    }
}
