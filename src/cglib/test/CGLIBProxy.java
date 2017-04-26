package cglib.test;

import cglib.annotation.Aspect;
import cglib.proxy.MainProxy;

/**
 * Created by Smith on 2017/4/25.
 */
@Aspect(People.class)
public class CGLIBProxy extends MainProxy {
    @Override
    public void before() {
        System.out.println("before");
    }

    @Override
    public void after() {
        System.out.println("after");
    }
}
