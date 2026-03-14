package com.practice.lld.DesignPattern.Behavioral.ObserverPattern.Observable;


import com.practice.lld.DesignPattern.Behavioral.ObserverPattern.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IPhoneObservableImpl implements StocksObservable{
    List<NotificationAlertObserver> observersList = new ArrayList<>();
    public int stockCount = 0;

    @Override
    public void add(NotificationAlertObserver observer) {
        observersList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer){
        observersList.remove(observersList.remove(observer));
    }

    @Override
    public void notifyObservers() {
        for (NotificationAlertObserver observer : observersList) {
            observer.update();
        }
    }

    @Override
    public void setStockCount(int  newStockAdded) {
        if(stockCount == 0){
            notifyObservers();
        }
        stockCount += newStockAdded;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
