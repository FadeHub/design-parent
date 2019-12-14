package com.sl.factorystrategy;

/**
 * @author shuliangzhao
 * @Title: BlanceDeduction
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/5/28 23:54
 */
public class BlanceDeduction implements Deduction {
    @Override
    public boolean exec(WxBlance wxBlance, WxTrade wxTrade) {
        if (wxBlance.getBlance().compareTo(wxTrade.getTradeAmout()) >= 0) {
            wxTrade.setUserAmout(wxBlance.getBlance());
        }
        return true;
    }
}
