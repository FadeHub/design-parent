package com.sl.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author shuliangzhao
 * @Title: DynamicPorxy
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/5/31 0:36
 */
public class DynamicPorxy<T> {

    public static <T> T newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler handler){
        //执行目标，并返回结果
        return (T)Proxy.newProxyInstance(loader,interfaces, handler);
    }
}
