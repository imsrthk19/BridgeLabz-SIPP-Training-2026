import java.util.Scanner;

public class VotingEligibility {

    public static String[][] checkVote(int[] ages) {

        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {

            result[i][0] = String.valueOf(ages[i]);

            if (ages[i] >= 18)
                result[i][1] = "true";
            else
                result[i][1] = "false";
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] ages = new int[10];

        for (int i = 0; i < ages.length; i++) {

            System.out.print("Enter Age: ");
            ages[i] = sc.nextInt();
        }

        String[][] result = checkVote(ages);

        System.out.println("Age\tCan Vote");

        for (String[] row : result) {

            System.out.println(row[0] + "\t" + row[1]);
        }
    }
}