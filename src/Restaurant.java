
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
    private ArrayList<Driver> driverList = new ArrayList<>();
    //constructor
    public Restaurant(){       
    }
    
    //methods
    
    
    public void addDriver(Driver driver) {
        driverList.add(driver);
    }
        
    public ArrayList<Driver> getDrivers() {
        return driverList;
    }
    
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
    /**
     * Method to add a table object to an array of tables
     * @param table 
     */
    public void addTable(Table table){
        tables.add(table);
    }
    
    public ArrayList<Table> getTables (Table table){
        return tables;
    }
}
