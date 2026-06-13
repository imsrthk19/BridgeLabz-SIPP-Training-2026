import java.util.*;

public class YoungestandTallestFriend {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] friends = {"Amar", "Akbar", "Anthony"};

        int[] ages = new int[3];
        double[] heights = new double[3];

        for (int i = 0; i < friends.length; i++) {
            System.out.print("Enter Age of " + friends[i] + ": ");
            ages[i] = sc.nextInt();
            System.out.print("Enter Height of " + friends[i] + ": ");
            heights[i] = sc.nextDouble();

            if (ages[i] <= 0 || heights[i] <= 0) {
                System.out.println("Invalid Input! Enter Again.");
                i--;
            }
        }

        int youngestIndex = 0;
        int tallestIndex = 0;

        for (int i = 1; i < friends.length; i++) {

            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        System.out.println("\nYoungest Friend : " + friends[youngestIndex]);
        System.out.println("Tallest Friend : " + friends[tallestIndex]);
    }
}