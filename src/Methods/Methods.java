package Methods;

/* Made by Miguel Morales 
Matricular no. 15590763*/

import java.util.Scanner;

import Containers.Container;
import Items.Item;

public class Methods {

	// Method that calculate the volume of any item or container
	public static double volume_calculator(double []dimentions) {
		
		double volume=1;
		
		for(int i=0; i< dimentions.length;i++)
			volume *= dimentions[i];
		
		
		return volume;
	}
	
	
	// main method to have the result needed, is here to have a more clean main method
	public static int[] Calculate_shipping(int [] items) {
		
		int [] result = new int[3];
		
		result = Container.best_shipping(Item.TotalVolume(items), Item.TotalWeight(items));
		
		
		return result;
		
	}
	
	//method to collect the data for the user
	
	public static int[] user_Input(){
		
		int [] items = new int[4];
		Scanner userInput = new Scanner(System.in); // Created a Scanner object for the user input
		
		nice_line();
		System.out.println("\n\tWELCOME TO YOUR BEST SHIPPING OPTION\n");
		nice_line();
		System.out.println("We are happy to help you to select the best option for your shippings.\n");
		
		System.out.println("Please enter the follows values for the items to shipping");
		
		System.out.println("Number of Laptops:");
		items[0] = userInput.nextInt();
		
		System.out.println("Number of Mouses:");
		items[1] = userInput.nextInt();
		
		System.out.println("Number of Desktops:");
		items[2] = userInput.nextInt();
		
		System.out.println("Number of LCD Screens:");
		items[3] = userInput.nextInt();
		
		userInput.close(); //close the scanner object
		
		return items;
	}
	
	
	// method used to have a better presentation of the results
	public static void nice_print(int [] result) {
		
		nice_line();
		System.out.println("\nSo your best shipping option is: ");
		System.out.println(result[0] + " Small container(s) and " + result[1] + " Big container(s).");
		System.out.println("For the price of " + result[2] + ".00 euros");
		System.out.println("\nThank you for used our service.");
		System.out.println("\n\nMade by: Miguel Morales");
	}
	
	// method used to print a nice line to give some style to the console program
	public static void nice_line() {
		for(int i=0; i<100;i++) {
			System.out.print("=");
		}
	}

}
