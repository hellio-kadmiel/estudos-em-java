import java.util.Scanner;

public class Hora_Maxima {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int horaN = sc.nextInt();
		int horaF = sc.nextInt();
		int duracao;

		if (horaN < horaF) {

			duracao = horaF = horaN;

		} else {

			duracao = 24 - horaN + horaF;
		}

		System.out.printf("O JOGO DUROU " + duracao + "HORAS(S) ");

		sc.close();

	}

}
