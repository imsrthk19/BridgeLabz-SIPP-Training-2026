public class ConsecutiveSensorReadings {
    public static boolean isIncreasing(int[] arr, int n) {
        if (n == arr.length - 1) {
            return true;
        }

        if (arr[n] >= arr[n + 1]) {
            return false;
        }

        return isIncreasing(arr, n + 1);
    }

    public static void main(String[] args) {
        int[] arr = {12, 15, 18, 22, 30};

        System.out.println(isIncreasing(arr, 0));
    }
}