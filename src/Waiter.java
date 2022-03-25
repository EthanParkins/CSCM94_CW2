import java.util.ArrayList;



public class Waiter extends Staff {
	private String waiterID;
	static int count = 0;
	static ArrayList<Waiter> waiters;

	public Waiter(String firstName, String lastName) {
		super(firstName, lastName);
		this.waiterID = "W" + String.valueOf(Waiter.count);
		Waiter.count++;
	}

	public String getWaiterId(){
		return this.waiterID;
	}
}
