package com.sam.java.BrowserHistory;

import java.util.Stack;

public class BrowserHistory2StackIMPL {
    //Top of backhistory stack will be always where the current website be
    Stack<String> backHistory = new Stack<>();
    Stack<String> forwardHistory =  new Stack<>();

    public BrowserHistory2StackIMPL(String homepage) {
        backHistory.add(homepage);
    }

    public void visit(String url) {
    backHistory.add(url);
        System.out.println("++++++++Visiting new website+++++++++++");
    for(String str : backHistory)
    {
        System.out.println(str);
    }
    forwardHistory.clear();

        System.out.println("+++++++++++++++++++");
    }

    public String back(int steps) {
        System.out.println("++++++++Going Back "+ steps + "+++++++++++");
        while(steps>0 && backHistory.size()>1)
        {
            String currSite = backHistory.pop();
            forwardHistory.add(currSite);
            steps--;
        }
        for(String str : backHistory)
        {
            System.out.println(str);
        }
        System.out.println("+++++++++++++++++++");
        System.out.println(backHistory.peek());
        return backHistory.peek();
    }

    public String forward(int steps) {
        System.out.println("++++++++Going Forward "+ steps + "+++++++++++");
        //note here  forwardHistory.size()>0 not 1 as we answers always on backHistory top
        while(steps>0 && forwardHistory.size()>0)
        {
            String currSite = forwardHistory.pop();
            backHistory.add(currSite);
            steps--;
        }
        for(String str : forwardHistory)
        {
            System.out.println(str);
        }
        System.out.println("+++++++++++++++++++");
        System.out.println(forwardHistory.peek());
        return forwardHistory.peek();
    }
}
