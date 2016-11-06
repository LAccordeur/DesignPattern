package com.guoyang.weather;


/**
 * Created by L'Accordeur on 2016/11/6.
 */
public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObserver();
}


