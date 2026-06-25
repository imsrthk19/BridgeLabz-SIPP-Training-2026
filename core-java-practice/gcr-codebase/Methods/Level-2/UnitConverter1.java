import java.util.Scanner;

public class UnitConverter1 {
    public static double convertKmToMiles(double km) {
        return km * 0.621371;
    }

    public static double convertMilesToKm(double miles) {
        return miles * 1.60934;
    }

    public static double convertMetersToFeet(double meters) {
        return meters * 3.28084;
    }

    public static double convertFeetToMeters(double feet) {
        return feet * 0.3048;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Kilometers: ");
        double km = sc.nextDouble();

        System.out.print("Enter Miles: ");
        double miles = sc.nextDouble();

        System.out.print("Enter Meters: ");
        double meters = sc.nextDouble();

        System.out.print("Enter Feet: ");
        double feet = sc.nextDouble();

        System.out.println("Kilometers to Miles = " + convertKmToMiles(km));
        System.out.println("Miles to Kilometers = " + convertMilesToKm(miles));
        System.out.println("Meters to Feet = " + convertMetersToFeet(meters));
        System.out.println("Feet to Meters = " + convertFeetToMeters(feet));

        sc.close();
    }
}