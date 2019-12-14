package com.sl.proxy;

/**
 * @author shuliangzhao
 * @Title: PorxyPhoneFactory
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/5/30 23:15
 */
public class PorxyPhoneFactory implements Phone {

    private Phone phone = null;

    public PorxyPhoneFactory(Phone phone) {
        this.phone = phone;
    }

    @Override
    public void assemblyScreen() {
        this.phone.assemblyScreen();
    }

    @Override
    public void battery() {
        this.phone.battery();
    }

    @Override
    public void software() {
        this.phone.software();
    }
}
