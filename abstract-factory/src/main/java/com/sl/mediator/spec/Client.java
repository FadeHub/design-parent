package com.sl.mediator.spec;

/**
 * @author shuliangzhao
 * @Title: Client
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/6/3 22:35
 */
public class Client {

    private static final int number = 2;

    public static void main(String[] args) {
        AbstractMediator abstractMediator = new Mediator();
        System.out.println("==========添加购物车=======");
        ShoppingCart shoppingCart = new ShoppingCart(abstractMediator);
        shoppingCart.addShoppingCart(number);
        System.out.println("==========下订单==========");
        Order order = new Order(abstractMediator);
        order.placeOrder(number);
        System.out.println("==========减库存==========");
        Inventory inventory = new Inventory(abstractMediator);
        inventory.reduce(number);
    }
}
