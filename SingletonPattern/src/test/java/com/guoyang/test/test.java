package com.guoyang.test;

import com.guoyang.singleton.ChocolateBoiler;

/**
 * Created by L'Accordeur on 2016/11/11.
 */
public class Test {

    public void test() {
        ThreadThree threadOne = new ThreadThree();
        ThreadFour threadTwo = new ThreadFour();
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.test();
    }

}

class ThreadThree{
    public ThreadThree() {
        ChocolateBoiler chocolateBoiler = ChocolateBoiler.getInstanse();
        System.out.println(chocolateBoiler);
    }
}

class ThreadFour{
    public ThreadFour() {
        ChocolateBoiler chocolateBoiler = ChocolateBoiler.getInstanse();
        System.out.println(chocolateBoiler);
    }
}
