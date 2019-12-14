package com.sl.proxy.ordiany;

import com.sl.proxy.Phone;

/**
 * @author shuliangzhao
 * @Title: Client
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/5/30 23:36
 */
public class Client {

    public static void main(String[] args) {
        Phone phone = new OrdianyProxyPhoneFactory("富士康");
        phone.assemblyScreen();
        phone.battery();
        phone.software();
    }
}
