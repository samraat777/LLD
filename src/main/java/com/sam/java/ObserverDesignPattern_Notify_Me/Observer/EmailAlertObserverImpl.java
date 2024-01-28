package com.sam.java.ObserverDesignPattern_Notify_Me.Observer;

import com.sam.java.ObserverDesignPattern_Notify_Me.Observable.StocksObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{
    String emailId;
    StocksObservable observable;
    //String userDevice;

    public EmailAlertObserverImpl(String emailId,StocksObservable observable)
    {
        this.emailId = emailId;
        this.observable = observable;
    }
    @Override
    public void update(String userDevice) {
        String message = userDevice+ " is in stock hurry up!";
        sendEmail(emailId,message);
    }

    private void sendEmail(String emailId, String msg) {
        //System.out.println(msg);
        System.out.println("mail sent to: "+ emailId + "----"+ msg);
    }

}
