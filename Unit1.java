import java.util.*;

public class Unit1 {
    public static void main(String[] args){
        //count player wins
        int p1Win = 0;
        int p2Win = 0;

        //scanner for input
        Scanner scanner = new Scanner(System.in);

        //game loop
        while (true){
            System.out.println("Rock Paper Scissors - Shoot!");

            //player 1
            String p1Choice = getPChoice(scanner, "Player 1");
            while (!isValidChoice(p1Choice)){
                System.out.println("Invalid input. Choose rock paper or scissors.");
                p1Choice = getPChoice(scanner,"Player 1");
            }

            //player 2
            String p2Choice = getPChoice(scanner, "Player 2");
            while (!isValidChoice(p2Choice)){
                System.out.println("Invalid input. Choose rock paper or scissors.");
                p2Choice = getPChoice(scanner, "Player 2");
            }

            //winner
            if (p1Choice.equals(p2Choice)){
                System.out.println("Tie!!");
            }
            else if ((p1Choice.equals("rock") && p2Choice.equals("scissors")) ||
            (p1Choice.equals("scissors") && p2Choice.equals("paper")) ||
            (p1Choice.equals("paper") && p2Choice.equals("rock"))){
                System.out.println("Player 1 wins!");
                p1Win++;
            } else{
                System.out.println("Player 2 wins!");
                p2Win++;
            }
            //continue
            System.out.print("Do you want to play again? (y/n): ");
            String continueGame = scanner.nextLine().toLowerCase();
            if (!continueGame.equals("y")){
                break;
            }

        }
        //tallys
        System.out.println("Game Over!");
        System.out.println("Player 1 wins: " + p1Win);
        System.out.println("Player 2 wins: " + p2Win);
        scanner.close();

    }
    //getting choice
    public static String getPChoice(Scanner scanner, String player){
        System.out.print(player +", choose rock paper or scissors: ");
        return scanner.nextLine().toLowerCase();
    }

    //validation
    public static boolean isValidChoice(String choice){
        return choice.equals("rock") || choice.equals("paper") || choice.equals("scissors");
    }
}
