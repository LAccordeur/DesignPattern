package com.guoyang.adapter;

import java.util.Enumeration;
import java.util.Iterator;


/**
 * Created by L'Accordeur on 2016/12/2.
 */
public class EnumeratorIterator implements Iterator{
    Enumeration enumeration;

    public EnumeratorIterator(Enumeration enumeration) {
        this.enumeration = enumeration;
    }

    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    public Object next() {
        return enumeration.nextElement();
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }


}
