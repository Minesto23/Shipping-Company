package Test;

/* Made by Miguel Morales 
Matricular no. 15590763*/

import Methods.Methods;

public class Test {

	public static void main(String[] args) {
		
		// variable initialization  
		int [] items = new int[4]; // array to content the user's order
		int [] shipping_result = new int[3]; // array to content the results.
		
		items = Methods.user_Input();
		
		shipping_result = Methods.Calculate_shipping(items);
		
		Methods.nice_print(shipping_result);
		
		
	}
}
