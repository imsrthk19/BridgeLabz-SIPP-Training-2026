class Product<T> {
    T name;
    double price;

    Product(T name, double price) {
        this.name = name;
        this.price = price;
    }

    void display() {
        System.out.println(name + " " + price);
    }
}

public class MarketplaceSystem {

    public static <T extends Product<?>> void applyDiscount(T product, double percent) {
        System.out.println("Discount Applied: " + percent + "%");
    }

    public static void main(String[] args) {

        Product<String> p = new Product<>("Laptop:", 50000);

        p.display();
        applyDiscount(p, 10);
    }
}