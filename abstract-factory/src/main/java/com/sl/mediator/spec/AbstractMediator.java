package com.sl.mediator.spec;

/**
 * 中介者
 * @author shuliangzhao
 * @Title: AbstractMediator
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/6/3 21:53
 */
public abstract class AbstractMediator {

    protected Order order;
    protected Inventory inventory;
    protected ShoppingCart shoppingCart;

    public AbstractMediator() {
        order = new Order(this);
        inventory = new Inventory(this);
        shoppingCart = new ShoppingCart(this);
    }

    public abstract Object execute(String str,Object... objects);

}
