package com.company;
import java.util.HashMap;
import java.util.Scanner;


public class JavaTrainer {

    private static Scanner sc = new Scanner(System.in);
    private static HashMap<String, String> definitions = new HashMap<>();

    static void javaTrainer() {
        definitions.put("class", "A class is the blueprint from which individual objects are created.");
        definitions.put("interface", "An interface is a special form of an abstract class which does not implement any methods.");
        definitions.put("inheritance", "is the process where one class acquires the properties(methods and fields) of another, thus becoming a sub-class from that parent class.");
        definitions.put("encapsulation", "is the mechanism of wrapping the data (variables) and the code acting on that data(methods) together as a single unit.\nEncapsulation is one of the 4 fundamental OOP concepts.");
        definitions.put("method signature", "A method signature is the part of the method declaration that has the method's name and number and its type parameters.");
        definitions.put("instance variable", "An instance variable is a variable defined in a class, for which each instantiated object of the class has a separate copy.");

        System.out.println("This is Java Trainer 1.0.");
        System.out.println("\nHere is the Word Bank:\n");
        System.out.println("Class\nInterface\nInheritance\nEncapsulation\nMethod Signature\nInstance Variable\n");
        System.out.println("Type in a Java term you would like to learn more about:");

        String input = sc.nextLine().toLowerCase();

        while (!input.equals("quit")) {
            if (!definitions.containsKey(input)) {
                System.out.println("That's not a valid word...\nEnter a valid word:");
                input = sc.nextLine().toLowerCase();
            } else {
                System.out.println(input + ": " + definitions.get(input));
                System.out.println("\nEnter a new word or type 'Quit' to exit: ");
                input = sc.nextLine().toLowerCase();
            }
        } if (input.equals("quit")) {
            System.out.println("Thanks for playing!");
            System.out.println("Now you can take the quiz below: ");
        }
    }

}