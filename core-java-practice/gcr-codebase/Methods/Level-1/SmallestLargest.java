import java.util.Scanner;

public class SmallestLargest {

    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {

        int smallest = number1;
        int largest = number1;

        if (number2 < smallest) {
            smallest = number2;
        }

        if (number3 < smallest) {
            smallest = number3;
        }

        if (number2 > largest) {
            largest = number2;
        }

        if (number3 > largest) {
            largest = number3;
        }

        int[] result = {smallest, largest};

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int number1 = sc.nextInt();

        System.out.print("Enter Second Number: ");
        int number2 = sc.nextInt();

        System.out.print("Enter Third Number: ");
        int number3 = sc.nextInt();

        int[] answer = findSmallestAndLargest(number1, number2, number3);

        System.out.println("Smallest Number = " + answer[0]);
        System.out.println("Largest Number = " + answer[1]);

        sc.close();
    }
}