import java.util.Scanner;

public class NumberChecker {

    public static boolean isPositive(int number) {

        if (number >= 0) {
            return true;
        }

        return false;
    }

    public static boolean isEven(int number) {

        if (number % 2 == 0) {
            return true;
        }

        return false;
    }

    public static int compare(int number1, int number2) {

        if (number1 > number2) {
            return 1;
        }

        if (number1 == number2) {
            return 0;
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {

            System.out.print("Enter Number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        System.out.println("\nResult:");

        for (int i = 0; i < numbers.length; i++) {

            if (isPositive(numbers[i])) {

                System.out.print(numbers[i] + " is Positive and ");

                if (isEven(numbers[i])) {
                    System.out.println("Even");
                } else {
                    System.out.println("Odd");
                }

            } else {

                System.out.println(numbers[i] + " is Negative");
            }
        }

        int result = compare(numbers[0], numbers[4]);

        if (result == 1) {
            System.out.println("\nFirst Number is Greater.");
        } else if (result == 0) {
            System.out.println("\nBoth Numbers are Equal.");
        } else {
            System.out.println("\nLast Number is Greater.");
        }

        sc.close();
    }
}