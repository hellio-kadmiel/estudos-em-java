package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Entre com o nome de departamento:");
		String departmentName = sc.nextLine();
		System.out.print("Qual data:");
		String nomeDoTrabalhador = sc.nextLine();
		System.out.print("Level:");
		String leveDoTrabalhador = sc.nextLine();
		System.out.print("Qual salario");
		double baseSalary = sc.nextDouble();

		Worker Worker = new Worker(nomeDoTrabalhador, leveDoTrabalhador.valueOf(leveDoTrabalhador), baseSalary,
				new Department(departmentName));

		System.out.println("Quantos contratos??");

		int n = sc.nextInt();

		for (int i = 1; i < n; i++) {
			System.out.println("Entre com contrato #" + i + "Data");
			System.out.println("Date (DD/MM/YYY");
			Date contractDate = sdf.parse(sc.next());
			System.out.println("VAlor por hora:");
			double valuePerHour = sc.nextDouble();
			System.out.println("duracao de horas:");
			int hours = sc.nextInt();
			HourContract contract = new HourContract(contractDate, hours, valuePerHour);
			Worker.addContrac(contract);
		}

		System.out.println();
		System.out.println("Entre com mes e ano para calcular salario (MM/YYYY)");
		String monthAndTYear = sc.next();
		int month = Integer.parseInt(monthAndTYear.substring(0, 2));
		int year = Integer.parseInt(monthAndTYear.substring(3));
		System.out.println("Name:" + Worker.getName());
		System.out.println("departmt:" + Worker.getDepartment().getName());
		System.out.println("ele ganhou" + monthAndTYear + ":" + Worker.income(year, month));

		sc.close();

	}

}
