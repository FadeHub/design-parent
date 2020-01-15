package com.sl.factory.abstrac;

/**
 * @author shuliangzhao
 * @Title: FactoryProduct
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2020/1/14 20:11
 */
public class FactoryProduct {

    public static CarFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("v6")){
            return new V6Factory();
        } else if(choice.equalsIgnoreCase("v2")){
            return new V12Factory();
        }
        return null;
    }
}
