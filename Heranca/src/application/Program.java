package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {

		/*Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		*/
			
		
		//Polimorfismo
		
		Account x = new Account(1020, "Alex", 1000.0);
		Account z = new SavingsAccount(1023, "maria", 1000.0, 0.1);
		
		x.withdraw(50.0);
		z.withdraw(50.0);
		
		System.out.println(x.getBalance());
		System.out.println(z.getBalance());
		/* UPCASTING
		
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
		
		// DOWNCASTING
		
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loan(100.0);
		
		// BusinessAccount acc5 = (BusinessAccount)acc3;
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
			System.out.printf("Saldos: Acc2=%.2f, Acc3=%.2f, Acc1=%.2f%n", 
	                 acc2.getBalance(), acc3.getBalance(), acc1.getBalance());
		} */
	}
}