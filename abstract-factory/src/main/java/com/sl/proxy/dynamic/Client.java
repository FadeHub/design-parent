package com.sl.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author shuliangzhao
 * @Title: Client
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/5/31 0:16
 */
public class Client {
    public static void main(String[] args) {
        DynamicPhone dynamicPhone = new DynamicApplePhone("富士康");
        InvocationHandler phoneHandler = new PhoneHandler(dynamicPhone);
        ClassLoader classLoader = dynamicPhone.getClass().getClassLoader();
        DynamicPhone o = (DynamicPhone) Proxy.newProxyInstance(classLoader, dynamicPhone.getClass().getInterfaces(), phoneHandler);
        o.assemblyScreen();
        o.battery();
        o.software();
    }
}
