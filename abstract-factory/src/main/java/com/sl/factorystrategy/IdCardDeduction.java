package com.sl.factorystrategy;

/**
 * @author shuliangzhao
 * @Title: IdCardDeduction
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/5/28 23:54
 */
public class IdCardDeduction implements Deduction {
    @Override
    public boolean exec(WxBlance wxBlance, WxTrade wxTrade) {
        if (wxBlance.getBlance().compareTo(wxTrade.getTradeAmout()) < 0) {
            wxTrade.setUserAmout(wxTrade.getTradeAmout());
        }
        return true;
    }
}
