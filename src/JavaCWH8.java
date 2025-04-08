import java.util.Random;
import java.util.Scanner;

// Rock paper scissor
public class JavaCWH8 {
    public static void main(String[] args) {
//        0 for rock, 1 for paper, 2 for scissor
        Scanner sc = new Scanner(System.in);
        Random randomNumber = new Random();
        int computerInput = randomNumber.nextInt(3);
//        The number 3 in nextInt(3) specifies the upper bound (exclusive), meaning it returns values in the range [0, 1, 2].
        System.out.println("Enter 0 for rock, 1 for paper, 2 for scissor");
        int userInput = sc.nextInt();
        if (userInput < 0 || userInput > 2) {
            System.out.println("Invalid number");
        }
        else if (userInput == computerInput) {
            System.out.println("Draw");
        }
        else if ((userInput == 0 && computerInput == 2) || (userInput == 1 && computerInput == 0) || (userInput == 2 && computerInput == 1)){
            System.out.println("You Win!");
        }
        else {
            System.out.println("Computer Win!");
        }
//        System.out.format("Computer choice %d\n",computerInput);
        System.out.println("Computer choice: " +
                (computerInput == 0 ? "Rock" : computerInput == 1 ? "Paper" : "Scissor"));


    }
}
