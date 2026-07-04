public class Item {
    private String itemCode;
    private String itemName;
    private double price;

    public Item(String itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    public double totalCost(int quantity) {
        return price * quantity;
    }

    public void displayDetails() {
        System.out.println(itemCode + " " + itemName + " " + price);
    }

    public static void main(String[] args) {
        Item i = new Item("Item101", "Pencil", 10);
        i.displayDetails();
        System.out.println("Total Cost: " + i.totalCost(5));
    }
}