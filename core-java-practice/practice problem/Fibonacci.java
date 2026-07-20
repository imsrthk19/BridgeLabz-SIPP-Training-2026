import java.util.*;
public class Fibonacci {
    public int fibonacciNumbers(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;

        return fibonacciNumbers(n - 1) + fibonacciNumbers(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        Fibonacci obj = new Fibonacci();
        System.out.println(obj.fibonacciNumbers(n));

        sc.close();
    }
}