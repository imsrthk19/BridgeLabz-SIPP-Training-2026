import java.util.*;
public class VowelsConsonantsCount {

    public static String checkCharacter(char ch) {

        if (ch >= 'A' && ch <= 'Z')
            ch = (char) (ch + 32);

        if (ch == 'a' || ch == 'e' || ch == 'i'|| ch == 'o' || ch == 'u')
            return "Vowel";

        if (ch >= 'a' && ch <= 'z')
            return "Consonant";

        return "Not a Letter";
    }

    public static int[] countVowelsConsonants(String text) {

        int vowel = 0;
        int consonant = 0;

        for (int i = 0; i < text.length(); i++) {

            String result = checkCharacter(text.charAt(i));

            if (result.equals("Vowel"))
                vowel++;

            else if (result.equals("Consonant"))
                consonant++;
        }

        return new int[] { vowel, consonant };
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Text: ");
        String text = sc.nextLine();

        int[] result = countVowelsConsonants(text);

        System.out.println("No. of Vowels: " + result[0]);
        System.out.println("No. of Consonants: " + result[1]);
    }
}
