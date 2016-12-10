package com.guoyang.composite.menu;

import java.util.Iterator;

/**
 * Created by L'Accordeur on 2016/12/3.
 */
public class NullIterator implements Iterator {
    public boolean hasNext() {
        return false;
    }

    public Object next() {
        return null;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
