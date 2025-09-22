package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Account acconnt;
		
		System.out.println("Enter accont number:");
		int number= sc.nextInt();
		System.out.println("Enter accont holder:");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.println("Tem deposito inicial?? Y/N");
		char responde = sc.next().charAt(0);
		if (responde == 'y') {
			System.out.println("Qual deposito incial?");
			double inicialDeposit = sc.nextDouble();
			acconnt =  new Account (number, holder, inicialDeposit);
			
		} else {
					acconnt = new Account(number, holder);
		}
		
		
		System.out.println();
		System.out.println("Accont data:");
		System.out.println(acconnt);
		
		System.out.println();
		System.out.println("Enter deposit value:");
		double depositValue = sc.nextDouble();
		acconnt.deposit(depositValue);
		System.out.println("Update account data:");
		System.out.println(acconnt);
		sc.close();
		
		
		
	}

}
