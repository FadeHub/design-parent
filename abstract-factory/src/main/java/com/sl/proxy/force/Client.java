package com.sl.proxy.force;

/**
 * @author shuliangzhao
 * @Title: Client
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/5/30 23:58
 */
public class Client {

    public static void main(String[] args) {
        //场景一
        System.out.println("=================场景一=============");
        ForcePhone forcePhone = new ForceApplePhone("富士康");
        ForcePhone proxyForcePhone = new ForceProxyPhoneFactory(forcePhone);
        proxyForcePhone.assemblyScreen();
        proxyForcePhone.battery();
        proxyForcePhone.software();
        System.out.println("++++++++++++++++++++++++++++++++++");
        //场景二
        System.out.println("=================场景二=============");
        ForcePhone forcePhone1 = new ForceApplePhone("富士康");
        forcePhone1.assemblyScreen();
        forcePhone1.battery();
        forcePhone1.software();
        System.out.println("+++++++++++++++++++++++++++++++++++");
        //场景三
        System.out.println("=================场景三=============");
        ForcePhone forcePhone2 = new ForceApplePhone("富士康");
        ForcePhone porxy = forcePhone2.getPorxy();
        porxy.assemblyScreen();
        porxy.battery();
        porxy.software();
    }
}
