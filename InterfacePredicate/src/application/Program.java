package application;

import entities.Product;
import util.ProductPredicate;

import javax.sql.rowset.Predicate;
import java.util.ArrayList;
import java.util.List;

public class Program {


    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("Hd Case", 80.00));
         double min = 100.0;
         // vai dar erro porque o predicado tem que ser do tipo Predicate<Product> e não Predicate<Double>
        Predicate<Product> pred = p -> p.getPrice() >= 100.0;

        list.removeIf( new ProductPredicate());
        // referencia para metado estatico, usando com ::
        list.removeIf(Product::staticProductPredicate);

        list.removeIf(Product::nonStaticProductPredicate);


        for (Product p : list) {
            System.out.println(p);
        }


    }
}
