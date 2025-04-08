// guess the number
import java.util.Random;
import java.util.Scanner;

class Game{
    private int number;
    private int noOfGuesses;
    private int inputNumber;
//    Constructor
    Game(){
        Random ranNum = new Random();
        this.number = ranNum.nextInt(101);
    }
//    Take user input
    void takeUserInput(){
        System.out.println("Guess the number!");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }
//    Check the guess
    boolean isCorrectNumber(){
        noOfGuesses++;
        if (inputNumber == number) {
            System.out.printf("You guessed the right number that is %d in %d attempts\n",number,noOfGuesses);

            return true;
        }
        else if (inputNumber<number) {
            System.out.println("Too low...");
        }
        else if (inputNumber>number) {
            System.out.println("Too high...");
        }
        return false;
    }
}
public class JavaCWH10 {
    public static void main(String[] args) {
//        GuessingGame g = new GuessingGame();
//        g.guessingGame();
//        System.out.println("Sum: " + 5 + 10);

        Game g = new Game();
        boolean b = false;
        while (!b){
            g.takeUserInput();
            b = g.isCorrectNumber();
        }
    }
}

//class GuessingGame{
//    private int noOfGuesses = 0;
//    public void guessingGame(){
//        Scanner sc = new Scanner(System.in);
//        Random ranNum = new Random();
//
//        int randomNumber = ranNum.nextInt(101);
//        System.out.println(randomNumber);
//        System.out.println("Welcome to the Guessing Game!");
//        System.out.println("Try to guess the number between 0 and 100!");
//
//        int myNum = -1;
//        while(myNum!=randomNumber){
//            System.out.println("Enter your guess!");
//            if (sc.hasNextInt()) {
//                myNum = sc.nextInt();
//                noOfGuesses++;
//                if (myNum > randomNumber) {
//                    System.out.println("Too high! Try again.");
//                }
//                else if (myNum < randomNumber){
//                    System.out.println("Too low! Try again.");
//                }else {
//                    System.out.format("Congratulations! You guessed the correct number %d in %d attempts.\n",
//                            randomNumber, noOfGuesses);
//                }
//            } else {
//                System.out.println("Invalid input. Please enter an integer.");
//                sc.nextInt();
//            }
//
//        }
//        sc.close();
//    }
//}
