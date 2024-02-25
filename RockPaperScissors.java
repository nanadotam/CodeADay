import java.util.*;

public class RockPaperScissors {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to Rock Paper Scissors!");
        playGame();
    }

    public static void playGame() {
        String playerChoice = getPlayerInput();
        char computerChoice = getRandomChoice();

        System.out.println("Computer's choice: " + computerChoice);

        if (playerChoice.equals(String.valueOf(computerChoice))) {
            System.out.println("It's a tie!");
        } else if (isWin(playerChoice.charAt(0), computerChoice)) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }
    }

    public static boolean isWin(char playerChoice, char computerChoice) {
        if ((playerChoice == 'r' && computerChoice == 's') ||
                (playerChoice == 's' && computerChoice == 'p') ||
                (playerChoice == 'p' && computerChoice == 'r')) {
            return true;
        }
        return false;
    }

    public static String getPlayerInput() {
        System.out.println("Enter 'r' for rock, 'p' for paper, 's' for scissors");
        while (true) {
            String input = scanner.nextLine().trim().toLowerCase();
            if (input.equals("r") || input.equals("p") || input.equals("s")) {
                return input;
            } else {
                System.out.println("Invalid input. Please enter 'r', 'p', or 's'.");
            }
        }
    }

    public static char getRandomChoice() {
        Random random = new Random();
        int rand = random.nextInt(3);
        return rand == 0 ? 'r' : rand == 1 ? 'p' : 's';
    }
}
