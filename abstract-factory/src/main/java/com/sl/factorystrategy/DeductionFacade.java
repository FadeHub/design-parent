package com.sl.factorystrategy;

/**
 * @author shuliangzhao
 * @Title: DeductionFacade
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/5/29 0:06
 */
public class DeductionFacade {

    //扣款
    public static void deduct(WxBlance wxBlance,WxTrade wxTrade) {
        StrategyEnum strate = getStrate(wxBlance, wxTrade);
        Deduction deduction = StrategyFactory.getDeduction(strate);
        deduction.exec(wxBlance,wxTrade);
    }

    //获取扣款策略
    private static  StrategyEnum getStrate(WxBlance wxBlance,WxTrade wxTrade) {
        if (wxBlance.getBlance().compareTo(wxTrade.getTradeAmout()) < 0) {
            return StrategyEnum.IdCardDeduction;
        }else {
            return StrategyEnum.BlanceDeduction;
        }
    }
}
