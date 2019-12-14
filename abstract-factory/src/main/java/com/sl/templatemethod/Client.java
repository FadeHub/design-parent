package com.sl.templatemethod;

/**
 * @author shuliangzhao
 * @Title: Client
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/5/28 23:05
 */
public class Client {

    public static void main(String[] args) {
        Computer computer = new I5Computer();
        computer.run();
        Computer computer1 = new I7Computer();
        computer1.run();
    }
}
