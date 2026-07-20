public class FitnessTrackerMain {
    public static void main(String[] args) {
        FitnessDevice device = new FitnessDevice(3000, 120);
        device.sendAlert();
        device.generateReport();
        device.resetData();
        device.logActivity();
    }
}