import java.util.*;

public class SmartParkingMain {
    public static void main(String[] args) {

        SmartParkingData sp = new SmartParkingData();
        Scanner sc = new Scanner(System.in);

        sp.enter("DL01");
        sp.enter("UP32");

        sp.display();

        sc.close();
    }
}