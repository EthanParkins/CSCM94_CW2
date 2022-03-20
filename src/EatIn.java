import java.util.ArrayList;
import java.util.Scanner;
/**
 * This class represent an Eat-in Order.
 * @author Femi Alogba
 * @version 1.0
 */
class EatIn extends Order{
    private int tableID;
    private int waiterID;
    /**
    * Creates an Eat-in Order without a specified table or waiter.
    */
    public EatIn(){
        this.menuItems = new ArrayList<menuItems>;
        this.orderID = Order.getOrderID();
        this.tableID = EatIn.getTableID();
        this.waiterID = EatIn.getwaiterID();
    }
    /**
    * Creates an Eat-in Order with a specified table.
    * @param tableID the table identification number.
    */
    public EatIn(ArrayList<Item> menuItems, int tableID){
        this.menuItems = new ArrayList<menuItems>;
        this.orderID = Order.getOrderID();
        this.tableID = tableID;
        this.waiterID = EatIn.getwaiterID();
    }
    /**
    * Assigns waiter to an Eat-in Order.
    */
    public void assignTable(int tableID){
        System.out.println("Waiter with ID: " + waiterID 
        + "would attend to you shortly");
    }
    /**
    * Unassign table from an Eat-in Order.
    * @param orderID the Order identification number.
    */
    public void removeTable(int orderID){
        System.out.println("You are no longer at table: " +
        tableID + " thanks for coming to Cafe94");
    }
}