package com.sam.java.BrowserHistory;

public class BrowserHistoryMain {
    public static void main(String[] args) {
        //Stack Implementation
//        BrowserHistory2StackIMPL browserHistory = new BrowserHistory2StackIMPL("google");
//        browserHistory.visit("facebook");
//        browserHistory.visit("snapchat");
//        browserHistory.visit("instagram");
//        browserHistory.visit("youtube");
//
//        browserHistory.back(2);
//        browserHistory.forward(2);
//        browserHistory.back(10);
//        browserHistory.forward(10);
//        browserHistory.back(10);
//        browserHistory.visit("linkedin");
//        browserHistory.back(3);
//        browserHistory.forward(10);

        //HashMap implementation
        BrowserHistoryHashMapIMPL browserHistory2 = new BrowserHistoryHashMapIMPL("google");
        browserHistory2.visit("facebook");
        browserHistory2.visit("snapchat");
        browserHistory2.visit("instagram");
        browserHistory2.visit("youtube");

        browserHistory2.back(2);
        browserHistory2.forward(2);
        browserHistory2.back(10);
        browserHistory2.forward(10);
        browserHistory2.back(10);
        browserHistory2.visit("linkedin");
        browserHistory2.back(3);
        browserHistory2.forward(10);
    }
}
