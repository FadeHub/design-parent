package com.sl.chain;

/**
 * @author shuliangzhao
 * @Title: Client
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/6/11 23:29
 */
public class Client {


    public static void main(String[] args) {
        Handler boss = new Boss();
        Handler manager = new Manager();
        Handler groupLeader = new GroupLeader();
        boss.setHandler(manager);
        manager.setHandler(groupLeader);
        Employee employee = new Employee(6,"端午节回家");
        boss.handlerMessage(employee);
    }
}
