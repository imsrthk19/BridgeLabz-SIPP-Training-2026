import java.util.*;
public class PasswordChecker {

    public void checkPassword(String password) throws WeakPasswordException {

        if (password == null) {
            throw new WeakPasswordException("Password cannot be null");
        }

        if (password.length() == 0) {
            throw new WeakPasswordException("Password cannot be empty");
        }

        if (password.length() < 8) {
            throw new WeakPasswordException("Password must be at least 8 characters");
        }

        if (!Character.isUpperCase(password.charAt(0))) {
            throw new WeakPasswordException("First character must be uppercase");
        }

        if (!Character.isDigit(password.charAt(password.length() - 1))) {
            throw new WeakPasswordException("Last character must be a digit");
        }

        boolean special = false;
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (ch == '@' || ch == '#' || ch == '$' || ch == '%' || ch == '&' || ch == '*') {
                special = true;
                break;
            }
        }
        if (!special) {
            throw new WeakPasswordException("Password must contain a special character");
        }

        System.out.println("Strong Password");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Password: ");
        String password = sc.nextLine();
        PasswordChecker p = new PasswordChecker();
        try {
            p.checkPassword(password);
        }
        catch (WeakPasswordException e) {
            System.out.println(e.getMessage());
        }
        
        sc.close();
    }
}