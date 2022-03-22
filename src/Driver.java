import java.util.ArrayList;

public class Driver extends Staff {
	private String driverID;
	static ArrayList<Driver> drivers = new ArrayList<>();
	static int count = 0;

	public Driver(String firstName, String lastName) {
		super(firstName, lastName);
		this.driverID = "D" + String.valueOf(Driver.count);
		Driver.count++;
	}

	public String getDriverID(){
		return this.driverID;
	}
}
