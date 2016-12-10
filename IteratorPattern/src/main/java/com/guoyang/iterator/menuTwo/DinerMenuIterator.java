package com.guoyang.iterator.menuTwo;


import java.util.Iterator;

/**
 * Created by L'Accordeur on 2016/12/3.
 */
public class DinerMenuIterator implements Iterator {
    MenuItem[] menuItems;
    int position = 0;

    public DinerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    public Object next() {
        MenuItem menuItem = menuItems[position];
        position++;

        return menuItem;
    }

    public void remove() {
        if (position <= 0) {
            throw new IllegalStateException();
        }
        if (menuItems[position -1] != null) {
            for (int i = position-1;i < (menuItems.length - 1);i++) {
                menuItems[i] = menuItems[i+1];
            }
            menuItems[menuItems.length-1] = null;
        }
    }

    public boolean hasNext() {
        if (position >= menuItems.length || menuItems[position] == null) {
            return false;
        } else {
            return true;
        }
    }
}
