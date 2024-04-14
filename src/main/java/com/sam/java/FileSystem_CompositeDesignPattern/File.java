package com.sam.java.FileSystem_CompositeDesignPattern;

public class File implements FileSystem{
    String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void ls() {
        System.out.println("File name "+ name);
    }

    public void setName(String name) {
        this.name = name;
    }
}
