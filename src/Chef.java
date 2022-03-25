import java.util.ArrayList;

public class Chef extends User {
	private String chefID;
	static ArrayList<Chef> chefs = new ArrayList<>();
	static int count = 0; //Used to generate unique ID.
	
	//Constructor
	public Chef(String firstName, String lastName) {
		super(firstName, lastName);
		this.chefID = "F" + String.valueOf(Chef.count);
		Chef.count++;
	}
	
	public String getChefID(){
		return this.chefID;
	}
	
	//public viewOrders() {
	//	
	//}
	
	//public addSpecials(Menu menu){
	// 
	//}
	
	//public void unavailable(Food foodItem) {
	// 
	//}
	
	//public void orderReady(Order order){
	//
	//}
}
