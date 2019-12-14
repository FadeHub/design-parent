package com.sl.service;

/**
 * @author shuliangzhao
 * @Title: WxPayService
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/5/26 14:30
 */
public class WxPayService implements PayService {
    @Override
    public void pay() {
        System.out.println("微信支付");
    }
}
