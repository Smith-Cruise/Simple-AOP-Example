package test;

import annotation.Aspect;
import proxy.MainProxy;

/**
 * Created by Smith on 2017/4/25.
 */
@Aspect(People.class)
public class FirstProxy extends MainProxy {
    @Override
    public void before() {
        System.out.println("before");
    }

    @Override
    public void after() {
        System.out.println("after");
    }
}
