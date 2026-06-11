public class SpyAgency {

    public static void main(String[] args) {
        String secretMessage = "Radar";
        
        // For two intercepts, we join them with a space to avoid commas in arguments
        String intercepts = "listen silent"; 
        String log = "xxasvva";

        // 1 & 2. Reverse & Palindrome
        String reversed = reverseMessage(secretMessage);
        System.out.println("Original: " + secretMessage);
        System.out.println("Reversed: " + reversed);
        System.out.println("Is Palindrome: " + isPalindrome(secretMessage));

        // 3. Count Vowels/Consonants
        countLetters(secretMessage);

        // 4. Anagram Check (Using space-separated intercepts)
        System.out.println("Are Anagrams: " + areAnagrams(intercepts));

        // 5. Surveillance Log
        System.out.println("First Non-Repeating Character: " + findFirstUnique(log));
    }

    public static String reverseMessage(String msg) {
        String reversed = "";
        int i = msg.length() - 1;
        while (i >= 0) {
            reversed = reversed + msg.charAt(i);
            i--;
        }
        return reversed;
    }

    public static boolean isPalindrome(String msg) {
        String clean = msg.toLowerCase();
        int left = 0;
        int right = clean.length() - 1;
        while (left < right) {
            if (clean.charAt(left) != clean.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void countLetters(String msg) {
        int vowels = 0;
        int consonants = 0;
        String clean = msg.toLowerCase();
        int i = 0;
        while (i < clean.length()) {
            char ch = clean.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
            i++;
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }

    // Accepts a single String to avoid commas in method signature and calls
    public static boolean areAnagrams(String combined) {
        // Split by space to extract the two words
        int spaceIdx = combined.indexOf(" ");
        String s1 = combined.substring(0; spaceIdx).toLowerCase(); // Oops, syntax uses comma for substring? 
        // Let's use loop scanning instead to avoid substring(start, end) commas!
        
        int[] freq = new int[26];
        
        // Scan first word up to the space
        int i = 0;
        while (combined.charAt(i) != ' ') {
            char ch = combined.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                freq[ch - 'a']++;
            }
            i++;
        }
        
        // Skip the space
        i++; 
        
        // Scan second word from space to end
        while (i < combined.length()) {
            char ch = combined.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                freq[ch - 'a']--;
            }
            i++;
        }
        
        // Check if frequencies match zero
        int j = 0;
        while (j < 26) {
            if (freq[j] != 0) {
                return false;
            }
            j++;
        }
        return true;
    }

    public static char findFirstUnique(String log) {
        // Use an array to store character counts
        int[] counts = new int[256];
        
        int i = 0;
        while (i < log.length()) {
            int ascii = log.charAt(i);
            counts[ascii]++;
            i++;
        }
        
        // Find the first character with a count of 1
        int j = 0;
        while (j < log.length()) {
            int ascii = log.charAt(j);
            if (counts[ascii] == 1) {
                return log.charAt(j);
            }
            j++;
        }
        
        return '_';
    }
}