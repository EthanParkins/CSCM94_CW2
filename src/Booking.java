import java.util.ArrayList;
import java.util.Date;
import java.util.Calendar;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Booking {
	
	//private ArrayList<Booking> booking;
	private int numGuest;
	private Date date;
	private Date endDate;
	private int id;
	private int duration;
	private boolean approved;
	private boolean confirmation;
	
	//Formats the date and time to day/month/year and hour:minutes 
	private SimpleDateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm");
		
	
	public Booking (int customerID, int guest, String date) {
		id = customerID;
		numGuest = guest;
		this.date = toDate(date);
		duration = 1;
		endDate = ;
		approved = false;
		confirmation = true;
	}
	
	@Override
	public String toString() {
		return "ID: " + id + "\nDate and time: " + date.toString() + "\nDuration: " + duration + " hour\nApproved: " + approved;
	}
	
	public int getID() {
		return id;
	}
	
	public int getGuestNum() {
		return numGuest;
	}
	
	public int getduration() {
		return duration;
	}
	
	public void setGuestNUm(int newGuest) {
		numGuest = newGuest;
	}
	
	public void extendDuration(int newTime) {
		duration = newTime;
		
	}
	
	public void approve() {
		approved = true;
	}
	
	public void cancel(int bookingID) {
		confirmation = false;
	}
	
	//Method to parse a String to a Date variable
	private Date toDate(String date) {
		Date dateTime = null;
		
		//This was generated by eclipse, will have to test properly and probably tweak it
		try {
			dateTime = df.parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dateTime;
	}
	
	
	
	public static void main(String[] args) {
		Date date = new Date();
		Booking b1 = new Booking(10928, 4, "22/03/22 12:00");
		
		System.out.println(b1.toString());
	}
	
}
