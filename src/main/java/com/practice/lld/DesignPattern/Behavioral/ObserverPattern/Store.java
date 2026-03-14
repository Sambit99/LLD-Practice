package com.practice.lld.DesignPattern.Behavioral.ObserverPattern;


import com.practice.lld.DesignPattern.Behavioral.ObserverPattern.Observable.IPhoneObservableImpl;
import com.practice.lld.DesignPattern.Behavioral.ObserverPattern.Observable.StocksObservable;
import com.practice.lld.DesignPattern.Behavioral.ObserverPattern.Observer.EmailAlertObserverImpl;
import com.practice.lld.DesignPattern.Behavioral.ObserverPattern.Observer.MobileAlertObserverImpl;
import com.practice.lld.DesignPattern.Behavioral.ObserverPattern.Observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args) {
        StocksObservable iphoneStockObservable =  new IPhoneObservableImpl();

        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("abc@xyz.com", iphoneStockObservable);
        NotificationAlertObserver observer2 = new MobileAlertObserverImpl("xyz_user", iphoneStockObservable);
        NotificationAlertObserver observer3 = new EmailAlertObserverImpl("abc@xyz.com", iphoneStockObservable);

        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);

        iphoneStockObservable.setStockCount(1);
    }
}
