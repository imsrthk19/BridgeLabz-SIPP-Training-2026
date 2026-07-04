import java.util.*;
public class AddressBookMain {
        AddressBookData addressBook = new AddressBookData();
        public void choices(){
            System.out.println("---------------------------------------");
            System.out.println("Welcome to AddressBook Main Menu");
            while(true){
            System.out.println("1.Add Contact\n2.Display Contact\n3.Search Contacts\n4.Delete Contact\n5.Sort Contacts\n6.Exit");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            if(choice==6){
                break;
            }
            switch (choice) {
                case 1:
                    System.out.print("Enter your Name: ");
                    String name = sc.next();

                    System.out.print("Enter a 10-digit Phone Number: ");
                    String phone = sc.next();

                    System.out.print("Enter your Email Address: ");
                    String email = sc.next();
                    System.out.println();

                    addressBook.addContact(name, phone, email);
                    break;

                case 2:
                    addressBook.displayContacts();
                    break;

                case 3:
                    System.out.print("Enter Name to search: ");
                    String searchName = sc.next();
                    addressBook.searchByName(searchName);
                    break;

                case 4:
                    System.out.print("Enter Name to delete: ");
                    String deleteName = sc.next();
                    addressBook.deleteContact(deleteName);
                    break;

                case 5:
                    addressBook.sortContacts();
                    System.out.println();
                    break;

                case 6:
                    System.out.println("Exiting... Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
        System.out.println("-------------------------------------------");
    }
    public static void main(String[] args){
        AddressBookMain addressBookMain =new AddressBookMain();
        addressBookMain.choices();
    }
}