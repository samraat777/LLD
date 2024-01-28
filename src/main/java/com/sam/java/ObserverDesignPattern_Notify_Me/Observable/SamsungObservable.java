package com.sam.java.ObserverDesignPattern_Notify_Me.Observable;

import com.sam.java.ObserverDesignPattern_Notify_Me.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class SamsungObservable implements StocksObservable{
    public List<NotificationAlertObserver> observerList = new ArrayList<>();
    public int stockCount = 0;
    public String userDevice = "Samsung";

    @Override
    public void addObserver(NotificationAlertObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for(NotificationAlertObserver observer: observerList)
        {
            observer.update(userDevice);
        }
    }

    @Override
    public void setStockCount(int newStockAdded) {
        if(stockCount == 0)
        {
            notifySubscribers();
        }
        stockCount = newStockAdded;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
