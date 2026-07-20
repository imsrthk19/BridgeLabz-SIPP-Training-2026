import java.util.*;

public class BMICalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Weight in Kg: ");
        double weight = input.nextDouble();

        System.out.print("Enter Height in Cm: ");
        double heightCm = input.nextDouble();

        double heightMeter = heightCm / 100;

        double bmi = weight / (heightMeter * heightMeter);

        System.out.println("BMI = " + bmi);

        if(bmi < 18.5) {
            System.out.println("Underweight");
        }
        else if(bmi < 25) {
            System.out.println("Normal");
        }
        else if(bmi < 40) {
            System.out.println("Overweight");
        }
        else {
            System.out.println("Obese");
        }

        input.close();
    }
}