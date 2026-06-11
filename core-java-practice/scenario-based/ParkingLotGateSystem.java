import java.util.*;

public class ParkingLotGateSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalCapacity = 5;
        int occupiedSlots = 0;

        while (true) {

            System.out.println("\n========== PARKING MENU ==========");
            System.out.println("1. Park Vehicle");
            System.out.println("2. Exit Vehicle");
            System.out.println("3. Show Occupancy");
            System.out.println("4. Exit System");
            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    if (occupiedSlots < totalCapacity) {
                        occupiedSlots++;
                        System.out.println("Vehicle Parked Successfully.");
                    } else {
                        System.out.println("Parking Lot Full!");
                    }
                    break;

                case 2:
                    if (occupiedSlots > 0) {
                        occupiedSlots--;
                        System.out.println("Vehicle Exited Successfully.");
                    } else {
                        System.out.println("Parking Lot is Empty!");
                    }
                    break;

                case 3:
                    System.out.println("--------------------------------");
                    System.out.println("Total Capacity : " + totalCapacity);
                    System.out.println("Occupied Slots : " + occupiedSlots);
                    System.out.println("Available Slots: " + (totalCapacity - occupiedSlots));
                    System.out.println("--------------------------------");
                    break;

                case 4:
                    System.out.println("Parking System Closed.");
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }

            if (occupiedSlots == totalCapacity) {
                System.out.println("Parking Lot is Full!");
            }
        }
    }
} 