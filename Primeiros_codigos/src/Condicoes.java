import java.util.Scanner;

public class Condicoes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numero;
		
		numero = sc.nextInt();
		
		if (numero % 2 == 0 ) {
			
			System.out.println("numero eh par");
			
		}
		else {
			System.out.println("Numero eh impar");
		}
		

		sc.close();

	}

}
