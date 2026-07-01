import java.util.*;
public class BankMenu {
    public void bankDisplay(){
        BankUtility bankUtility= new BankUtility();
        System.out.println("----------------------------");
        System.out.println("WELCOME TO SBI BANK");
        System.out.println("----------------------------");
        System.out.println("1.CREATE ACCOUNT\n2.DEPOSIT\n3.WITHDRAWL\n4.GET STATEMENT\n5.GET TOTAL ACCOUNTS\n6.EXIT");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        while(true){
            if(choice==5)
                break;

            switch (choice) {
            case 1: bankUtility.createAccount();
             break;

             case 2: 
             System.out.println("Enter amount to deposit:");
             double amount = sc.nextDouble();
             bankUtility.deposit(amount);
             break;

             case 3:
             System.out.println("Enter amount to withdraw:");
             amount = sc.nextDouble(); 
             bankUtility.withdraw(amount);
             break;

             case 4: bankUtility.getStatement();
             break;

             case 5: bankUtility.getTotalAccounts();
             break;
            default:
                System.out.println("Invalid Choice!");
                break;
        }
    }
}
}
