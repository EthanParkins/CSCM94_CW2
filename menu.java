import java.util.ArrayList;
import java.util.Collections;

public class menu {
	
			//creates the arraylists for menu items & specials
		private static ArrayList<String> items = new ArrayList<>();
		private static ArrayList<String> specials = new ArrayList<>();
		
		//Below are the items methods
		public static void itemsAdd(String item) {
			items.add(item);
		}
		
		public static String returnItem(int i) {
			return items.get(i).toString();
		}
		
		public static void printItems() {
			System.out.println(items.toString());
		}
		
		public static void removeItem(int i) {
			items.remove(i);
		}
		
		
		// Below are the specials methods
		public static void specialsAdd(String item) {
			specials.add(item);
		}
		
		public static String returnSpecial(int i) {
			return specials.get(i).toString();
		}
		
		public static void printSpecials() {
			System.out.println(specials.toString());
		}
		
		public static void removeSpecial(int i) {
			specials.remove(i);
		}
}
