package com.sam.java.Memento_Snapshot_DesignPattern;

public class Client {
    public static void main(String[] args) {
        ConfigurationCaretaker configurationCaretaker = new ConfigurationCaretaker();

        //initiate State of the originator
        ConfigurationOriginator originatorObject = new ConfigurationOriginator(5,10);

        //saving Snapshot
        ConfigurationMemento snapshot1 = originatorObject.createMemento();

        //add it to history
        configurationCaretaker.addMemento(snapshot1);

        //Changes in state
        originatorObject.setHeight(10);
        originatorObject.setWidth(20);

        //Saving SNapshot
        ConfigurationMemento snapshot2 = originatorObject.createMemento();

        //adding to history
        configurationCaretaker.addMemento(snapshot2);

        //Changes in state
        originatorObject.setHeight(20);
        originatorObject.setWidth(30);


        //UNDO
        ConfigurationMemento restorestateMomento = configurationCaretaker.undo();
        originatorObject.restoreMemento(restorestateMomento);



        System.out.println("Restored to last Snapshot version \nHeight: " + originatorObject.height +" width: " + originatorObject.width);
    }
}
