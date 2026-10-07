package basics.class_problems;
import java.util.Random;
import java.util.Scanner;

public class Problem1_RockPaperScissors {
    static String playRound(String playerMove, String computerMove) {
        if (playerMove.equals(computerMove)) return "Draw";
        if ((playerMove.equals("Rock") && computerMove.equals("Scissors")) ||
            (playerMove.equals("Paper") && computerMove.equals("Rock")) ||
            (playerMove.equals("Scissors") && computerMove.equals("Paper"))) return "Player Wins";
        return "Computer Wins";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        String[] moves = {"Rock", "Paper", "Scissors"};
        int wins = 0, losses = 0, draws = 0;
        System.out.println("Round | Player Move | Computer Move | Result");
        for (int round = 1; round <= 5; round++) {
            System.out.print("Round " + round + " - Enter Rock, Paper, or Scissors: ");
            String player = sc.next();
            player = player.substring(0, 1).toUpperCase() + player.substring(1).toLowerCase();
            String computer = moves[random.nextInt(3)];
            String result = playRound(player, computer);
            if (result.equals("Player Wins")) wins++;
            else if (result.equals("Computer Wins")) losses++;
            else draws++;
            System.out.printf("%d | %s | %s | %s%n", round, player, computer, result);
        }
        System.out.println("Wins: " + wins + " | Losses: " + losses + " | Draws: " + draws);
        System.out.printf("Win %%: %.1f%%%n", wins / 5.0 * 100);
        sc.close();
    }
}