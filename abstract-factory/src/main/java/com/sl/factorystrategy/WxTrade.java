package com.sl.factorystrategy;

import java.math.BigDecimal;

/**
 * @author shuliangzhao
 * @Title: Trade
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/5/28 23:51
 */
public class WxTrade {
    private BigDecimal tradeAmout;

    private String tradeNo;

    private BigDecimal userAmout;

    public BigDecimal getUserAmout() {
        return userAmout;
    }

    public void setUserAmout(BigDecimal userAmout) {
        this.userAmout = userAmout;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public BigDecimal getTradeAmout() {
        return tradeAmout;
    }

    public void setTradeAmout(BigDecimal tradeAmout) {
        this.tradeAmout = tradeAmout;
    }
}
