import java.util.Locale;
import java.util.Scanner;

public class Hora_Trabalhada {

	public static void main(String[] args) {
		
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in) ;
	
	int horas, numeros;
	double valorHora, salario;
	
	
	System.out.println("Qual o numero de Id desse funcionario?");
	numeros = sc.nextInt();
	System.out.println("quantas hora o funcionario " + numeros + " trabalhou ?");
	horas = sc.nextInt();
	System.out.println("O funcionario " + numeros + " trabalhou por um total de horas:" + horas);
	
	System.out.println("quanto é o valor hora?");
	valorHora = sc.nextDouble();
	
	salario = valorHora * horas;
	
	System.out.println("Funcionario NUMBER = " + numeros);
	System.out.printf  ("Salary = U$ %.2f%n", salario);
	
	
	sc.close();
		
		
		
	}
	
}
