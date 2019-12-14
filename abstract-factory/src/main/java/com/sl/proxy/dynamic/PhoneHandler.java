package com.sl.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author shuliangzhao
 * @Title: PhoneHandler
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/5/31 0:13
 */
public class PhoneHandler implements InvocationHandler {

    //被代理的实例
    private Object obj = null;
    //我要代理谁
    public PhoneHandler(Object obj){
        this.obj = obj;
    }

    //调用被代理的方法
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(this.obj, args);
        //return invoke;
    }
}
