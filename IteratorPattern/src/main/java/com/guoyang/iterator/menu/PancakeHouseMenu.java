package com.guoyang.iterator.menu;

import java.util.ArrayList;

/**
 * Created by L'Accordeur on 2016/12/3.
 */
public class PancakeHouseMenu {

    ArrayList menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList();

        addItem("K&B's Pancake Breakfast","With scrambled eggs and toast",true,2.99);
        addItem("Regular Pancake Breakfast","With fried eggs and sausage",false,2.99);
        addItem("Waffles","With your choice of blueberries or strawberries",true,3.59);
    }

    public void addItem(String name,String description,boolean vegetarian,double price) {
        MenuItem menuItem = new MenuItem(name,description,vegetarian,price);
        menuItems.add(menuItem);
    }

    public Iterator createIterator() {
        return new PancakeHouseIterator(menuItems);
    }
}
