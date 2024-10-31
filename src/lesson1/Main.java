package lesson1;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        guessMyNumber();

    }

    public static void guessMyNumber(){
        //scanner things
        Scanner sc = new Scanner(System.in);

        //make random number
        Random rand = new Random();
        int randNumber = rand.nextInt(10);

        //start the loop
        System.out.println("See if you can guess my number!");

        boolean guessed = false;
        do {
            System.out.print("Enter a number:\n>");
            int guess = sc.nextInt();

            if(guess == randNumber){
                System.out.println("Correct!");
                guessed = true;
            }
            else{
                System.out.println("Try Again!");
            }
        }
        while(!guessed);
    }
}
