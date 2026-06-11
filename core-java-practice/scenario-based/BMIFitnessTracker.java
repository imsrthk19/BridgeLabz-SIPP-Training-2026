import java.util.*; 

public class BMIFitnessTracker {

    double height;
    double weight;

    public double calculateBMI() {
        double bmi = weight / (height * height);
        return bmi;
    }

    public void displayCategory(double bmi) {
        System.out.println("----------------------------------");
        System.out.println("HEIGHT: " + height + " m");
        System.out.println("WEIGHT: " + weight + " kg");
        System.out.println("BMI: " + bmi);

        if (bmi < 18.5) {
            System.out.println("CATEGORY: Underweight");
        } else if (bmi < 25) {
            System.out.println("CATEGORY: Normal");
        } else {
            System.out.println("CATEGORY: Overweight");
        }

        System.out.println("----------------------------------");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BMIFitnessTracker client = new BMIFitnessTracker();

        System.out.print("Enter Height (in meters): ");
        client.height = sc.nextDouble();

        System.out.print("Enter Weight (in kg): ");
        client.weight = sc.nextDouble();

        double bmi = client.calculateBMI();

        client.displayCategory(bmi);
    }
}
