package cglib.test;

import cglib.factory.Factory;

/**
 * Created by Smith on 2017/4/25.
 */
public class Main {
    public static void main(String[] args) {
        CGLIBProxy cglibProxy = new CGLIBProxy();
        People people = (People) Factory.getInstance(cglibProxy);
        people.eat();
        people.sleep();
    }
}
