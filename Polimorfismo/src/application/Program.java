package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		
		
		Scanner sc = new Scanner(System.in);
		
		List<Employee> listaDeFunncionarios = new ArrayList<>();
		
		
		System.out.println("Quantidade de funcionarios??");
		int n = sc.nextInt();
		
		for (int  i =1; i<= n; i++) {
			System.out.println("Dados do funN°: " + i + " data");
			System.out.println("OutSource (y/n)");
			char ch = sc.next().charAt(0);
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Quantidade de Horas?");
			int hours = sc.nextInt();
			System.out.println("Valor por hora: ");
			double valuePerHour = sc.nextDouble();
			if (ch == 'y') {
				System.out.print("Taxa adicional: ");
				double addionalCharge = sc.nextDouble();
				Employee emp = new OutsourcedEmployee(name, hours, valuePerHour, addionalCharge);
				listaDeFunncionarios.add(emp);
				
			}
			else {
				Employee emp = new Employee(name, hours, valuePerHour);
				listaDeFunncionarios.add(emp);
			}
			System.out.println();
			System.out.println("PAYMENTS");
			for (Employee emp : listaDeFunncionarios) {
				System.out.println(emp.getName() + "- $" + String.format("%.2f",emp.payment()));
			}
			
		}
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
