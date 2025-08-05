import java.util.*;
public class BillingSystem{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Customer name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your Mobile Number: ");
        String mobileNumber = scanner.nextLine();
        Customer customer = new Customer(name, mobileNumber);
        
        while(true) {
            System.out.println("           Billing System");
            System.out.println("1. Add items to cart");
            System.out.println("2. Remove items from cart");
            System.out.println("3. Print bill");
            System.out.println("4. Exit");
            
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice) {
                case 1:
                    System.out.println("Enter your Item: ");
                    System.out.print("Item ID: "); String itemId = scanner.nextLine();
                    System.out.println("Name: "); String itemname = scanner.nextLine();
                    System.out.println("Price: "); double price = scanner.nextDouble(); scanner.nextLine();
                    System.out.println("Quantity: "); int quantity = scanner.nextInt(); scanner.nextLine();
                    Item item = new Item(itemId, itemname, price, quantity);
                    customer.addToCart(item);
                    break;
                case 2:
                    System.out.println("Enter Item ID: "); String itemIdTobeRemoved = scanner.nextLine();
                    customer.removeFromCart(itemIdTobeRemoved);
                    System.out.println("Item Successfully removed");
                    break;
                case 3:
                    System.out.println("------------------------Customer Bill------------------------");
                    System.out.println("Customer Name: " + customer.customerName);
                    System.out.println("Mobile Number: " + customer.customerMobileNo);
                    System.out.println("-------------------------------------------------------------");
                    customer.viewFromCart();
                    System.out.println();
                    double total = 0;
                    for(Item itemCurrent : customer.cart.values()) {
                        total += itemCurrent.price * itemCurrent.quantity;
                    }
                    System.out.println("Total: " + total);
                    System.out.println("-------------------------------------------------------------");
                    break;
                case 4:
                    System.out.println("Exiting Billing System....");
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice! Try Again");
                    
            }
        }
    }
}
