package com.sl.mediator.general;

/**
 * @author shuliangzhao
 * @Title: Client
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/6/3 21:27
 */
public class Client {

    public static void main(String[] args) {

        System.out.println("==========添加购物车=======");
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.setNumber(3);
        shoppingCart.addShoppingCart();
        System.out.println("==========下订单==========");
        Order order = new Order();
        order.placeOrder(shoppingCart.getNumber());
        System.out.println("==========减库存==========");
        Inventory inventory = new Inventory();
        inventory.reduce(shoppingCart.getNumber());
    }
}
