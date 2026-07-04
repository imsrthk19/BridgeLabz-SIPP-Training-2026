public class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;

    public BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public void display() {
        System.out.println("Account Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount b = new BankAccount("Sarthak", "ACC101", 1000);

        b.deposit(500);
        b.withdraw(200);
        b.display();
    }
}