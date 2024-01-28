package com.sam.java.ObserverDesignPattern_Notify_Me.Observable;

import com.sam.java.ObserverDesignPattern_Notify_Me.Observer.NotificationAlertObserver;

public interface StocksObservable {
    public void addObserver(NotificationAlertObserver observer);
    public void remove(NotificationAlertObserver observer);
    public void notifySubscribers();
    public void setStockCount(int newStockAdded);
    public int getStockCount();
}
