import java.util.ArrayList;

public class Staff extends User {
	private ArrayList<String> schedule;
	private int totalHoursWorked;

	public Staff(String firstName, String lastName) {
		super(firstName, lastName);
		this.schedule = new ArrayList<String>();
		this.totalHoursWorked = 0;
	}

	public void viewSchedule() {
		for (String s : this.schedule) {
			System.out.println(s);
		}
	}

}
