import java.util.Scanner;
public class TaxBracket {
    public static void main(String[] args) {

        double tax = 0;
        double income;
        String taxBracket = "";

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Income: ");
        income = sc.nextDouble();

        if (income <= 10000) {
            tax = income * 0.05;
            taxBracket = "Tax of 5%";
        } 
        else if (income <= 20000) {
            tax = income * 0.10;
            taxBracket = "Tax of 10%";
        } 
        else if (income <= 30000) {
            tax = income * 0.20;
            taxBracket = "Tax of 20%";
        } 
        else if (income <= 40000) {
            tax = income * 0.30;
            taxBracket = "Tax of 30%";
        } 
        else if (income <= 50000) {
            tax = income * 0.40;
            taxBracket = "Tax of 40%";
        } 
        else {
            tax = income * 0.50;
            taxBracket = "Tax of 50%";
        }

        System.out.println("Income: " + income);
        System.out.println("Tax Bracket: " + taxBracket);
        System.out.println("Tax Amount: " + tax);
        sc.close();
    }
}

