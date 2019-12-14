package com.sl.commond.modify;

/**
 * @author shuliangzhao
 * @Title: Client
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/6/4 22:02
 */
public class Client {

    public static void main(String[] args) {
        Invoker invoker = new Invoker(new AddAdminDepartGroup());
        invoker.action();
    }
}
