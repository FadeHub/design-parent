package com.sl.service;

/**
 * @author shuliangzhao
 * @Title: AliPayService
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/5/26 14:30
 */
public class AliPayService implements PayService {
    @Override
    public void pay() {
        System.out.println("支付宝支付");
    }
}
