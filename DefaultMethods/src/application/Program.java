package application;

import services.BrazilInterestService;
import services.InterestService;
import services.UsaInterestService;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Amount:");
        int months = sc.nextInt();

        InterestService service = new BrazilInterestService(1.0);
        double payment = service.payment(100.0, months);
        System.out.printf("Payment after %d months: %.2f%n", months, payment);







        sc.close();

    }


}
