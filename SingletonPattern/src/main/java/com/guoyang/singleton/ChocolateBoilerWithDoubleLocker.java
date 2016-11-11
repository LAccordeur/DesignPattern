package com.guoyang.singleton;

/**
 * Created by L'Accordeur on 2016/11/11.
 */
public class ChocolateBoilerWithDoubleLocker {

    private boolean empty;
    private boolean boiled;
    private static ChocolateBoilerWithDoubleLocker uniqueInstance;

    private ChocolateBoilerWithDoubleLocker() {
        empty = true;
        boiled = false;
    }

    public static synchronized ChocolateBoilerWithDoubleLocker getInstanse() {
        if (uniqueInstance == null) {
            uniqueInstance = new ChocolateBoilerWithDoubleLocker();
        }
        return uniqueInstance;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            empty = true;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }

}
