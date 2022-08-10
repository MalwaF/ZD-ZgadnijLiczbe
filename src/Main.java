import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int numberToGuess = new Random().nextInt(100);
//        System.out.println(numberToGuess);
        printMessage("Guess a number from 1 to 99. You have 5 tries.");
        Scanner scanner = new Scanner(System.in);
        int numberOfTrials;
        int SumOfTrials = 4;

        for (numberOfTrials = 0; numberOfTrials < 5; numberOfTrials++) {
            int numberFromUser = scanner.nextInt();
            int leftTrials = SumOfTrials - numberOfTrials;
            if (leftTrials == 0){
                printMessage("Sorry you didn't guess the number, the answer was: " + numberToGuess);
            }
            else if (numberFromUser > numberToGuess) {
                graterNumber(numberOfTrials, SumOfTrials);
            } else if (numberFromUser < numberToGuess) {
                lowerNumber("Your number is LOWER than the one you are trying to guess.", SumOfTrials, numberOfTrials);
            } else if (numberFromUser == numberToGuess){
                printMessage("You guessed it!");
                break;
            }
        }
    }

    private static void lowerNumber(String message, int SumOfTrials, int numberOfTrials) {
        printMessage(message);
        printMessage("Please try again. You got " + (SumOfTrials - numberOfTrials) + " trial left.");
    }

    private static void graterNumber(int numberOfTrials, int SumOfTrials) {
        String leftTrialsStr = Integer.toString(numberOfTrials);
        lowerNumber("Your number is GREATER than the one you are trying to guess.", SumOfTrials, numberOfTrials);
    }

    private static void printMessage(String message) {
        System.out.println(message);
    }
}
