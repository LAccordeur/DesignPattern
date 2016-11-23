package com.guoyang.util;

/**
 * Created by L'Accordeur on 2016/11/23.
 */
public class Stack {
    Object[] objects;
    int index;
    int length;

    public Stack(int length) {
        objects = new Object[length];
        index = -1;
        this.length = length;
    }

    public boolean isEmpty() {
        if (index != -1) {
            return false;
        }
        return true;
    }

    public boolean isFull() {
        if (index >= length-1) {
            return true;
        }
        return false;
    }

    public void push(Object object) {
        index = index + 1;
        objects[index] = object;
    }

    public Object pop() {

        return objects[index--];

    }

}
