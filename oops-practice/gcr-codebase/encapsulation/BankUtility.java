import java.util.Scanner;
public class BankUtility {

    BankCustomer bankCustomer;

    public void createAccount() {
        Scanner sc = new Scanner(System.in);

        int account_number = (int)(Math.random() * 900000) + 100000;

        String name = sc.next();

        double balance = 50000;

        bankCustomer = new BankCustomer(account_number, name, balance);

        System.out.println("Account Created");

        bankCustomer.Bank_TotalAccountNumber++;
    }

    public void deposit(double amount) {
        if(amount < 0) {
            System.out.println("Invalid Amount!!");
        }
        else {
            bankCustomer.Bank_Balance += amount;
            System.out.println("Deposited Amount " + amount);
            System.out.println("Current Balance: " + bankCustomer.Bank_Balance);
        }
    }

    public void withdraw(double amount) {
        if(amount > bankCustomer.Bank_Balance) {
            System.out.println("Insufficient Balance");
        }
        else {
            bankCustomer.Bank_Balance -= amount;
            System.out.println("Withdrawal Amount is " + amount);
            System.out.println("Bank Balance is " + bankCustomer.Bank_Balance);
        }
    }

    public void getStatement() {
        System.out.println(bankCustomer.toString());
    }

    public void getTotalAccounts(){

        System.out.println("Total Number of accounts are: "+ BankCustomer.Bank_TotalAccountNumber);
    }
}