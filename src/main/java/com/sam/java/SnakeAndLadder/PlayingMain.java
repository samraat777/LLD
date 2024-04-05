package com.sam.java.SnakeAndLadder;

import java.util.*;

public class PlayingMain {


    public static void main(String[] args) {
        Grid grid =  new Grid(10,10);
        List<Cell> cells = grid.createCells(10,10);
        int cellStart = 0;
        int cellEnd = 99;
        User user1 = new User("Samraat",0);
        User user2 = new User("Sonu",0);
        User user3 = new User("Swarnim",0);
        Dice dice = new Dice();
        //Used Deque to maintain turns of users
        Deque<User> userOrder = new LinkedList<>();
        userOrder.addFirst(user3);
        userOrder.addFirst(user2);
        userOrder.addFirst(user1);


//        for(User u : userOrder)
//        {
//            System.out.println(u.userName);
//        }


        //Caching
        HashMap<Integer,Integer> wiz = new HashMap<>();
        wiz.put(4,99);
        wiz.put(30,2);
        wiz.put(3,98);
        wiz.put(77,22);
        wiz.put(33,88);
        wiz.put(1,99);
        wiz.put(2,87);
        wiz.put(3,99);
        wiz.put(5,55);
        wiz.put(6,45);



        //List<Cell> cells = grid.getCells();

        //We can iterate over keyset only
        for(int i : wiz.keySet())
        {
            Wizard wizard = new Wizard(i,wiz.get(i));
            cells.get(i).setWizard(wizard);

        }
        for(Cell cell: cells)
        {
           // System.out.println(cell.wizard.start + " " + cell.wizard.end);
        }

        int currentPos = cellStart;
        User playingUser = userOrder.getFirst();

        while(currentPos != cellEnd )
        {
            playingUser = userOrder.getFirst();
            currentPos = userOrder.peek().currentPosition;
            int moveBy = dice.play();
           // System.out.println(moveBy);
            //Move by current number
            currentPos += moveBy;
            boolean check = false;
            //Check Wizard
            while(currentPos < 100 && cells.get(currentPos).hasWizard)
            {
                currentPos = cells.get(currentPos).getWizard().end;
                playingUser.setCurrentPosition(currentPos);
               // boolean check = false;
                if(currentPos == cellEnd){
                    playingUser.score = playingUser.score + 1;
                    System.out.println(playingUser.userName + " has won ");
                    playingUser.setCurrentPosition(1);
                    check = true;
                }

            }


            //move by dice outcome
            //currentPos += moveBy;

            //Winning Condition met
            if(currentPos >= cellEnd && !check)
            {
                playingUser.score = playingUser.score + 1;
                System.out.println(playingUser.userName + " has won ");
                playingUser.setCurrentPosition(1);
                break;
            }
            playingUser.setCurrentPosition(currentPos);

            //Change User -- Deque and pop current user and add at last
            User user = userOrder.peek();
            userOrder.pollFirst();
            userOrder.addLast(user);

//            for(int i : wiz.keySet())
//            {
//                cells.get(i).setWizard(i,wiz.get(i));
//            }
        }

    }
}
