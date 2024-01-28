package com.sam.java.ObserverDesignPattern_Notify_Me;

import com.sam.java.ObserverDesignPattern_Notify_Me.Observable.IphoneObservable;
import com.sam.java.ObserverDesignPattern_Notify_Me.Observable.SamsungObservable;
import com.sam.java.ObserverDesignPattern_Notify_Me.Observable.StocksObservable;
import com.sam.java.ObserverDesignPattern_Notify_Me.Observer.EmailAlertObserverImpl;
import com.sam.java.ObserverDesignPattern_Notify_Me.Observer.MobileAlertObserverImpl;
import com.sam.java.ObserverDesignPattern_Notify_Me.Observer.NotificationAlertObserver;

public class Amazon {
    public static void main(String[] args) {
        System.out.println("Apple Users Notifying ");
        StocksObservable iphoneStockObservable = new IphoneObservable();

        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("xyz@gmail.com",iphoneStockObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("abc@gmail.com",iphoneStockObservable);
        NotificationAlertObserver observer3 = new MobileAlertObserverImpl("Samraat",iphoneStockObservable);

        iphoneStockObservable.addObserver(observer1);
        iphoneStockObservable.addObserver(observer2);
        iphoneStockObservable.addObserver(observer3);

        iphoneStockObservable.setStockCount(10);
        iphoneStockObservable.setStockCount(0);
        iphoneStockObservable.setStockCount(100);

        //Samsung User
        System.out.println("\nSamsung User Notifying ");
        StocksObservable samsungStockObervable = new SamsungObservable();
        NotificationAlertObserver observer4 = new EmailAlertObserverImpl("SamsungUser1@gmail.com",samsungStockObervable);
        NotificationAlertObserver observer5 = new EmailAlertObserverImpl("SamsungUser2@gmail.com",samsungStockObervable);
        NotificationAlertObserver observer6 = new MobileAlertObserverImpl("Mohit",samsungStockObervable);
        samsungStockObervable.addObserver(observer4);
        samsungStockObervable.addObserver(observer5);
        samsungStockObervable.addObserver(observer6);

        samsungStockObervable.setStockCount(10);
        samsungStockObervable.setStockCount(0);
        samsungStockObervable.setStockCount(100);

    }
}
