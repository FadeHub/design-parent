package com.sl.mediator.spec;

import org.apache.commons.lang3.StringUtils;

/**
 * @author shuliangzhao
 * @Title: Mediator
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/6/3 22:02
 */
public class Mediator extends AbstractMediator {

    @Override
    public Object execute(String str, Object... objects) {
        if (StringUtils.equals("order",str)) {
           return this.placeOrder((Integer) objects[0]);
        }else if (StringUtils.equals("cart",str)) {
           return this.addShoppingCart((Integer)objects[0]);
        }else if (StringUtils.equals("inv",str)) {

        }
        return null;
    }


    //下单买电脑
    private int placeOrder(int number) {
        //库存
        System.out.println("华为笔记本" + number + "台购买成功");
        super.shoppingCart.clearShoppingCart();
        return number;
    }

    //添加购物车
    private int addShoppingCart(int number){
        if (inventory.getComputerNumber() > number) {
            System.out.println("添加购物车"+number+"台");
            return number;
        }else {
            System.out.println("需要添加库存");
            return 1;
        }
    }


}

