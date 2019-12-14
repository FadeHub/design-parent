package com.sl.mediator.general;

/**
 * 库存
 * @author shuliangzhao
 * @Title: Inventory
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/6/3 21:06
 */
public class Inventory {

    private static int COMPUTER_NUMBER = 100;

    //库存增加
    public void add(int number) {
        COMPUTER_NUMBER += number;
        System.out.println("库存量为：" + COMPUTER_NUMBER);
    }

    //库存减少
    public void reduce(int number) {
        COMPUTER_NUMBER -=  number;
        System.out.println("库存量为：" + COMPUTER_NUMBER);
    }

    //获取库存量
    public int getComputerNumber() {
        return COMPUTER_NUMBER;
    }
}
