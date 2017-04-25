package test;

import factory.Factory;

/**
 * Created by Smith on 2017/4/25.
 */
public class Main {
    public static void main(String[] args) {
        FirstProxy firstProxy = new FirstProxy();
        People people = (People) Factory.getInstance(firstProxy);
        people.eat();
        people.sleep();
    }
}
