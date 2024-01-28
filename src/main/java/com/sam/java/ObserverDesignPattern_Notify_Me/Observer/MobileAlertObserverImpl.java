package com.sam.java.ObserverDesignPattern_Notify_Me.Observer;

import com.sam.java.ObserverDesignPattern_Notify_Me.Observable.StocksObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{
    String userName;
    String userDevice;
    StocksObservable observable;

    public MobileAlertObserverImpl(String userName,StocksObservable observable)
    {
        this.userName = userName;
        this.observable= observable;
    }
    @Override
    public void update(String userDevice) {
        String message= userDevice + " is in stock hurry up!!";
        sendMessageObMobile(userName,message);
    }

    private void sendMessageObMobile(String userName,String message) {
        //System.out.println(s);
        System.out.println("message sent to user: " + userName + "----"+ message);
    }
}
