import java.util.Random;
import java.util.Scanner;

public class Rock_Paper_Scissor {
    public static void main(String[] args) {
        System.out.println("ROCK PAPER SCISSOR GAME");

        // 1 FOR ROCK, 2 FOR PAPER, AND 3 FOR SCISSOR
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose 1 for Rock, 2 for Paper, and 3 for Scissor: ");
        int userinput = sc.nextInt();  // This captures the user's input

        Random random = new Random();
        int computerInput = random.nextInt(3) + 1;  // Generates a random number between 1 and 3

        // Display the computer's choice
        if (computerInput == 1) {
            System.out.println("Computer chose Rock");
        } else if (computerInput == 2) {
            System.out.println("Computer chose Paper");
        } else if (computerInput == 3) {
            System.out.println("Computer chose Scissor");
        }

        // Determine the winner
        if (userinput == computerInput) {
            System.out.println("Match tie!");
        } else if (
            (userinput == 1 && computerInput == 3) ||  // Rock beats Scissor
            (userinput == 2 && computerInput == 1) ||  // Paper beats Rock
            (userinput == 3 && computerInput == 2)     // Scissor beats Paper
        ) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }

        sc.close();
    }
}
