import java.util.ArrayList;
import java.util.Collections;

public class Customer extends User {
	
	private static ArrayList<Customer> customers = new ArrayList<>();
	private static String address;
	private static int num = 0;
	private static String id = "C" + num; 
	
	// creates an example customer
	static {
		Customer num = new Customer("Test", "Customer", "32 Walaby Way");
		customers.add(num);
	}
	
	// the consturctor wich will create a unique ID each time one is added
	public Customer(String firstName, String lastName, String address) {
		super(firstName, lastName);
		this.id = "C" + num;
		this.address = address;
		num++;
	}
	
	// returns the full customer object
	public static Customer getCustomer(int i) {
		return customers.get(i);
	}
	
	// return customer ID
	public static String getID() {
		return id;
	}
	
	public static String getAddress() {
		return address;
	}
}
