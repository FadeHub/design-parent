package com.sl.factorystrategy;

/**
 * @author shuliangzhao
 * @Title: StrategyFactory
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/5/29 0:03
 */
public class StrategyFactory {

    public static Deduction getDeduction(StrategyEnum strategyEnum) {
        Deduction deduction = null;
        try {
            deduction = (Deduction)Class.forName(strategyEnum.getValue()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return deduction;
    }
}
