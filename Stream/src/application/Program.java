package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) {
        List <Integer> list = Arrays.asList(3, 4, 5, 7, 8, 9, 10);
        Stream <Integer> st1 = list.stream().map(x -> x * 10);
        // aqui usei to array para imprimir steam
        System.out.println(Arrays.toString(st1.toArray()));
        Stream <String> st2 = Stream.of("Maria", "ALex", "Bob");
        System.out.println(Arrays.toString(st2.toArray()));

        Stream <Integer> st3 = Stream.iterate(0, x -> x + 2);
        // aqui usei limit para limitar o numero de elementos do stream, pois ele é infinito
        System.out.println(Arrays.toString(st3.limit(10).toArray()));
        // sequencia de Fibonacci
        Stream <Long> st4 = Stream.iterate(new Long[] {0L,1L}, p ->  new Long[]{p[1],p[0]+ p[1]}).map(p -> p[0]);
        System.out.println(Arrays.toString(st4.limit(20).toArray()));
    }
}
