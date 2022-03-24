
import java.util.ArrayList;

/**
 * A class that creates the restaurant which holds details and stats
 * 
 * @author Ethan
 */

public class Restaurant {
    
    private static String name = "Cafe94";
    private ArrayList<Table> tables = new ArrayList<>();
    private static int capacity = 76;
    
    //constructor
    public Restaurant(){       
    }
    
    //methods
    
    /**
     * Method to return the most popular items ordered
     * @param orderList 
     */
    public void getPopularItems(Order orderList){
        
    }
    
    /**
     * Method to return the busiest periods 
     * @param tableBookingList 
     */
    public void getBusyPeroids(Table tableBookingList){
        
    }
    
    /**
     * Method to return the most active customers
     * @param customerHistory 
     */
    public void getActiveCustomers(Customer customerHistory){
        
    }
}
