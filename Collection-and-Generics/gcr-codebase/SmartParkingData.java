import java.util.*;

public class SmartParkingData {

    ArrayList<String> vehicles = new ArrayList<>();

    public void enter(String v) {
        vehicles.add(v);
    }

    public void exit(String v) {
        vehicles.remove(v);
    }

    public void search(String v) {
        System.out.println(vehicles.contains(v));
    }

    public void display() {
        System.out.println(vehicles);
        System.out.println("Total: " + vehicles.size());
    }
}