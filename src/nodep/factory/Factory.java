package nodep.factory;

import nodep.annotation.Aspect;
import nodep.proxy.MainProxy;

import java.lang.reflect.Proxy;

/**
 * Created by Smith on 2017/4/26.
 */
public class Factory {
    public static Object getInstance(MainProxy mainProxy) {
        Aspect aspect = mainProxy.getClass().getAnnotation(Aspect.class);
        Class<?> cls = aspect.value();
        return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), cls.getInterfaces(), mainProxy);
    }
}
