import java.util.Scanner;

public class SaidaDeDados {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// Atribuindo nome a variavel 'x' que é String
		String x;
		System.out.println("Digite o nome:");
		x = sc.next();

		System.out.println("Voce digitou " + x);
		// Atribuindo valor inteiro a variavel 'z' que é int
		int z;
		System.out.println("Digite um número inteiro:");
		z = sc.nextInt();
		System.out.println("O numero eh: " + z);
		// Atribuindo valor a variavel 'a' que é double
		double a;
		System.out.print("Digite um número do tipo double: ");
		a = sc.nextDouble();

		System.out.printf("O valor do double é: %.2f%n", a);
		// Atribuindo letra a variavel 'b' que é caractere
		char b;
		System.out.println("Digite o char:");

		b = sc.next().charAt(0);
		System.out.println("O char:" + b);

		String c;
		int d;
		double e;
		c = sc.next();
		d = sc.nextInt();
		e = sc.nextDouble();
		System.out.println("Dados digitados:");
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);

		sc.close();

	}

}
