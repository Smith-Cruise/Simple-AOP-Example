package nodep.test;

import nodep.annotation.Aspect;
import nodep.proxy.MainProxy;

/**
 * Created by Smith on 2017/4/26.
 */
@Aspect(People.class)
public class NoDepProxy extends MainProxy {
    @Override
    public void before() {
        System.out.println("before");
    }

    @Override
    public void after() {
        System.out.println("after");
    }
}
