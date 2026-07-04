public class MobilePhone {
    private String brand;
    private String model;
    private double price;

    public MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println(brand + " " + model + " " +"- " +price);
    }

    public static void main(String[] args) {
        MobilePhone m = new MobilePhone("Samsung", "S23", 80000);
        m.displayDetails();
    }
}