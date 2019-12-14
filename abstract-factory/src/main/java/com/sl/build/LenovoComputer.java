package com.sl.build;

/**
 * @author shuliangzhao
 * @Title: LenovoComputer
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/5/29 22:49
 */
    public class LenovoComputer extends ComputerModel {
    @Override
    protected void productScreen() {
        System.out.println("联想电脑组装屏幕");
    }

    @Override
    protected void productMouse() {
        System.out.println("联想电脑组装鼠标");
    }

    @Override
    protected void productKeyboard() {
        System.out.println("联想电脑组装键盘");
    }

    @Override
    protected void productHardDisk() {
        System.out.println("联想电脑组装硬盘");
    }
}
