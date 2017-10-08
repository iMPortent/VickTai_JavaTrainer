package com.company;
import java.util.*;
public class WordBank {
    private static ArrayList<String> terms = new ArrayList(),definitions = new ArrayList();
    private static Definitions myDictionary = new Definitions();
    private static void initTermsAndDef(){
        myDictionary.copy(terms,definitions);
    }
    public WordBank(){initTermsAndDef();}
    public static String getQuestion(){
        Random random = new Random();
        String questionField = definitions.get(random.nextInt(definitions.size() - 1));
        definitions.remove(questionField);
        return questionField;
    }
    public static void getAnswers(String question, ArrayList<String> answerChoice){
        answerChoice.clear();
        answerChoice.add(Definitions.findAnswer(question));
        Random random = new Random();
        while(answerChoice.size()<5){
            answerChoice.add(terms.get(random.nextInt(terms.size()-1)));
        }
    }
}