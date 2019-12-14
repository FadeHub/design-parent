package com.sl.proxy;

/**
 * @author shuliangzhao
 * @Title: ApplePhone
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/5/30 23:07
 */
public class ApplePhone implements Phone {

    @Override
    public void assemblyScreen() {
        System.out.println("安装屏幕！");
    }

    @Override
    public void battery() {
        System.out.println("安装电池！");
    }

    @Override
    public void software() {
        System.out.println("调试软件！");
    }
}
