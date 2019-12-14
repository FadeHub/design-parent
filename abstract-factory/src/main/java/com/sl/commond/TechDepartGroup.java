package com.sl.commond;

/**
 * @author shuliangzhao
 * @Title: TechDepartGroup
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/6/4 21:39
 */
public class TechDepartGroup extends Group {
    @Override
    public void add() {
        System.out.println("技术部增加需求");
    }

    @Override
    public void del() {
        System.out.println("技术部删除需求");
    }

    @Override
    public void change() {
        System.out.println("技术部修改需求");
    }

    @Override
    public void plan() {
        System.out.println("技术部变更需求");
    }
}
