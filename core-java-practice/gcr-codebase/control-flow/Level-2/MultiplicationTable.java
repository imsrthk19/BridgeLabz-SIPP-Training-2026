import java.util.*;
public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        for(int i = 6; i <= 9; i++) {
            System.out.print(number + " * " + i +" = " + (number * i));
        }

        sc.close();
    }
}