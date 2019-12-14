package com.sl.factorystrategy;

/**
 * @author shuliangzhao
 * @Title: Deduction
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/5/28 23:53
 */
public interface Deduction {

    public boolean exec(WxBlance wxBlance,WxTrade wxTrade);
}
