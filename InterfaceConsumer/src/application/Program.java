package application;

import entities.Product;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.UK);
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("Hd Case", 80.00));


        System.out.println("Precos originais:");
        list.forEach(System.out::println);
        list.forEach(Product::staticPriceUpdate);
        System.out.println("\nPrecos atualizados após aumento:");
        // usando reference method para o print
        list.forEach(System.out::println);



    }
}
