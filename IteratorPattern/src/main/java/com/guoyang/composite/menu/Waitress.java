package com.guoyang.composite.menu;

/**
 * Created by L'Accordeur on 2016/12/3.
 */
public class Waitress {
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }
}
