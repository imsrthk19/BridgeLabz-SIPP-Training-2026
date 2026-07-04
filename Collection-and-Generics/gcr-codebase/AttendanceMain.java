public class AttendanceMain {
    public static void main(String[] args) {

        AttendanceData a = new AttendanceData();

        a.mark("Math", "Aman");
        a.mark("Math", "Ravi");
        a.mark("Science", "Aman");

        a.display();
    }
}