import java.util.*;

public class WildcardDemo {

    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3);

        printList(list);
    }
}