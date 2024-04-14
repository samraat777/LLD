package com.sam.java.FileSystem_CompositeDesignPattern;

public class Main {
    public static void main(String[] args) {
        Directory movieDirectory = new Directory("Movie");

        FileSystem DDLJ = new File("DDLJ");
        movieDirectory.add(DDLJ);

        Directory marvel = new Directory("MARVEL");

        File IRONMAN = new File("IRONMAN");
        File CAPTAIN_AMERICA = new File("CAPTAIN_AMERICA");
        marvel.add(IRONMAN);
        marvel.add(CAPTAIN_AMERICA);


        movieDirectory.add(marvel);

        movieDirectory.ls();
        DDLJ.ls();

    }
}
