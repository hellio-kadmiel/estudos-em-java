import java.util.Locale;
import java.util.Scanner;

public class Valor_Unitario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		
		int peca_1, peca_2; 
		int numero1, numero2;
		double preco1, preco2, total;
		System.out.println("Valor das pecas: ");
		System.out.println("Digite o valor da peca ");
		peca_1 = sc.nextInt();
		System.out.println("Digite o numero da peca um");
		numero1 = sc.nextInt();
		System.out.println("Qual preco da peca 1");
		preco1= sc.nextDouble();
		System.out.println("qual valor da peca dois?");
		peca_2 = sc.nextInt();
		System.out.println("qual numero da peca dois?");
		numero2 = sc.nextInt();
		System.out.println("qual preco?");
		preco2= sc.nextDouble();
		
		
		total = preco1 * numero1 + preco2 * numero2;
	
		
		System.out.printf("Valor a pagar: R$ %.2f%n", total);
		
		sc.close();
		
		
	}

}
