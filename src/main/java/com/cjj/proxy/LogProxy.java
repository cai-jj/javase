package com.cjj.proxy;

import com.sun.xml.internal.ws.api.model.MEP;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class LogProxy {
    //提供一个方法，生成被代理的对象
    public static Object getProxyObject(Object obj) {
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(),
                obj.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        Long startTime = System.currentTimeMillis();

                        Object res = method.invoke(obj, args);
                        long endTime = System.currentTimeMillis();
                        System.out.println("花费的时间:" +  (endTime - startTime));
                        return res;
                    }
                });
    }
}

