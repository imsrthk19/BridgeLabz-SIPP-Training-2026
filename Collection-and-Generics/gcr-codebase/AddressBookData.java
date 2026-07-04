// import java.util.*;

// class AddressBookData {

//     private ArrayList<Contacts> contactList = new ArrayList<>();
//     private HashMap<String, Contacts> contactMap = new HashMap<>();
//     private HashSet<String> phoneSet = new HashSet<>();

//     public void addContact(String name, String phoneNumber, String email) {

//         if (phoneSet.contains(phoneNumber)) {
//             System.out.println("USER ALREADY EXISTS (Phone Duplicate)!");
//             return;
//         }

//         Contacts c = new Contacts(name, phoneNumber, email);

//         contactList.add(c);
//         contactMap.put(name, c);
//         phoneSet.add(phoneNumber);

//         System.out.println("Contact Added Successfully!");
//         System.out.println("----------------------------------------------");
//     }

//     public void displayContacts() {
//         if (contactList.isEmpty()) {
//             System.out.println("⚠ No contacts found");
//             return;
//         }

//         for (Contacts c : contactList) {
//             System.out.println(c);
//         }
//     }

//     public void searchByName(String name) {
//         Contacts c = contactMap.get(name);

//         if (c != null) {
//             System.out.println(c);
//         } else {
//             System.out.println("Contact with name " + name + " not found!");
//         }
//     }

//     public void deleteContact(String name) {
//         System.out.print("Enter the name of contact to be deleted: ");
//         Contacts c = contactMap.get(name);

//         if (c == null) {
//             System.out.println("Contact with name " + name + " not found!");
//             return;
//         }
//         else if(c==)

//         contactList.remove(c);
//         contactMap.remove(name);
//         phoneSet.remove(c.getPhoneNumber());

//         System.out.println("🗑 Contact Deleted Successfully");
//     }

//     public void sortContacts() {
//         Collections.sort(contactList);
//         System.out.println("Contacts Sorted by Name.");
//     }
// }
import java.util.*;

class AddressBookData {

    private ArrayList<Contacts> contactList = new ArrayList<>();
    private HashMap<String, Contacts> contactMap = new HashMap<>();
    private HashSet<String> phoneSet = new HashSet<>();

    public void addContact(String name, String phoneNumber, String email) {

        if (phoneSet.contains(phoneNumber)) {
            System.out.println("USER ALREADY EXISTS (Phone Duplicate)!");
            return;
        }

        Contacts c = new Contacts(name, phoneNumber, email);

        contactList.add(c);
        contactMap.put(name.toLowerCase(), c);
        phoneSet.add(phoneNumber);

        System.out.println("Contact Added Successfully!");
        System.out.println("-----------------------------------");
    }

    public void displayContacts() {
        if (contactList.isEmpty()) {
            System.out.println("⚠ No contacts found");
            return;
        }

        for (Contacts c : contactList) {
            System.out.println(c);
        }
    }

    public void searchByName(String name) {

        Contacts c = contactMap.get(name.toLowerCase());

        if (c != null) {
            System.out.println(c);
        } else {
            System.out.println("Contact with name " + name + " not found!");
        }
    }

    public void deleteContact(String name) {

        Contacts c = contactMap.get(name.toLowerCase());

        if (c == null) {
            System.out.println("Contact with name " + name + " not found!");
            return;
        }

        contactList.remove(c);
        contactMap.remove(name.toLowerCase());
        phoneSet.remove(c.getPhoneNumber());

        System.out.println("🗑 Contact Deleted Successfully");
    }

    public void sortContacts() {

    if (contactList.isEmpty()) {
        System.out.println("⚠ No contacts to sort");
        return;
    }

    Collections.sort(contactList);

    System.out.println("Contacts Sorted by Name:");
    System.out.println("-----------------------------------");

    for (Contacts c : contactList) {
        System.out.println(c);
    }

    System.out.println("-----------------------------------");
}
}