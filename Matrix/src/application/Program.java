package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("O numero que voce digitar é a quantidade de vezes que o codigo ira se repetir");
		System.out.println("Digite um inteiro da matriz:  ");
		int n = sc.nextInt();

		int[][] matriz = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
			}

		}

		System.out.println("Main Diagonal:");
		for (int i = 0; i < matriz.length; i++) {
			System.out.print(matriz[i][i] + " ");
		}

		System.out.println();
		System.out.println("Encotrarar numero negativos ");

		int contador = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] < 0) {
					System.out.println("Negativos encontrados" + matriz[i][j]);
					contador++;
				}
			}
		}
		System.out.println("Total de numeros negativos:" + contador);

		sc.close();

	}

}
