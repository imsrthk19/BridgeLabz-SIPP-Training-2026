//Encapsulation
public class BankCustomer{
    int Bank_AccountNumber;
    String Bank_Holder;
    double Bank_Balance;
    static int Bank_TotalAccountNumber;

    public BankCustomer(int Bank_AccountNumber, String bank_Holder, double Bank_Balance) {
    this.Bank_AccountNumber = Bank_AccountNumber;
    this.Bank_Holder = bank_Holder;
    this.Bank_Balance = Bank_Balance;
}

    @java.lang.Override
    public java.lang.String toString() {
        return "BankCustomer{" +
                "Bank_AccountNumber=" + Bank_AccountNumber +
                ", Bank_Holder='" + Bank_Holder + '\'' +
                ", Bank_Balance=" + Bank_Balance +
                '}';
    }
}