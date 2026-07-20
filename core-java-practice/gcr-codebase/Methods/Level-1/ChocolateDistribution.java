import java.util.Scanner;

public class ChocolateDistribution{
    public static int[] RemainderAndQuotient(int chocolates, int children){
        int eachChild = chocolates/children;
        int remaining = chocolates%children;

        int[] result= {eachChild, remaining};

        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of chocolates: ");
        int chocolates= sc.nextInt();
        System.out.print("Enter number of children: ");
        int children = sc.nextInt();

        int[] ans = RemainderAndQuotient(chocolates, children);

        System.out.println("Each child gets = " + ans[0]);
        System.out.println("Remaining chocolates = " +ans[1]);

        sc.close();
    }
}