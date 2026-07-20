import java.util.Scanner;

public class BMICalculator {

    public static String[] calculateBMI(double weight, double heightCm) {

        double heightM = heightCm / 100.0;

        double bmi = weight / (heightM * heightM);

        String status;

        if (bmi < 18.5) {
            status = "Underweight";
        } else if (bmi < 25) {
            status = "Normal";
        } else if (bmi < 30) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        String[] result = new String[2];
        result[0] = String.format("%.2f", bmi);
        result[1] = status;

        return result;
    }

    public static String[][] getBMIReport(double[][] data) {

        String[][] report = new String[data.length][4];

        for (int i = 0; i < data.length; i++) {

            double weight = data[i][0];
            double height = data[i][1];

            String[] bmiData = calculateBMI(weight, height);

            report[i][0] = String.valueOf(height);
            report[i][1] = String.valueOf(weight);
            report[i][2] = bmiData[0];
            report[i][3] = bmiData[1];
        }

        return report;
    }

    public static void displayReport(String[][] report) {

        System.out.println("Height\tWeight\tBMI\tStatus");

        for(int i=0; i < report.length; i++) {
            System.out.println(report[i][0] + "\t" +report[i][1] + "\t" +report[i][2] + "\t" +report[i][3]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[][] persons = new double[10][2];

        for (int i = 0; i < 10; i++) {

            System.out.println("\nPerson " + (i + 1));

            System.out.print("Enter Weight (kg): ");
            persons[i][0] = sc.nextDouble();

            System.out.print("Enter Height (cm): ");
            persons[i][1] = sc.nextDouble();
        }

        String[][] report = getBMIReport(persons);

        System.out.println("\nBMI REPORT");
        displayReport(report);
    }
}