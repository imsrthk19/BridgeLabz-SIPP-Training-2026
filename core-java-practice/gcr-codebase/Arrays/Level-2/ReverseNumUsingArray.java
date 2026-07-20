import java.util.*;
public class ReverseNumUsingArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Invalid Number");
        }

        int temp = number;
        int count = 0;
        while (temp > 0) {
            count++;
            temp /= 10;
        }

        int[] digits = new int[count];
        temp = number;
        for (int i = 0; i < digits.length; i++) {
            digits[i] = temp % 10;
            temp /= 10;
        }

        System.out.print("Reversed Number = ");
        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i]);
        }
    }
}