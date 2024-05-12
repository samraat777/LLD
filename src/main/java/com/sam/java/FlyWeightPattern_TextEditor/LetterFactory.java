package com.sam.java.FlyWeightPattern_TextEditor;

import java.util.HashMap;
import java.util.Map;

public class LetterFactory {
    private static Map<Character,ILetter> characterIletterMap = new HashMap<>();

    public static ILetter createLetter(char charValue)
    {
        if(characterIletterMap.containsKey(charValue)){
            return characterIletterMap.get(charValue);
        }
        else {
            DocumentCharacter characterObj = new DocumentCharacter(charValue,"Arial",10);
            return characterObj;
        }
    }
}
