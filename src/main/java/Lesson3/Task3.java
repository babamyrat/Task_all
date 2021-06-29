package Lesson3;

import java.util.Random;
import java.util.Scanner;

public class Task3 {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    static  final int TRIES = 5;

    public static void main(String[] args){
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear",
                "pepper", "pineapple", "pumpkin", "potato"};

        System.out.println("Please enter the word >>>");
        int numberAI = random.nextInt(words.length);

        for (int i = 0; i < TRIES; i++){
            System.out.println("Guess the name");

            String answer = scanner.next();

            if (answer.equals(words[numberAI])){
                System.out.println("You won!!!");
                break;
            } else {
                String str = words[numberAI];
                char a = str.charAt(0);
                System.out.println(a+"...?");

            }

        }



    }
}
