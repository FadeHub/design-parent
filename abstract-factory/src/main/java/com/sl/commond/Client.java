package com.sl.commond;

/**
 * @author shuliangzhao
 * @Title: Client
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/6/4 21:45
 */
public class Client {

    public static void main(String[] args) {
        System.out.println("======老板给行政组下发任务==========");
        AdminDepartGroup adminDepartGroup = new AdminDepartGroup();
        adminDepartGroup.add();
        adminDepartGroup.change();
        adminDepartGroup.del();
    }
}
