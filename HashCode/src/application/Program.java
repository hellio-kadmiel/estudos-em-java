package application;

import entities.Client;

public class Program {

    public static void main(String[] args) {

        Client c1 = new Client("Maria", "maria@gmail.com");
        Client c2 = new Client("Maria", "maria@gmail.com");
        String s1 = "Test";
        String s2 = "Test";
        String s3 = new String("Test");
        // Equals compara o conteúdo dos objetos, ou seja, os atributos, e não a referência de memória
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));
        // mesmo conteúdo, mas são objetos diferentes, por isso o resultado é false
        System.out.println(c1 == c2);

        System.out.println(s1 == s2);
        // Da falso porque s3 é um objeto diferente, mesmo que o conteúdo seja o mesmo
        System.out.println(s1 == s3);










    }
}
