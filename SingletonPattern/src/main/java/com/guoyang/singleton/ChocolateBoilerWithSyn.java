package com.guoyang.singleton;

/**
 * Created by L'Accordeur on 2016/11/11.
 */
public class ChocolateBoilerWithSyn {
    private boolean empty;
    private boolean boiled;
    private static ChocolateBoilerWithSyn uniqueInstance;

    private ChocolateBoilerWithSyn() {
        empty = true;
        boiled = false;
    }

    public static synchronized ChocolateBoilerWithSyn getInstanse() {
        if (uniqueInstance == null) {
            uniqueInstance = new ChocolateBoilerWithSyn();
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