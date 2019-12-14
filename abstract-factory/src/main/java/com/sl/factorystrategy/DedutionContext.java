package com.sl.factorystrategy;

/**
 * @author shuliangzhao
 * @Title: DedutionContext
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/5/28 23:58
 */
public class DedutionContext {

    private Deduction deduction;

    public DedutionContext(Deduction deduction) {
        this.deduction = deduction;
    }

    public boolean exec(WxBlance wxBlance,WxTrade wxTrade) {
        return deduction.exec(wxBlance,wxTrade);
    }
}
