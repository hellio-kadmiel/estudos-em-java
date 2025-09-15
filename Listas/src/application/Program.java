package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

		list.add("Joao");
		list.add("Lucas");
		list.add("Kleber");
		list.add("Joao");
		list.add("gustavo");
		list.add("Joao");
		list.add("maria");
		list.add(2,"Marco");
		System.out.println("-----------------------");
		System.out.println(list.size());
		list.removeIf(x -> x.charAt(0)== 'J');
		for (String x : list) {
			System.out.println(x);
			// List<String> resultado = list.stream().filter( x.charAt(0) ==
			// 'J').collect(Collectors.toList());
		}
		
		System.out.println("-----------------------");
		System.out.println("Index of Lucas:" + list.indexOf(list.indexOf("Lucas")));
		System.out.println("-----------------------");
		List <String> result = list.stream().filter(x -> x.charAt(0)== 'g').collect(Collectors.toList());
		
		for (String x : result ) {
			System.out.println(x);
		}
		System.out.println("-----------------------");
		
		String name = list.stream().filter(x -> x.charAt(0)== 'g').findFirst().orElse(null);
		System.out.println(name);
		
	}

}
