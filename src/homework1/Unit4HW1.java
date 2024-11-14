package homework1;

import java.util.Scanner;
import java.util.Random;

public class Unit4HW1 {

    public static void main(String[] args) {
        guessingGame();
        tiredTurtle();
        notATamagotchi();
    }

    /**
     * Picks a random number between 1 and 100 and asks the user
     * to guess it. For each guess, the program should tell the user whether
     * the guess is too high, too low, or correct.
     */
    public static void guessingGame() {
        //feel free to use the Random class
        Scanner sc = new Scanner(System.in);

        //get random number
        Random rand = new Random();
        int randNum = rand.nextInt(100);

        //start loop
        System.out.println("See if you can guess my number");
        boolean guessed = false;
        do {
            System.out.print("Guess the number:\n>");
            int guessNum = sc.nextInt();
            sc.nextLine();
            if (guessNum == randNum) {
                System.out.println("Correct! You've guessed the right number!");
                guessed = true;
            } else if (guessNum < randNum) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }
        while (!guessed);
        System.out.println();
    }

    /**
     * Tired Turtle
     * Asks the user how many steps they want the turtle to take in its
     * first move. Then it calculates and displays how many total steps
     * the turtle took until it stopped.
     */
    public static void tiredTurtle() {
        //make scanner
        Scanner sc = new Scanner(System.in);

        //get the first move steps
        System.out.print("How many steps should the turtle take in its first move?\n>");
        int steps = sc.nextInt();
        int total = 0;

        //make the loop
        while (steps > 0) {
            total += steps;
            steps /= 2;
        }

        //print total
        System.out.println("Total number of steps: " + total);
        System.out.println();
    }


    /**
     * Write your own description
     */
    public static void notATamagotchi() {
        //initiate scanner
        Scanner sc = new Scanner(System.in);

        //make the loop
        int hunger = 0;
        String answer;
        for (int i = 0; i < 5; i++) {
            hunger += 10;
            if (hunger > 40) {
                System.out.println("End of simulation. Your pet is dead.");
                break;
            }
            if (i < 4) {
                if (hunger < 40) {
                    System.out.printf("Hour %d: Current hunger level is %d ", (i + 1), hunger);
                } else {
                    System.out.printf("Hour %d: Current hunger level is %d Feed your animal soon, it is unhappy.\n", (i + 1), hunger);
                }
                System.out.print("Do you want to feed your pet? (yes/no):\n>");
                answer = sc.nextLine();
                if (answer.equals("yes")) {
                    hunger -= 25;
                    if (hunger < 0) {
                        hunger = 0;
                    }
                }
            } else {
                System.out.printf("Hour 5: Current hunger level is %d End of simulation. Your pet is content", hunger);
                break;
            }
        }
    }

}
