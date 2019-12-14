package com.sl.mediator.general;

import java.util.Random;

/**
 * 订单
 * @author shuliangzhao
 * @Title: Order
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/6/3 21:05
 */
public class Order {

    //下单买电脑
    public void placeOrder(int number) {
        //库存
        ShoppingCart shoppingCart = new ShoppingCart();
        System.out.println("华为笔记本" + number + "台购买成功");
        shoppingCart.clearShoppingCart();
    }

}
