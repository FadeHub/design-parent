package com.sl.proxy.force;

/**
 * @author shuliangzhao
 * @Title: ForceProxyPhoneFactory
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/5/30 23:53
 */
public class ForceProxyPhoneFactory implements ForcePhone {

    private ForcePhone forcePhone;
    public ForceProxyPhoneFactory(ForcePhone forcePhone) {
        this.forcePhone = forcePhone;
    }

    @Override
    public void assemblyScreen() {
        forcePhone.assemblyScreen();
    }

    @Override
    public void battery() {
        forcePhone.battery();
    }

    @Override
    public void software() {
        forcePhone.software();
    }

    @Override
    public ForcePhone getPorxy() {
        return this;
    }
}
