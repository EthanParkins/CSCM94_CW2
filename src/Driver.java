import java.util.ArrayList;

public class Driver extends Staff {
	private String driverID;
	//static ArrayList<Driver> drivers = new ArrayList<>();
	static int count = 0;

        /**
         * Driver constructor 
         * @param firstName
         * @param lastName 
         */
	public Driver(String firstName, String lastName) {
		super(firstName, lastName);
		this.driverID = "D" + String.valueOf(Driver.count);
		Driver.count++;
	}

        /**
         * Returns the driver ID
         * @return 
         */
	public String getDriverID(){
		return this.driverID;
	}
        
        /**
         * To string method, | to break up text in text file to read in.
         * @return 
         */
        public String toString(){
            return this.getFirst() + "|" + this.getLast() + "|" + this.driverID
                    + "|" + this.getSchedule() + "|" + this.getHoursWorked(); 
        }
}
