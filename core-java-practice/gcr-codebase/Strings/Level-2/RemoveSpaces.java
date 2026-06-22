import java.util.Scanner;

public class RemoveSpaces {

    public static int[] trimIndexes(String text) {

        int start = 0;
        int end = text.length() - 1;

        while (text.charAt(start) == ' ')
            start++;

        while (text.charAt(end) == ' ')
            end--;

        return new int[] { start, end };
    }

    public static String createSubstring(String text, int start, int end) {

        String result = "";

        for (int i = start; i <= end; i++) {
            result += text.charAt(i);
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Text: ");
        String text = sc.nextLine();

        int[] indexes = trimIndexes(text);

        String userTrim =createSubstring(text, indexes[0], indexes[1]);

        String builtInTrim = text.trim();

        System.out.println("User Trim: " + userTrim);
        System.out.println("Built-in Trim: " + builtInTrim);
    }
}