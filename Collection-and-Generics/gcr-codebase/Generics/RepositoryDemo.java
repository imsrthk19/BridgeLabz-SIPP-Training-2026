import java.util.*;

class Repository<T> {
    private ArrayList<T> list = new ArrayList<>();

    void add(T item) {
        list.add(item);
    }

    void display() {
        System.out.println(list);
    }
}

public class RepositoryDemo {
    public static void main(String[] args) {

        Repository<String> repo = new Repository<>();

        repo.add("Java");
        repo.add("Spring");

        repo.display();
    }
}