import java.util.*;

public class AttendanceData {

    HashMap<String, ArrayList<String>> map = new HashMap<>();

    public void mark(String subject, String student) {

        map.putIfAbsent(subject, new ArrayList<>());

        if (!map.get(subject).contains(student)) {
            map.get(subject).add(student);
        }
    }

    public void display() {
        for (String s : map.keySet()) {
            System.out.println(s + " -> " + map.get(s));
        }
    }
}