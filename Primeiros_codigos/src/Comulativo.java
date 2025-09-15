import java.util.Scanner;

public class Comulativo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o tempo: ");
		int minutos = sc.nextInt();

		double conta = 50.0;

		if (minutos > 100) {
			/* Atribuindo o valor no cumulativo no conta */
			conta +=  (minutos - 100) * 2.0;

		}
		System.out.printf("Valor a pagar: R$ %.2f", conta);

		sc.close();

	}

}
