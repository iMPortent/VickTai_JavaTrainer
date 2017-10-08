package com.company;
import java.util.*;
public  class Quiz {
    private static WordBank wordBank = new WordBank();
    private static int score=100;
    public static void takeQuiz(){
        int x = 0;
        Scanner scanner = new Scanner(System.in);
        while(score>0&&x<7) {
            prepQnA();
            String input = scanner.nextLine();
            if(input.toLowerCase().equals(Question.getRightAnswer().toLowerCase())){
                System.out.println("At 'em boy!");
            } else {
                System.out.println("Wrong!");
                System.out.println("Your remaining score is: " + (score-=20) + "\n");
            }
        }
    }
    public static void prepQnA(){
        Question.setQuestion();
        Question.getQuestion();
        Question.getAnswers();
    }
    private static class Question {
        private static String question="";
        private static ArrayList<String> answers = new ArrayList();
        private static String rightAnswer ="";
        public static void setRightAnswer(String rAnswer){
            rightAnswer = rAnswer;
        }
        public static void setQuestion(){
            question = WordBank.getQuestion();
            WordBank.getAnswers(question,answers);
            setRightAnswer(Definitions.findAnswer(question));}
        //public static void clearAnswers(){answers.clear();}
        public static void getQuestion(){System.out.println(question);}
        public static void getAnswers() {
            for(int i = 0; i < answers.size()-1;i++){
                System.out.println(answers.get(i));
            }
        }
        public static String getRightAnswer(){
            return rightAnswer;
        }
    }
}