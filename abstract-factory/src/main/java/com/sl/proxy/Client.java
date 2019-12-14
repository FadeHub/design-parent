package com.sl.proxy;

/**
 * @author shuliangzhao
 * @Title: Client
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/5/30 23:16
 */
public class Client {

    public static void main(String[] args) {
        Phone phone = new ApplePhone();
        Phone proxyPhone = new PorxyPhoneFactory(phone);
        proxyPhone.assemblyScreen();
        proxyPhone.battery();
        proxyPhone.software();
    }
}
