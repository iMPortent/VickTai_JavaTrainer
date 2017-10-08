package com.company;

import java.util.Scanner;

public class Main {

    public static Quiz JavaTracker = new Quiz();

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Hi, welcome to Java Master 1.0!\nPlease enter your name to start: ");
        String name = sc.nextLine();
        System.out.println("Welcome, " + name + "! Please choose one of the following two options: \n1. Java Trainer\n2. Java Quiz");

        while (sc.hasNext()) {
            int input = sc.nextInt();
            if(input == 1) {
                JavaTrainer.javaTrainer();
                JavaTracker.takeQuiz();
                break;
            } else if(input == 2){
                JavaTracker.takeQuiz();
                JavaTrainer.javaTrainer();
                break;
            } else {
                System.out.println("This is not an option. Please choose either 1 or 2: ");
            }

        }

    }
}