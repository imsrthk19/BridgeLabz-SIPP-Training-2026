import java.util.Scanner;
public class NumberChecker1 {
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

    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean isArmstrong(int[] digits, int number) {
        int sum = 0;
        for (int i = 0; i < digits.length; i++) {
            sum += Math.pow(digits[i], digits.length);
        }
        return sum == number;
    }

    public static void largestSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];

            } 
            else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }

        }
        System.out.println("Largest Digit = " + largest);
        System.out.println();
        System.out.println("Second Largest Digit = " + secondLargest);
        System.out.println();
    }

    public static void smallestSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] < smallest) {
                secondSmallest = smallest;
                smallest = digits[i];
            } 
            
            else if (digits[i] < secondSmallest && digits[i] != smallest) {
                secondSmallest = digits[i];
            }
        }
        System.out.println("Smallest Digit = " + smallest);
        System.out.println();
        System.out.println("Second Smallest Digit = " + secondSmallest);
        
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int number = sc.nextInt();

        int count = countDigits(number);

        int[] digits = getDigits(number, count);

        System.out.println("------------------------------------------------");
        System.out.println("Duck Number : " + isDuckNumber(digits));
        System.out.println();
        System.out.println("Armstrong Number : " + isArmstrong(digits, number));
        System.out.println();
        largestSecondLargest(digits);
        smallestSecondSmallest(digits);

        sc.close();
    }
}