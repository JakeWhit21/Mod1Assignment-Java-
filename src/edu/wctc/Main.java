package edu.wctc;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	    Scanner keyboard = new Scanner(System.in);
        boolean quit;
        int userInput;


        do {
            System.out.println("Welcome to the Preference Quiz!");

            int score = quiz();

            System.out.println("Your score is: " + score);

            if(score == 3){
                System.out.println("You prefer a good balance in life.");
            } else if(score > 3) {
                System.out.println("You prefer life to be spontaneous and active.");
            } else
                System.out.println("You prefer life to be calm and organized.");


            System.out.println("Do you want to take the quiz again?");
            userInput = Integer.parseInt(keyboard.nextLine());

            while (userInput != 1 && userInput != 0){
                System.out.println("Invalid input, try typing a 1 or 0 (1 for yes, 0 for no).");
                System.out.println("Do you want to take the quiz again?");
                userInput = Integer.parseInt(keyboard.nextLine());
            }

            if(userInput == 1){
                quit = true;
            } else {
                quit = false;
            }

        }while (quit);



    }

    public static int quiz() {
        Scanner userInput = new Scanner(System.in);
        String choiceStringArray[] = {"mild or spicy", "tea or coffee", "breakfast or brunch", "summer or winter", "paper or plastic"};
        int choice[] = new int [choiceStringArray.length];
        int score = 0;
        for (int i = 0; i < choiceStringArray.length; i++) {
            System.out.printf("Do you prefer %s\n", choiceStringArray[i]);
            System.out.println("Enter 0 for the preference on the left");
            System.out.println("Enter 1 for the preference on the right");

            int userInputNumber = userInput.nextInt();

            while(userInputNumber != 1 && userInputNumber != 0) {
                System.out.println("Incorrect input, try typing 1 or 0.");
                System.out.printf("Do you prefer %s\n", choiceStringArray[i]);
                System.out.println("Enter 0 for the preference on the left");
                System.out.println("Enter 1 for the preference on the right");

                userInputNumber = userInput.nextInt();
            }
            choice[i] = userInputNumber;
            score = score + choice[i];
        }
        return score;
    }
}
