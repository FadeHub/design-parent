package com.sl.proxy.ordiany;

import com.sl.proxy.Phone;

/**
 * @author shuliangzhao
 * @Title: OrdianyProxyPhoneFactory
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/5/30 23:33
 */
public class OrdianyProxyPhoneFactory implements Phone {

    private Phone phone = null;

    public OrdianyProxyPhoneFactory(String name) {
        try {
            phone = new OrdianyApplePhone(this,name);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void assemblyScreen() {
        phone.assemblyScreen();
    }

    @Override
    public void battery() {
        phone.battery();
    }

    @Override
    public void software() {
        phone.software();
    }
}
