package com.sl.factorystrategy;

import java.math.BigDecimal;

/**
 * @author shuliangzhao
 * @Title: Client
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/5/29 0:10
 */
public class Client {

    public static void main(String[] args) {
        WxTrade wxTrade = new WxTrade();
        wxTrade.setTradeAmout(new BigDecimal("1000"));
        WxBlance wxBlance = new WxBlance();
        wxBlance.setBlance(new BigDecimal("999"));
        DeductionFacade.deduct(wxBlance,wxTrade);
        System.out.println(wxTrade.getUserAmout());
    }
}
