import java.util.*;
public class NumbersFrom1toN {
    public static void print(int n) {
        if (n == 0) {
            return;
        }

        System.out.print(n + " ");
        print(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        print(n);
    }
}