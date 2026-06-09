import java.util.Scanner;

public class TriangleAreaConverter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter base in cm: ");
        double base = input.nextDouble();

        System.out.print("Enter height in cm: ");
        double height = input.nextDouble();

        double areaSqCm = 0.5 * base * height;
        double areaSqInch = areaSqCm / (2.54 * 2.54);

        System.out.println("The Area of the triangle in sq in is "
                + areaSqInch
                + " and sq cm is "
                + areaSqCm);

        input.close();
    }
}