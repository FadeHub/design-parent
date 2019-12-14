package com.sl.mediator.spec;

/**
 * @author shuliangzhao
 * @Title: ShoppingCart
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/6/3 21:56
 */
public class ShoppingCart extends AbStractMediatorControl {

    public ShoppingCart(AbstractMediator abstractMediator) {
        super(abstractMediator);
    }

    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    //添加购物车
    public int addShoppingCart(int number){
       return (int)super.abstractMediator.execute("cart",number);
    }


    public void clearShoppingCart() {
        System.out.println("清空购物车");
    }

}




