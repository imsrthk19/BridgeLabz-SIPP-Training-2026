import java.util.Scanner;

public class RockPaperScissors {

    public static String computerChoice() {

        int choice = (int)(Math.random() * 3);

        if (choice == 0)
            return "Rock";

        if (choice == 1)
            return "Paper";

        return "Scissors";
    }

    public static String winner(String user, String computer) {

        if (user.equals(computer))
            return "Draw";

        if ((user.equals("Rock")&& computer.equals("Scissors"))|| (user.equals("Paper") && computer.equals("Rock")) || (user.equals("Scissors")&& computer.equals("Paper")))
            return "User";

        return "Computer";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Games: ");
        int games = sc.nextInt();

        int userWin = 0;
        int computerWin = 0;

        for (int i = 1; i <= games; i++) {

            System.out.print("Enter Rock/Paper/Scissors: ");
            String user = sc.next();

            String computer = computerChoice();

            String result = winner(user, computer);

            System.out.println("Computer: " + computer);
            System.out.println("Winner: " + result);

            if (result.equals("User"))
                userWin++;

            else if (result.equals("Computer"))
                computerWin++;
        }

        System.out.println("User Wins: " + userWin);
        System.out.println("Computer Wins: " + computerWin);
    }
}