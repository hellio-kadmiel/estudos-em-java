import java.util.Scanner;

public class Condicao {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite as horas:");
		int hora = sc.nextInt();

		if (hora < 12) {
			System.out.println("Bom dia");
		} else if (hora <=18) {
			System.out.println("Boa tarde");
		} else if (hora <=24) {
			System.out.println("Boa noite");
		} else {
			System.out.println("hora errada");
		}

		sc.close();

	}
}
