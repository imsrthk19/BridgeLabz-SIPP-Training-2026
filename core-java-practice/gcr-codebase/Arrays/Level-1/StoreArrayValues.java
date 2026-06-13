import java.util.*;
public class StoreArrayValues {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        while (true) {
            if (index == numbers.length) {
                break;
            }
            System.out.print("Enter a positive number: ");
            double value = sc.nextDouble();
            if (value <= 0) {
                break;
            }
            numbers[index] = value;
            index++;
        }

        System.out.println("\nNumbers Entered:");

        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            total += numbers[i];
        }
        System.out.println("Sum = " + total);
    }
}