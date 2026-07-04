import java.util.*;

class Astronaut {
    int id;
    String name;

    Astronaut(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class SpaceMissionData {

    HashMap<String, List<Astronaut>> map = new HashMap<>();
    HashSet<String> set = new HashSet<>();

    public void addMission(String m) {
        map.putIfAbsent(m, new ArrayList<>());
    }

    public void assign(String m, Astronaut a) {

        String key = m + a.id;

        if (!set.add(key)) {
            System.out.println("Duplicate not allowed");
            return;
        }

        map.get(m).add(a);
    }

    public void display() {

        for (String m : map.keySet()) {
            System.out.println("Mission: " + m);

            for (Astronaut a : map.get(m)) {
                System.out.println(a.id + " " + a.name);
            }
        }
    }
}