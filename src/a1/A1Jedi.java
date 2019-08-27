package a1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int total_items = scan.nextInt();
		String item_name[] = new String[total_items];
		int item_quantity[] = new int[total_items];
		int num_customer_buy[] = new int[total_items];
		
		for (int i=0; i<total_items; i++) {
			item_name[i] = scan.next();
			scan.nextDouble();
		}
		
		int total_customers = scan.nextInt();
		int total_product_per_customer;
		
		for (int j=0; j<total_customers; j++) {
			scan.next();
			scan.next();
			total_product_per_customer = scan.nextInt();
			int temp[] = new int[total_product_per_customer];
			for (int k=0; k<total_product_per_customer; k++) {
				int quantity = scan.nextInt();
				String item = scan.next();
				int item_index = Arrays.asList(item_name).indexOf(item);
				item_quantity[item_index] += quantity;
				boolean contains = IntStream.of(temp).anyMatch(x -> x == item_index);
				if (contains==false) {
					num_customer_buy[item_index] += 1;
				}
				temp[k] = item_index;
			}
		}
		
		for (int k=0; k<total_items; k++) {
			if(num_customer_buy[k]==0) {
				System.out.println("No customers bought "+item_name[k]);
			}
			else {
				System.out.println(num_customer_buy[k]+" customers bought "+item_quantity[k]+" "+item_name[k]);
			}
		}
		
		
	}
}

