
public class StringFormatadas {

	public static void main(String[] args) {
		String original = "  abcd EFGH abc AGAS JKW abcd   ";
		// Deixa as Strings minusculas
		String s01 = original.toLowerCase();
		// Deixa as Strings minusculas
		String s02 = original.toUpperCase();
		// Corta os espacoes em branco
		String s03 = original.trim();
		// Comeca a contar da terceira posicão
		String s04 = original.substring(3);
		// Comeca a contar da terceira posicão e termina na decima
		String s05 = original.substring(3, 10);
		// ele percorre a string e onde estiver a letra 'a' ele substitue por 'K'
		String s06 = original.replace('a', 'K');
		// ele percorre a string e onde estiver a sequencia "abcd" ele substitue por "OOO"
		String s07 = original.replace("abcd", "OOO");
		// percorre até a posicao bc que seria a terceira
		int i = original.indexOf("bc");
		// vai até a ultima posicao que seria a 26
		int j = original.lastIndexOf("bc");

		System.out.println("Original: -" + original + "-");
		System.out.println("toLowerCase: -" + s01 + "-");
		System.out.println("toUpperCase: -" + s02 + "-");
		System.out.println("trim: -" + s03 + "-");
		System.out.println("substring (3) -" + s04 + "-");
		System.out.println("substring (3,10) -" + s05 + "-");
		System.out.println("replace: -" + s06 + "-");
		System.out.println("replace: -" + s07 + "-");
		System.out.println("Index of 'bc': " + i);
		System.out.println("Last index of 'bc': " + j);

	}

}
