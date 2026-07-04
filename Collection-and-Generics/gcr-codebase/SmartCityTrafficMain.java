public class SmartCityTrafficMain {
    public static void main(String[] args) {

        SmartCityTrafficData s = new SmartCityTrafficData();

        s.update("MG Road", 50);
        s.update("NH1", 100);

        s.displaySorted();
        s.busiest();
    }
}