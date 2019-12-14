package com.sl.strategy;

/**
 * @author shuliangzhao
 * @Title: Calculator
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/5/26 21:07
 */
public enum Calculator {

    ADD{
        @Override
        public int exec(int a, int b) {
            return a+b;
        }
    },
    SUB{
        @Override
        public int exec(int a, int b) {
            return a-b;
        }
    };

    public abstract int exec(int a, int b);
}
