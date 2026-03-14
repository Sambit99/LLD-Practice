package com.practice.lld.DesignPattern.Behavioral.ObserverPattern.Observable;


import com.practice.lld.DesignPattern.Behavioral.ObserverPattern.Observer.NotificationAlertObserver;

public interface StocksObservable {
    void add(NotificationAlertObserver observer);
    void remove(NotificationAlertObserver observer);
    void notifyObservers();
    void setStockCount(int stockCount);
    int getStockCount();
}
