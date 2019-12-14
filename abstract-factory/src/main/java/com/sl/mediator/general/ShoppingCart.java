package com.sl.mediator.general;

/**
 * 购物车
 * @author shuliangzhao
 * @Title: ShoppingCart
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/6/3 21:06
 */
public class ShoppingCart {

    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    //添加购物车
    public int addShoppingCart(){
        Inventory inventory = new Inventory();
        if (inventory.getComputerNumber() > number) {
            System.out.println("添加购物车"+number+"台");
            return number;
        }else {
            System.out.println("需要添加库存");
            return 1;
        }
    }

    public void clearShoppingCart() {
        System.out.println("清空购物车");
    }
}
