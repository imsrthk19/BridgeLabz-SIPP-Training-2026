public class PalindromeChecker {
    private String text;
    public PalindromeChecker(String text) {
        this.text = text;
    }

    public boolean isPalindrome() {
        String rev = new StringBuilder(text).reverse().toString();
        return text.equalsIgnoreCase(rev);
    }

    public void display() {
        if (isPalindrome()) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }

    public static void main(String[] args) {
        PalindromeChecker p = new PalindromeChecker("madam");
        p.display();
    }
}