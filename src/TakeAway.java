import java.util.ArrayList;
import java.util.Scanner;
/**
 * This class represent a Take Away Order.
 * @author Femi Alogba
 * @version 1.0
 */
class TakeAway extends Order{
    private int pickUpTime; //in minutes
    /**
    * Creates a TakeAway without a specified pick up time (in minutes).
    */
    public TakeAway(ArrayList<String> menuItems){
        this.menuItems = new ArrayList<String>();
        this.orderID = Order.getOrderID();
    }
    /**
    * Creates a TakeAway Order with a specified pick up time by customer (in minutes).
    * @param tableID the table identification number.
    */
    public TakeAway(ArrayList<String> menuItems, int pickUpTime){
        this.menuItems = new ArrayList<String>();
        this.orderID = Order.getOrderID();
    }
    /**
    * Assigns a pick up time to order (in minutes).
    * @param orderID the Order identification number.
    */
    public void setPickTime(int orderID){
        System.out.println("Your order would be ready in: " + pickUpTime + "minutes");
    }