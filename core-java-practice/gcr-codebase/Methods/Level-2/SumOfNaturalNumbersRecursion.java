import java.util.Scanner;

public class SumOfNaturalNumbersRecursion {

    public static int recursiveSum(int number) {

        if (number == 1) {
            return 1;
        }

        return number + recursiveSum(number - 1);
    }

    public static int formulaSum(int number) {

        return number * (number + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Natural Number: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Invalid Input");
        } 
        
        else {
            int recursion = recursiveSum(number);
            int formula = formulaSum(number);

            System.out.println("Recursive Sum = " + recursion);
            System.out.println("Formula Sum = " + formula);

            if (recursion == formula) {
                System.out.println("Both Results are Same");
            } 
            
            else {
                System.out.println("Results are Different");
            }
        }

        sc.close();
    }
}