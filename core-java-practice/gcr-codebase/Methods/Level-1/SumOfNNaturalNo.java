import java.util.Scanner; 
public class SumOfNNaturalNo {
    public static int findSum(int number) {
        int sum = 0;

        for (int i = 1; i <= number; i++) {
            sum = sum + i;
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Natural Number: ");
        int number = sc.nextInt();

        if (number > 0) {
            int sum = findSum(number);
            System.out.println("Sum = " + sum);
        } else {
            System.out.println("Please Enter a Natural Number.");
        }

        sc.close();
}
}
