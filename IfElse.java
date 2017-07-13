
public class IfElse {

	public static void main(String[] args) {
		int broj = 100;
		if (broj <= 0) {
			System.out.println("Molimo vas unesite broj veci od nule");
		} else if (broj >= 100) {
			System.out.println("Molimo vas unesite broj manji ili jednak od 100");
		} else {
			System.out.println("Broj koji ste unijeli je" + broj);
		}

	}

}
