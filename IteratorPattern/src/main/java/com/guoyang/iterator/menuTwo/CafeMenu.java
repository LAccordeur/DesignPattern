package com.guoyang.iterator.menuTwo;

import java.util.Hashtable;
import java.util.Iterator;

/**
 * Created by L'Accordeur on 2016/12/3.
 */
public class CafeMenu implements Menu {
    Hashtable menuItems = new Hashtable();

    public CafeMenu() {
        addItem("Veggie burger and Air Fries","Veggie burger on a whole wheat bun,lettuce,tomato,and fries",true,3.99);
        addItem("Soup of the day","A cup of the soup of the day,with a side salad",false,3.69);
    }

    public void addItem(String name,String description,boolean vegetarian,double price) {
        MenuItem menuItem = new MenuItem(name,description,vegetarian,price);
        menuItems.put(menuItem.getName(),menuItem);
    }

    public Iterator createIterator() {
        return menuItems.values().iterator();
    }
}
