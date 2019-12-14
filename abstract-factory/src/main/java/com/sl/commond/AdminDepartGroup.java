package com.sl.commond;

/**
 * @author shuliangzhao
 * @Title: AdminDepartGroup
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/6/4 21:42
 */
public class AdminDepartGroup extends Group {
    @Override
    public void add() {
        System.out.println("行政部新增考勤规范");
    }

    @Override
    public void del() {
        System.out.println("行政部删除考勤规范");
    }

    @Override
    public void change() {
        System.out.println("行政部变更考勤规范");
    }

    @Override
    public void plan() {
        System.out.println("行政部执行新的考勤规范");
    }
}
