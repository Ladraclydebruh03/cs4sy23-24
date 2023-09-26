package Ph15_Ladra_Ex4;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Move userMove = null;
        Move compMove = null;

        int roundsToWin = 2;
        int userChoice;
        int random;
        int userScore;
        int compScore;
        Scanner sc = new Scanner(System.in);
        boolean exitApp = false;

        do {
            System.out.println("Welcome to Rock, Paper, Scissors. Please choose an option");
            System.out.println("1. Start game");
            System.out.println("2. Change number of rounds");
            System.out.println("3. Exit application");
            System.out.print("> ");
            userChoice = sc.nextInt();
            userScore = 0;
            compScore = 0;

            switch (userChoice) {
                case 1:
                    System.out.println("\nThis match will be first to " + roundsToWin + " wins");
                    for (int i = 0; i < roundsToWin; i++) {
                        random = (int) Math.floor(Math.random() * 3) + 1;
                        System.out.println("The computer has selected its move. Select your move:");
                        System.out.println("1. Rock");
                        System.out.println("2. Paper");
                        System.out.println("3. Scissors");
                        System.out.print("> ");
                        userChoice = sc.nextInt();

                        switch (userChoice) {
                            case 1:
                                userMove = new Move("rock");
                                break;
                            case 2:
                                userMove = new Move("paper");
                                break;
                            case 3:
                                userMove = new Move("scissors");
                                break;
                        }

                        switch (random) {
                            case 1:
                                compMove = new Move("rock");
                                break;
                            case 2:
                                compMove = new Move("paper");
                                break;
                            case 3:
                                compMove = new Move("scissors");
                                break;
                        }
                        System.out.println("");
                        int result = Move.compareMoves(userMove, compMove);
                        System.out.println("Player chose " + userMove.getName() + ", Computer chose " + compMove.getName());
                        switch (result) {
                            case 0:
                                userScore++;
                                i = userScore <= compScore ? i - 1 : i;
                                System.out.println("Player wins round!");
                                System.out.println("Player: " + userScore + " - Computer: " + compScore + "\n");
                                break;
                            case 1:
                                compScore++;
                                i = compScore <= userScore ? i - 1 : i;
                                System.out.println("Computer wins round!");
                                System.out.println("Player: " + userScore + " - Computer: " + compScore + "\n");
                                break;
                            case 2:
                                i -= 1;
                                System.out.println("It was a draw, nobody won");
                                System.out.println("Player: " + userScore + " - Computer: " + compScore + "\n");
                                break;
                        }
                    }
                    if (userScore > compScore)
                        System.out.println("Player wins!\n");
                    else
                        System.out.println("Computer wins :<\n");
                    break;
                case 2:
                    System.out.println("\nHow many wins are needed to win a match?");
                    System.out.print("> ");
                    roundsToWin = sc.nextInt();
                    System.out.println("\nNew setting has been saved!\n");
                    break;
                case 3:
                    exitApp = true;
                    System.out.println("\nThank you for playing the game!");
                    break;
            }
        } while (!exitApp);
    }
}