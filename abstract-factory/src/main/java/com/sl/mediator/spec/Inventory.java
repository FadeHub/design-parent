package com.sl.mediator.spec;

/**
 * @author shuliangzhao
 * @Title: Inventory
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/6/3 21:58
 */
public class Inventory extends AbStractMediatorControl {
    public Inventory(AbstractMediator abstractMediator) {
        super(abstractMediator);
    }

    private static int COMPUTER_NUMBER = 100;

    //库存增加
    public void add(int number) {
        COMPUTER_NUMBER += number;
        System.out.println("库存量为：" + COMPUTER_NUMBER);
    }

    //库存减少
    public void reduce(int number) {

        COMPUTER_NUMBER -= number;
        System.out.println("库存量为：" + COMPUTER_NUMBER);
    }

    //获取库存量
    public int getComputerNumber() {
        return COMPUTER_NUMBER;
    }
}
