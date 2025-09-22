package programa;
import entities.ContaBancaria;
import java.util.Scanner;
public class Banco {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número da conta: ");
        int numeroConta = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite o nome do titular: ");
        String titular = sc.nextLine();

        System.out.print("Há um depósito inicial (y/n)? ");
        char resposta = sc.next().charAt(0);

        ContaBancaria conta;
        if (resposta == 'y') {
            System.out.print("Digite o valor do depósito inicial: ");
            double depositoInicial = sc.nextDouble();
            conta = new ContaBancaria(numeroConta, titular, depositoInicial);
            System.out.println("Seu depósito inicial foi de: " + depositoInicial);
        } else {
            conta = new ContaBancaria(numeroConta, titular);
            System.out.println("Conta criada com saldo de zero.");
        }

        System.out.println("\nDados da conta:");
        System.out.println(numeroConta);
        System.out.println("\nNome do titular:");
        System.out.println(titular);


        System.out.print("\nDigite o valor do depósito: ");
        double deposito = sc.nextDouble();
        conta.depositar(deposito);
        System.out.println("\nDados da conta atualizados:");
        System.out.println(conta);

        System.out.print("\nDigite o valor do saque: ");
        double saque = sc.nextDouble();
        conta.sacar(saque);
        System.out.println("\nDados da conta atualizados:");
        System.out.println(conta);

        sc.close();
    }
}
