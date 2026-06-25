import java.util.Scanner;

public class NumberChecker2 {

    public static int countDigits(int number) {

        int count = 0;

        while (number > 0) {
            count++;
            number /= 10;
        }

        return count;
    }

    public static int[] getDigits(int number, int count) {
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    public static int sumDigits(int[] digits) {
        int sum = 0;
        for (int i = 0; i < digits.length; i++) {
            sum += digits[i];
        }
        return sum;
    }

    public static int sumSquareDigits(int[] digits) {
        int sum = 0;
        for (int i = 0; i < digits.length; i++) {
            sum += Math.pow(digits[i], 2);
        }
        return sum;
    }

    public static boolean isHarshad(int number, int sum) {
        if (number % sum == 0) {
            return true;
        }
        return false;
    }

    public static int[][] digitFrequency(int[] digits) {
        int[][] frequency = new int[10][2];
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i;
        }

        for (int i = 0; i < digits.length; i++) {
            frequency[digits[i]][1]++;
        }
        return frequency;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int number = sc.nextInt();
        int count = countDigits(number);
        int[] digits = getDigits(number, count);
        int sum = sumDigits(digits);

        System.out.println("------------------------------------------------");
        System.out.println("Sum of Digits = " + sum);
        System.out.println();

        System.out.println("Sum of Squares of Digits = " + sumSquareDigits(digits));
        System.out.println();

        System.out.println("Harshad Number : " + isHarshad(number, sum));
        System.out.println();

        int[][] frequency = digitFrequency(digits);

        System.out.println("Digit\tFrequency");

        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i][1] != 0) {
                System.out.println(frequency[i][0] + "\t" + frequency[i][1]);
            }
        }
        System.out.println("------------------------------------------------");
        sc.close();
    }
}