package Items;

/* Made by Miguel Morales 
Matricular no. 15590763*/

import Methods.Methods;

public class Item {

	// Method that calculate the total volume of the shipping
	public static double TotalVolume(int [] items) {
		
		// the items arguments contain the number of item shipping for each product
		
		/* Declaration  and initialization of all the item array 
		   where be stored item dimension */ 
		double total_volume;
		double [] laptop= {0.6,0.5,0.5};
		double [] mouse = {0.3,0.3,0.2};
		double [] desktop = {1,1.5,0.5};
		double [] lcd_screen = {1.2,1.4,0.8};
		
		// calculate the total volume of each item in the order
		double total_laptop_volume = Methods.volume_calculator(laptop) * items[0];
		double total_mouse_volume = Methods.volume_calculator(mouse) * items[1];
		double total_desktop_volume = Methods.volume_calculator(desktop) * items[2];
		double total_lcd_screen_volume = Methods.volume_calculator(lcd_screen) * items[3];
		
		
		//calculate the total volume of the order
		total_volume = total_laptop_volume + total_desktop_volume + total_lcd_screen_volume + total_mouse_volume;
		
		
		return total_volume;
	}
	
	// Method that calculate the total weight of the shipping
	public static double TotalWeight(int [] items) {
		
		// the items arguments contain the number of item shipping for each product

		/* Declaration  and initialization of items_weigth array  
		   where be stored items weight */ 
		
		double total_weight=0;
		double [] items_weight = {6.5,0.2,20,2.6};
		
		//calculate the total weight of the order
		for (int i=0; i<items.length;i++) {
			total_weight += items_weight[i] * items[i];
		}
		
		
		return total_weight;
	}
	

	
}
