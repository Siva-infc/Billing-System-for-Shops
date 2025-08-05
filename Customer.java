import java.util.*;
public class Customer{
    String customerName;
    String customerMobileNo;
    Map<String, Item> cart;
    
    public Customer(String customerName, String customerMobileNo) {
        this.customerName = customerName;
        this.customerMobileNo = customerMobileNo;
        this.cart = new HashMap<>();
    }
    
    public void addToCart(Item item) {
        cart.put(item.itemId, item);
    }
    public void removeFromCart(String itemId) {
        cart.remove(itemId);
    }
    public void viewFromCart() {
        if(cart.isEmpty()) System.out.println("Cart is Empty!");
        else {
            for(Item currentItem : cart.values()) System.out.println(currentItem);
        }
    }
}
