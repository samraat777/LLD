package com.sam.java.FileSystem_CompositeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem{

    String directoryName;
    List<FileSystem> files;

    public Directory(String directoryName) {
        this.directoryName = directoryName;
        files = new ArrayList<>();
    }

    public void add(FileSystem fileSystem)
    {
        files.add(fileSystem);
    }

    @Override
    public void ls() {
        System.out.println("Directory name " + directoryName);

        for(FileSystem file: files)
        {
            file.ls();
        }
    }

}
