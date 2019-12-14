package com.sl.build;

/**
 * @author shuliangzhao
 * @Title: Client
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/5/29 23:07
 */
public class Client {

    public static void main(String[] args) {
        Director director = new Director();
        //组装华为A系列10台
        for (int i = 0;i<2;i++) {
            director.getAHuaweiComputer().assemble();
        }
        //组装联想B系列10台
        for (int i=0;i<2;i++) {
            director.getBLenovoComputer().assemble();
        }
    }
}
