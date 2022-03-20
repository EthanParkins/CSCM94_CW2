import java.util.ArrayList;
/**
 * This class represent an Order
 * @author Femi Alogba
 * @version 1.0
 */

public class Order {
    private int orderID;
    private static int orderCount;
    private boolean complete;
    private ArrayList<Item> menuItems;
    private ArrayList<Item> dailySpecials;
    
    public Order(){
        this.orderID = Order.Order();
    }
    public Order(ArrayList<Item> menuItems){
        this.menuItems = menuItems;
        this.orderID = Order.getOrderID();
        
    }
    public void addToOrder(Item Order){
        System.out.println(Order + "added to your order!");
    }
    public void removeFromOrder(Item Order){
        System.out.println(Order + "removed from your order!");
    }
    public ArrayList<Item> getOrder(int orderID){
        return Order;
    }
    public boolean getComplete(int orderID){
        return complete;
    }
    public void cancel(int orderID){
        System.out.println(orderID + "Order Canceled!");
    }
    public static int getOrderID() {
        int id = orderCount;     
        ++id;                                   
        orderCount = id;         
        return orderCount;
    }
}