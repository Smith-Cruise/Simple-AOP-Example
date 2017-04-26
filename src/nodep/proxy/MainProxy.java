package nodep.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Smith on 2017/4/26.
 */
public abstract class MainProxy implements Proxy, InvocationHandler {
    private Object origin;

    public final void setOrigin(Object obj) {
        this.origin = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object result = method.invoke(origin, args);
        after();
        return result;
    }
}
