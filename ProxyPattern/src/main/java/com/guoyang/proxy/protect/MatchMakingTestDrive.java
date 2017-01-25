package com.guoyang.proxy.protect;

import java.lang.reflect.Proxy;

/**
 * Created by L'Accordeur on 2017/1/24.
 */
public class MatchMakingTestDrive {

    public static void main(String[] args) {
        MatchMakingTestDrive matchMakingTestDrive = new MatchMakingTestDrive();
        matchMakingTestDrive.drive();
    }

    public void drive() {
        PersonBean joe = new PersonBeanImpl();
        PersonBean ownerProxy = getOwnerProxy(joe);
        ownerProxy.setInterests("tennis");
//        ownerProxy.setHotOrNotRating(10);
    }

    PersonBean getOwnerProxy(PersonBean person) {
        return (PersonBean) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new OwnerInvocationHandler(person)
        );
    }

    PersonBean getNonOwnerProxy(PersonBean person) {
        return (PersonBean) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new NonOwnerInvocationHandler(person)
        );
    }
}
