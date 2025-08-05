public class Item{
    String itemId;
    String name;
    double price;
    int quantity;
    
    public Item(String itemId, String name, double price, int quantity) {
        this.itemId = itemId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    
    @Override
    public String toString() {
        return name + " x " + quantity + " (₹" + price + " x " + quantity + ") =" + "₹" + getTotalPrice();
    }
    
    private double getTotalPrice() {
        return price * quantity;
    }
}
