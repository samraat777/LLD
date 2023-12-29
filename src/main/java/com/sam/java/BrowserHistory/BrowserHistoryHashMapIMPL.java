package com.sam.java.BrowserHistory;

import java.sql.SQLOutput;
import java.util.HashMap;

/*
Logic is we add website with incremental index
0 to max
when we visit any new website make max = curr+1----> max will be changed everytime new webite visit curr+1
so that we can move from 0 to max to find back and forward
logic here is we are limiting elements rather than removing it
 */
public class BrowserHistoryHashMapIMPL {
        HashMap<Integer,String> websiteOrder = new HashMap<>();
        int max = 0;
        int current = 0;
        public BrowserHistoryHashMapIMPL(String homepage) {
            current = 1;
            max = 1;
            websiteOrder.put(current,homepage);
        }

        public void visit(String url) {
            max = current+1;
            current = max;
            System.out.println("=================New Website visited - " + url+ "=================");
            websiteOrder.put(max,url);
            System.out.println("===================================");
            System.out.println("Website order");
            for(int i : websiteOrder.keySet())
            {
                if(i<=max)
                System.out.println(i + " -- " + websiteOrder.get(i));
                else
                    break;
            }
            System.out.println();
        }

        public String back(int steps) {
            if(current - steps < 1)
            {
                current = 1;
            }
            else{
                current = current - steps;
            }
            System.out.println("Moved back " + steps);
            System.out.println("++++++++++++++++Current Website -" +websiteOrder.get(current)+ "+++++++++++++" );
            System.out.println("Website order");
            for(int i : websiteOrder.keySet())
            {
                if(i<=max)
                System.out.println(i + " -- " + websiteOrder.get(i));
                else
                    break;
            }
            System.out.println();
            return websiteOrder.get(current);
        }

        public String forward(int steps) {
            if(current + steps > max )
            {
                current = max;
            }
            else{
                current = current + steps;
            }

            System.out.println("Moved forward " + steps);
            System.out.println("++++++++++++++++Current Website -" +websiteOrder.get(current)+ "+++++++++++++" );
            System.out.println("Website order");
            for(int i : websiteOrder.keySet())
            {
                if(i<=max)
                    System.out.println(i + " -- " + websiteOrder.get(i));
                else
                    break;
            }
            System.out.println();
            return websiteOrder.get(current);
        }

}
