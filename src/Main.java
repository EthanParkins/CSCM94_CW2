import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
	
	
		//menu.addItem("tea");
		//menu.addItem("coffee");
		
		//menu.addItem("Burger");
		
		Menu.printItems();
		
		Menu.removeItem(0);
		Menu.printItems();
		//System.out.println(menu.returnItem(0));
		//System.out.println(menu.returnSpecial(0));
		
		
		
		System.out.println(Customer.getID());
		
		System.out.println(Customer.getCustomer(0).getID());
		System.out.println(Customer.getCustomer(0).getFirst());
	}	
}