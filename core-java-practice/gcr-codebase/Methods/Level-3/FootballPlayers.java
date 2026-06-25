public class FootballPlayers {

    public static int[] generateHeights(int size) {
        int[] heights = new int[size];
        for (int i = 0; i < heights.length; i++) {
            heights[i] = (int)(Math.random() * 101) + 150;
        }
        return heights;
    }

    public static int findSum(int[] heights) {
        int sum = 0;
        for (int i = 0; i < heights.length; i++) {
            sum += heights[i];
        }
        return sum;
    }

    public static double findMean(int[] heights) {
        return (double)findSum(heights) / heights.length;
    }

    public static int findShortest(int[] heights) {
        int shortest = heights[0];
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] < shortest) {
                shortest = heights[i];
            }
        }
        return shortest;
    }

    public static int findTallest(int[] heights) {
        int tallest = heights[0];
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > tallest) {
                tallest = heights[i];
            }
        }

        return tallest;
    }

    public static void main(String[] args) {

        int[] heights = generateHeights(11);
        System.out.println("Player Heights:");

        for (int i = 0; i < heights.length; i++) {
            System.out.print(heights[i] + " ");
        }

        System.out.println("\n");

        System.out.println("Mean Height = " + findMean(heights));
        System.out.println("Shortest Height = " + findShortest(heights));
        System.out.println("Tallest Height = " + findTallest(heights));
    }
}