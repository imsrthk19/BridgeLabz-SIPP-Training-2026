public class FindMaxDemo {

    public static <T extends Comparable<T>> T findMax(T[] arr) {
        T max = arr[0];

        for (T item : arr) {
            if (item.compareTo(max) > 0) {
                max = item;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Integer[] arr = {10, 50, 20, 5};

        System.out.println("Max: " + findMax(arr));
    }
}