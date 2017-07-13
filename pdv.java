import java.util.Scanner;
public class pdv {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite vrijednost bez PDV-a :");
		double bezPDVa = unos.nextDouble();
		double vrijednostPDVa = bezPDVa * 0.17;
		double konacnaCijena = bezPDVa + vrijednostPDVa;
		System.out.println("Vrijednost PDVa je: "+ vrijednostPDVa + " KM");
		System.out.println("Konacna cijena je: "+ konacnaCijena + " KM");
	}
}