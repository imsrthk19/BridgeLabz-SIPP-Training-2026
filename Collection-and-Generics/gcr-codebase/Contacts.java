public class Contacts implements Comparable<Contacts> {

    private String name;
    private String phoneNumber;
    private String email;

    public Contacts(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public int compareTo(Contacts other) {
        return this.name.compareToIgnoreCase(other.name);
    }

    @Override
    public String toString() {
        return "Name: " + name +
                ", Phone: " + phoneNumber +
                ", Email: " + email;
    }
}