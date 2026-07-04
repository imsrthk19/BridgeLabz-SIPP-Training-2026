import java.util.*;

public class SmartCityTrafficData {

    HashMap<String, Integer> map = new HashMap<>();

    public void update(String road, int count) {
        map.put(road, map.getOrDefault(road, 0) + count);
    }

    public void displaySorted() {
        TreeMap<String, Integer> t = new TreeMap<>(map);
        System.out.println(t);
    }

    public void busiest() {

        String road = "";
        int max = 0;

        for (String r : map.keySet()) {
            if (map.get(r) > max) {
                max = map.get(r);
                road = r;
            }
        }

        System.out.println("Busiest: " + road);
    }
}