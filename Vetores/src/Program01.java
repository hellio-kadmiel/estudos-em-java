
import java.util.Scanner;

import entities.Product;

public class Program01 {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 
	 
	 int n = sc.nextInt();
	 Product [] vect = 	new Product[n];
	
	 
	 for (int i = 0; i < n; i++) {
		 sc.nextLine();
		 String name = sc.nextLine();
		 double price = sc.nextDouble();
		 vect [i] = new Product(name, price);
	}
	 
	 
	 double sum = 0.0;
	 for (int i = 0; i < vect.length; i++) {
		sum += vect[i].getPrice();
		
	}
	 double resultadoDaSoma= sum / n;
	 System.out.printf("Average price = %.2f%n", resultadoDaSoma);
	 
	 
	 
	 
	 sc.close();
	}

}
