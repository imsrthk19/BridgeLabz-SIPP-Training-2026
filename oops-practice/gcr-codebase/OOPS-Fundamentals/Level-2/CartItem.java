public class CartItem {
    private String itemName;
    private double price;
    private int quantity;

    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public double totalCost() {
        return price * quantity;
    }

    public void display() {
        System.out.println("Item: "+ itemName + "\nTotal: " + totalCost());
    }

    public static void main(String[] args) {
        CartItem c = new CartItem("Book", 200, 3);
        c.display();
    }
}