package com.sl.mediator.spec;


/**
 * @author shuliangzhao
 * @Title: Order
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/6/3 21:57
 */
public class Order extends AbStractMediatorControl {
    public Order(AbstractMediator abstractMediator) {
        super(abstractMediator);
    }

    public int placeOrder(int number) {
        return (int)super.abstractMediator.execute("order",number);
    }
}
