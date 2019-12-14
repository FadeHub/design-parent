package com.sl.proxy.dynamic;

/**
 * @author shuliangzhao
 * @Title: ApplePhone
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/5/30 23:07
 */
public class DynamicApplePhone implements DynamicPhone {

    private String name;
    public DynamicApplePhone(String name) {
        this.name = name;
    }

    @Override
    public void assemblyScreen() {
        System.out.println(name+"安装屏幕！");
    }

    @Override
    public void battery() {
        System.out.println(name+"安装电池！");
    }

    @Override
    public void software() {
        System.out.println(name+"调试软件！");
    }
}
