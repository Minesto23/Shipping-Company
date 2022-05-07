package Containers;

/* Made by Miguel Morales 
Matricular no. 15590763*/

import Methods.Methods;

public class Container {
	
	
	/* method that calculate the volume of each container and return the 
	 	value depending of which size of container you pass as argument
		's' to small and 'b' to big
	*/
	public static double Volume(char container_size) {
		
		/* Declaration  and initialization of containers array 
		   where be stored container dimensions*/
		
		double [] small_container = {2.59,2.43,6.06};
		double [] big_container = {2.59,2.43,12.01}; 
		
		if (container_size == 's') {
			return Methods.volume_calculator(small_container);
		}else if(container_size =='b') {
			return Methods.volume_calculator(big_container);
		}
		
		return 0;
		
	}
	
	/* method to calculate the best shipping option to the client depending
	 * on the total volume and the total weight 
	 */
	
	public static int[] best_shipping(double total_volume, double total_weight) {
		
		/* Declaration  and initialization of containers array 
		   where be stored container dimensions*/
		
		int [] shipping_result = {0,0,0};
		int small_container_price1 = 1000;
		int small_container_price2 = 1200;
		int big_container_price = 1800;
		double rest_weigth = 0; // Variable to calculate the resting weight  
		
		if(total_volume <= Volume('s')) { //verify if the order can be inside of one small container
			
			shipping_result[0] = 1;
			if(total_weight<=500) {
				shipping_result[2] = small_container_price1;
			}else {
				shipping_result[2] = small_container_price2;
			}
			
		}else if(total_volume > Volume('s') && total_volume <= Volume('b')){ 
			// if the order need only two small container is better use one big container instead for a lower price.
			shipping_result[1] = 1;
			shipping_result[2] = big_container_price;
			
		}else if(total_volume > Volume('b')) {
			
			/* calculate the number of big container required 
			(use more big containers gives a better price that more small containers)*/
			shipping_result[1] =  (int) (total_volume/Volume('b'));
			shipping_result[2] = shipping_result[1]*big_container_price; //adding the price of the big containers required
			
			if (total_volume%Volume('b')<=Volume('s')) {
				// if the rest of volume can be put inside of a small container, we adding a small container to the results
				shipping_result[0] = 1;
				rest_weigth = ((total_volume%Volume('b'))/total_volume) * total_weight;
				
				if(rest_weigth<=500) {
					
					shipping_result[2]+=small_container_price1;
					
				}else {
					
					shipping_result[2]+=small_container_price2;
				}
				
			}else {
				
				shipping_result[1]+=1;
				shipping_result[2]+=big_container_price;
			}
		}
		
		
		return shipping_result;
	}
}
