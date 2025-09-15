import java.util.Scanner;

public class NumerosInteiros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Numero de entrada que ira se repetir de acordo com o numero que voce colocar:");
		int n = sc.nextInt();
		
		
		int [] vect = new int [n];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.println("Digite os numeros:");
			vect[i]= sc.nextInt();
			
			
		}
		
		System.out.println("Numeros negativos:");
		for (int i = 0; i < vect.length; i++) {
				if (vect [i] < 0) {
					System.out.println(vect [i]);
				}
		}

		sc.close();
	}

}
