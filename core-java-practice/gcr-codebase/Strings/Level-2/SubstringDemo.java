import java.util.Scanner;

public class SubstringDemo {

    static String createSubstring(String text, int start, int end) {
        String result = "";

        for (int i = start; i < end; i++) {
            result += text.charAt(i);
        }

        return result;
    }

    static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i))
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        int start = sc.nextInt();
        int end = sc.nextInt();

        String userSubstring = createSubstring(text, start, end);
        String builtInSubstring = text.substring(start, end);

        System.out.println("User-Substring: "+ userSubstring);
        System.out.println("Built-in-Substring: " + builtInSubstring);
        System.out.println(compareStrings(userSubstring, builtInSubstring));

        sc.close();
    }
}