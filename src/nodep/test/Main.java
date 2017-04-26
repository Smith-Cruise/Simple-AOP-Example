package nodep.test;

import nodep.factory.Factory;

/**
 * Created by Smith on 2017/4/26.
 */
public class Main {
    public static void main(String[] args) {
        NoDepProxy noDepProxy = new NoDepProxy();
        noDepProxy.setOrigin(new People());
        PeopleInterface people = (PeopleInterface) Factory.getInstance(noDepProxy);
        people.eat();
        people.sleep();
    }
}
