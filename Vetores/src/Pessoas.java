
import java.util.Scanner;

public class Pessoas {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Quantidade de pessoas??");

		int n = sc.nextInt();

		String[] nomes = new String[n];
		int[] idades = new int[n];
		double[] alturas = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Dados da " + (i + 1) + "a pessoa");
			System.out.println("NOme da pessoa");
			nomes[i] = sc.next();
			System.out.println("Idade:");
			idades[i] = sc.nextInt();
			System.out.println("Altura:");
			alturas[i] = sc.nextDouble();
		}

		double soma = 0.0;
		for (int i = 0; i < n; i++) {
			soma = soma + alturas[i];
		}

		double mediasAlturas = soma / n;

		System.out.printf("Atura média: %.2f%n", mediasAlturas);

		int count = 0;

		for (int i = 0; i < n; i++) {
			if (idades[i] < 16) {
				count = count + 1;
			}
		}

		double percent = count * 100.0 / n;
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", percent);

		for (int i = 0; i < n; i++) {
			if (idades[i] < 16) {
				System.out.printf("Quem:" + nomes[i]);
			}
		}

		sc.close();
	}

}
