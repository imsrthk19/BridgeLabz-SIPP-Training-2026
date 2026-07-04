import java.util.*;

abstract class WarehouseItem {
    String name;
    WarehouseItem(String name) {
        this.name = name;
    }
}

class Electronics extends WarehouseItem {
    Electronics(String name) { super(name); }
}

class Storage<T extends WarehouseItem> {
    ArrayList<T> list = new ArrayList<>();

    void add(T item) {
        list.add(item);
    }

    void display() {
        for (T item : list) {
            System.out.println(item.name);
        }
    }
}

public class WarehouseSystem {
    public static void main(String[] args) {

        Storage<Electronics> s = new Storage<>();

        s.add(new Electronics("Laptop"));
        s.add(new Electronics("Phone"));

        s.display();
    }
}