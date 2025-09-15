import java.util.Locale;
import java.util.Scanner;

public class Valor_Unitario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		
		int peca1, peca2; 
		int numero1, numero2;
		double preco1, preco2, total;
		System.out.println("Valor das pecas: ");
		peca1 = sc.nextInt();
		numero1 = sc.nextInt();
		preco1= sc.nextDouble();
		
		peca2 = sc.nextInt();
		numero2 = sc.nextInt();
		preco2= sc.nextDouble();
		
		
		total = preco1 * numero1 + preco2 * numero2;
	
		
		System.out.printf("Valor a pagar: R$ %.2f%n", total);
		
		sc.close();
		
		
	}

}
