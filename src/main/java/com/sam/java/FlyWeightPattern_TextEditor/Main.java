package com.sam.java.FlyWeightPattern_TextEditor;

public class Main {
    public static void main(String[] args) {
        /*
        My name is Samraat Anand
        -- See we have repetative characters in above line, so without flyweight we had to create same object multiple times
         */
        ILetter object1 = LetterFactory.createLetter('a');
        object1.display(0,5);

        ILetter object2 = LetterFactory.createLetter('a');
        object2.display(0,13);
    }
}
