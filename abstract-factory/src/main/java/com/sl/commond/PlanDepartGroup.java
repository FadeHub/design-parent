package com.sl.commond;

/**
 * @author shuliangzhao
 * @Title: PlanDepartGroup
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/6/4 21:41
 */
public class PlanDepartGroup extends Group {
    @Override
    public void add() {
        System.out.println("策划部新增策划方案");
    }

    @Override
    public void del() {
        System.out.println("策划部删除策划方案");
    }

    @Override
    public void change() {
        System.out.println("策划部修改策划方案");
    }

    @Override
    public void plan() {
        System.out.println("策划部变更策划方案");
    }
}
