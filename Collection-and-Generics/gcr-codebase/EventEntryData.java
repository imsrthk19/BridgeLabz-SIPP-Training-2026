import java.util.*;

public class EventEntryData {

    HashSet<String> set = new HashSet<>();

    public void register(String email) {
        if (!set.add(email)) {
            System.out.println("Duplicate not allowed");
        }
    }

    public void display() {
        System.out.println(set);
        System.out.println("Total: " + set.size());
    }
}