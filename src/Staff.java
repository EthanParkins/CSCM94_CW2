import java.util.ArrayList;

public class Staff extends User {
	private ArrayList<String> schedule;
	private int totalHoursWorked;
        static ArrayList<Driver> driverList = new ArrayList<>();
        
	public Staff(String firstName, String lastName) {
		super(firstName, lastName);
		this.schedule = new ArrayList<String>();
		this.totalHoursWorked = 0;
	}
       
        public ArrayList<String> getSchedule(){
            return schedule;
        }
        
        public int getHoursWorked(){
            return totalHoursWorked;
        }
        
	public void viewSchedule() {
		for (String s : this.schedule) {
			System.out.println(s);
		}
	}

}
