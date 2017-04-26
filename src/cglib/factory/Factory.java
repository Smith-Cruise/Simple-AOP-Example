package cglib.factory;

import cglib.annotation.Aspect;
import net.sf.cglib.proxy.Enhancer;
import cglib.proxy.MainProxy;

/**
 * Created by Smith on 2017/4/25.
 */
public class Factory {
    private static Enhancer enhancer = new Enhancer();

    public static Object getInstance(MainProxy mainProxy) {
        Class<?> cls = mainProxy.getClass().getAnnotation(Aspect.class).value();
        enhancer.setSuperclass(cls);
        enhancer.setCallback(mainProxy);
        return enhancer.create();
    }
}
