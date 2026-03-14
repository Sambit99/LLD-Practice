package com.practice.lld.DesignPattern.Behavioral.ObserverPattern.Observer;


import com.practice.lld.DesignPattern.Behavioral.ObserverPattern.Observable.StocksObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver {
    String username;
    StocksObservable observable;

    public MobileAlertObserverImpl(String email, StocksObservable observable) {
        this.observable = observable;
        this.username = email;
    }

    @Override
    public void update(){
        sendMsgOnMobile(username, "Hello World");
    }

    public  void sendMsgOnMobile(String username, String message){
        System.out.println("Message sent to " + username);
    }

}
