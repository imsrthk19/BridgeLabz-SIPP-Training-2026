import java.util.Scanner;
public class CharacterFrequency {
    public static String[][] findFrequency(String text) {
        int[] frequency = new int[256];
        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (frequency[text.charAt(i)] != 0) {
                count++;
                frequency[text.charAt(i)] = -frequency[text.charAt(i)];
            }
        }

        for (int i = 0; i < 256; i++) {
            if (frequency[i] < 0) {
                frequency[i] = -frequency[i];
            }
        }

        String[][] result = new String[count][2];
        boolean[] visited = new boolean[256];

        int index = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (!visited[ch]) {
                result[index][0] = String.valueOf(ch);
                result[index][1] = String.valueOf(frequency[ch]);
                visited[ch] = true;
                index++;
            }
        }

        return result;
    }

    public static void display(String[][] result) {
        System.out.println("\nCharacter\tFrequency");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "\t\t" + result[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Text: ");
        String text = sc.nextLine();
        String[][] result = findFrequency(text);
        display(result);
    }
}