package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		int total_customers = scan.nextInt();
		String[] name = new String[total_customers];
		String total_price[] = new String[total_customers];
		
		
		for (int i=0; i<total_customers; i++) {
			double price_sum = 0;
			String first_name = scan.next();
			String last_name = scan.next();
			name[i] = first_name.substring(0, 1)+". "+last_name+": ";
			int number_of_item = scan.nextInt();
			for (int j=0; j<number_of_item; j++) {
				int quantity = scan.nextInt();
				scan.next();
				double price = scan.nextDouble();				
				price_sum += quantity * price;	
			}
			String price_to_decimal = String.format ("%.2f", price_sum);
			total_price[i]=price_to_decimal;
			
		}
		scan.close();
		for (int k=0; k<total_customers; k++) {
			System.out.println(name[k]+total_price[k]);
		}
	
	}
}

