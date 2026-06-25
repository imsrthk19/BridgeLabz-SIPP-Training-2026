import java.util.Scanner;

public class NumberChecker3 {

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

    public static int[] reverseArray(int[] digits) {
        int[] reverse = new int[digits.length];
        int index = 0;
        for (int i = digits.length - 1; i >= 0; i--) {
            reverse[index] = digits[i];
            index++;
        }
        return reverse;
    }

    public static boolean compareArrays(int[] array1, int[] array2) {
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome(int[] digits) {
        int[] reverse = reverseArray(digits);
        return compareArrays(digits, reverse);
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int number = sc.nextInt();

        int count = countDigits(number);

        int[] digits = getDigits(number, count);

        System.out.println("------------------------------------------------");

        System.out.println("Palindrome Number : " + isPalindrome(digits));
        
        System.out.println("------------------------------------------------");
        System.out.println("Duck Number : " + isDuckNumber(digits));
        
        System.out.println("------------------------------------------------");
        sc.close();
    }
}
