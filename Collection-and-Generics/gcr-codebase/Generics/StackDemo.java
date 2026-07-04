import java.util.*;

class Stack<T> {
    private ArrayList<T> list = new ArrayList<>();

    void push(T item) {
        list.add(item);
    }

    T pop() {
        return list.remove(list.size() - 1);
    }

    void display() {
        System.out.println(list);
    }
}

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(10);
        s.push(20);

        s.display();
        System.out.println(s.pop());
        s.display();
    }
}