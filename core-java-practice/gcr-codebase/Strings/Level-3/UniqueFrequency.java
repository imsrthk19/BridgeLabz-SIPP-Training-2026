import java.util.Scanner;

public class UniqueFrequency {
    public static char[] uniqueCharacters(String text) {
        char[] temp = new char[text.length()];
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            boolean unique = true;
            for (int j = 0; j < i; j++) {
                if (text.charAt(i) == text.charAt(j)) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                temp[count++] = text.charAt(i);
            }
        }
        char[] result = new char[count];
        for (int i = 0; i < count; i++) {
            result[i] = temp[i];
        }
        return result;
    }

    public static void findFrequency(String text) {

        char[] unique = uniqueCharacters(text);
        System.out.println("Character\tFrequency");
        for (int i = 0; i < unique.length; i++) {
            int frequency = 0;
            for (int j = 0; j < text.length(); j++) {
                if (unique[i] == text.charAt(j)) {
                    frequency++;
                }
            }
            System.out.println(unique[i] + "\t\t" + frequency);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Text: ");
        String text = sc.nextLine();
        findFrequency(text);
    }
}