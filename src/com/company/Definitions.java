package com.company;
import java.util.*;
public class Definitions {
    private static HashMap<String, String> termsDefin = new HashMap<>();

    static {
        termsDefin.put("Parameter", "Input for a method call");
        termsDefin.put("Hashmap", "A collection type that accesses a value through a key");
        termsDefin.put("For-each Loop", "A loop that iterates per item in list");
        termsDefin.put("While Loop", "A loop that iterates as long as condition is true");
        termsDefin.put("Bit", "Smallest measurement of data");
        termsDefin.put("Array", "A list of values that can be both exclusive or all inclusive");
        termsDefin.put("String", "Object that holds a string of characters together");
        termsDefin.put("Int", "Primitive data type that can hold any number from -32,768 - 32,767");
    }

    public static String findAnswer(String input) {
        for (String term : termsDefin.keySet()) {
            if (termsDefin.get(term) == input) {
                return term;
            }
        }
        return "false";
    }

    public static boolean checkAnswer(String input) {
        for (String term : termsDefin.keySet()) {
            if (term == input) {
                return true;
            }
        }
        return false;
    }

    public static void copy(ArrayList<String> string1, ArrayList<String> string2) {
        for (String words : termsDefin.keySet()) {
            string1.add(words);
            string2.add(termsDefin.get(words));
        }
    }
}