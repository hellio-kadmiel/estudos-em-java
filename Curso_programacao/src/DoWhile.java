import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		char resposta;

		do {
			System.out.print("Digite a temperatura: ");
			double c = sc.nextDouble();
			double f = 9.0 * c / 5.0 + 32.0;
			System.out.printf("O valor em Fahrenheit: %.1f%n ", f);
			System.out.println("Deseja repetir? (S/N)");
			resposta = sc.next().charAt(0);
		} while (resposta != 'n');
		System.out.println("A conta foi encerrada");

		sc.close();

	}
}
