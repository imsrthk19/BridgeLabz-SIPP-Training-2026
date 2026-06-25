import java.util.Scanner;

public class QuotientRemainder {

    public static int[] findRemainderAndQuotient(int number, int divisor) {

        int quotient = number / divisor;
        int remainder = number % divisor;

        int[] result = {quotient, remainder};

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int number = sc.nextInt();

        System.out.print("Enter a Divisor: ");
        int divisor = sc.nextInt();

        int[] ans = findRemainderAndQuotient(number, divisor);

        System.out.println("Quotient = " + ans[0]);
        System.out.println("Remainder = " + ans[1]);

        sc.close();
    }
}