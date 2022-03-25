import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author Ethan
 */
public class Data {

   
    
    /**
     * Class to save to file
     * @param fileName
     * @param text
     * @param append append to the file, or overwrite
     * @throws IOException 
     */
    
    public static void saveDriver(Restaurant drivers) throws IOException{
        for(int i = 0; i < drivers.getDrivers().size(); i++){
            String outputText = drivers.getDrivers().get(i).toString();
            
            saveToFile("DriverList.txt", outputText, true);
        }   
    }
    
    public static ArrayList<Driver> readDrivers(String fileName) throws FileNotFoundException{
        
        File file = new File(fileName);
        Scanner s = new Scanner(file);
        ArrayList<Driver> driverList = new ArrayList<Driver>();
        
        while(s.hasNextLine()){
            String line = s.nextLine();
            
            String[] items = line.split("\\|");
            
            String firstName = items[0];
            String lastName = items[1];
            String ID = items[2];
            String Schedule = items[3];
            int hoursWorked = Integer.parseInt(items[4]);;
            
            Driver newDriver = new Driver(firstName,lastName);
            driverList.add(newDriver);
        } 
        return driverList;
        
    }
    
    public static void saveToFile(String fileName, String text, boolean append) throws IOException {
        
        File file1 = new File(fileName);
        FileWriter fw = new FileWriter(file1, append);
        PrintWriter pw = new PrintWriter(fw);
        pw.println(text);
        pw.close();
        
    }

    
    /*
    testing main function
    */
    public static void main(String[] args) throws IOException{
        Driver one = new Driver("Greg","greg");
        Driver two = new Driver("Paul","paul");
        Restaurant Cafe94 = new Restaurant();
        Cafe94.addDriver(one);
        Cafe94.addDriver(two);
        saveDriver(Cafe94);
        
        ArrayList<Driver> driversFromFile = new ArrayList<>();
        driversFromFile = readDrivers("DriverList.txt");
        
        System.out.println(driversFromFile);
        System.out.println(driversFromFile.get(0).getDriverID());
    }
}
