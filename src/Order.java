import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class represent an Order
 * @author Femi Alogba
 * @version 1.0
 */
public class Order {
    protected int orderID;
    private static int orderCount;
    private boolean complete;
    protected ArrayList<String> menuItems;
    protected ArrayList<String> dailySpecials;
    
    public Order(){
        this.orderID = Order.getOrderID();
    }
    /**
    * Creates new order with specified  menu items
    * @param menuItems the items ordered
    */
    public Order(ArrayList<String> menuItems){
        this.menuItems = new ArrayList<String>();
        this.orderID = Order.getOrderID();
        
    }
    public void addToOrder(String Order){
        System.out.println(Order + "added to your order!");
    }
    public void removeFromOrder(String Order){
        System.out.println(Order + "removed from your order!");
    }
    public ArrayList<String> getOrder(int orderID){
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