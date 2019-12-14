package com.sl.factorystrategy;

/**
 * @author shuliangzhao
 * @Title: StrategyEnum
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/5/29 0:00
 */
public enum  StrategyEnum {

    BlanceDeduction("com.sl.factorystrategy.BlanceDeduction"),
    IdCardDeduction("com.sl.factorystrategy.IdCardDeduction");
    String value = "";
    private StrategyEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
