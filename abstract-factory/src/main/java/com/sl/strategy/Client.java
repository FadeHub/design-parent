package com.sl.strategy;

import java.util.Arrays;

/**
 * @author shuliangzhao
 * @Title: Client
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/5/26 21:11
 */
public class Client {

    public static void main(String[] args) {
        //输入两个参数是数字
        int a = 2;
        String symbol = "+"; //符号
        int b = 1;
        System.out.println("运行结果为："+a+symbol+b+"="+Calculator.ADD.exec(a,b));
    }
}
