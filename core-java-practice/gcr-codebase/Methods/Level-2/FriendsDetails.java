import java.util.Scanner;

public class FriendsDetails {

    public static int findYoungest(int[] ages) {

        int youngest = 0;

        for (int i = 1; i < ages.length; i++) {

            if (ages[i] < ages[youngest]) {
                youngest = i;
            }

        }

        return youngest;
    }

    public static int findTallest(double[] heights) {

        int tallest = 0;

        for (int i = 1; i < heights.length; i++) {

            if (heights[i] > heights[tallest]) {
                tallest = i;
            }

        }

        return tallest;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};

        int[] ages = new int[3];
        double[] heights = new double[3];

        for (int i = 0; i < 3; i++) {

            System.out.print("Enter Age of " + names[i] + ": ");
            ages[i] = sc.nextInt();

            System.out.print("Enter Height of " + names[i] + " (in cm): ");
            heights[i] = sc.nextDouble();

        }

        int youngest = findYoungest(ages);
        int tallest = findTallest(heights);

        System.out.println("\nYoungest Friend : " + names[youngest]);
        System.out.println("Age : " + ages[youngest]);

        System.out.println();

        System.out.println("Tallest Friend : " + names[tallest]);
        System.out.println("Height : " + heights[tallest] + " cm");

        sc.close();
    }
}