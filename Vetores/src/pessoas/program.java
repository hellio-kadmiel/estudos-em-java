package pessoas;

public class program {

	public static void main(String[] args) {
		
		String [] vect = new String[] {
		"maria", "alex", "bob"};
		
		
		
		
		for (int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}
		System.out.println("__________________________________");
		
		for (String obj :vect) {
			
			System.out.println(obj);
		}
		
		
	}

		}
