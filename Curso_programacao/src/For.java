import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantidade de números: ");
		int n = sc.nextInt();
		int soma = 0;

		for (int i = 0; i < n; i++) {
			System.out.println("Digite os números: ");
			int x = sc.nextInt();
			soma = soma + x;

		}
		System.out.printf("A soma dos números é: %d%n", soma);

		sc.close();

	}

}
