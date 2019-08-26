package a1;

import java.util.Arrays;
import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int total_items = scan.nextInt();
		String item_name[] = new String[total_items];
		double item_price[] = new double[total_items];
		
		for (int i=0; i<total_items; i++) {
			item_name[i] = scan.next();
			item_price[i] = scan.nextDouble();
		}
		
		int total_customers = scan.nextInt();
		String costumer_name[] = new String[total_customers];
		double total_spend[] = new double[total_customers];
		double total_money=0;
		double max = 0;
		double min = 1000000;
		String max_person="";
		String min_person="";

		for (int j=0; j<total_customers; j++) {
			double price_sum = 0;
			String first_name = scan.next();
			String last_name = scan.next();
			costumer_name[j] = (first_name+" "+last_name);
			int number_of_item = scan.nextInt();
			for (int k=0; k<number_of_item; k++) {
				int quantity = scan.nextInt();
				String item = scan.next();
				int location = Arrays.asList(item_name).indexOf(item);
				price_sum += quantity * item_price[location];	
				
			}
			total_spend[j]=price_sum;
			if(total_spend[j] > max) {
				max = total_spend[j];
				max_person = costumer_name[j];
			}
			if(total_spend[j] < min) {
				min = total_spend[j];
				min_person = costumer_name[j];
			}
			total_money += price_sum;
			
		}
		
		String average = String.format ("%.2f", total_money/total_customers);
		System.out.println("Biggest: "+max_person+" ("+max+")");
		System.out.println("Smallest: "+min_person+" ("+min+")");
		System.out.println("Average: "+average);
		
	}
}
