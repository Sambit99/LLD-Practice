package com.practice.lld.DesignPattern.Behavioral.ObserverPattern.Observer;


import com.practice.lld.DesignPattern.Behavioral.ObserverPattern.Observable.StocksObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver {
    String email;
    StocksObservable observable;

    public EmailAlertObserverImpl(String emailId, StocksObservable observable) {
        this.email = emailId;
        this.observable = observable;
    }

    @Override
    public void update(){
        sendEmail(email, "Hello World");
    }

    public  void sendEmail(String emailId, String message){
        System.out.println("Email sent to " + emailId);
    }
}
