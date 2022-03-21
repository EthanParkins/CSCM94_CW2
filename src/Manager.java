import java.util.ArrayList;

public class Manager extends Staff {
	private String managerID;
	static int count = 0;
	static ArrayList<Manager> managers = new ArrayList<>();

	Manager(String firstName, String lastName) {
		super(firstName, lastName);
		this.managerID = "M" + String.valueOf(Manager.count);
		Manager.count++;
	}
	
	public void createChef(String firstName, String lastName) {
		Chef chef = new Chef(firstName, lastName);
		Chef.chefs.add(chef);
	}
	
	public void createWaiter(String firstName, String lastName) {
		Waiter waiter = new Waiter(firstName, lastName);
		Waiter.waiters.add(waiter);
	}
	
	public void createDriver(String firstName, String lastName) {
		Driver driver = new Driver(firstName, lastName);
		Driver.drivers.add(driver);
	}
	
	public void createManager(String firstName, String lastName) {
		Manager manager = new Manager(firstName, lastName);
		Manager.managers.add(manager);
	}
}
