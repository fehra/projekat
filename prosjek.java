import java.util.Scanner;
public class prosjek {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite tri cijela broja : ");
		int prvi =  unos.nextInt();
		int drugi = unos.nextInt();
		int treci = unos.nextInt();
		double rezultat = ((prvi + drugi + treci)/3);
		System.out.println("prosjek brojeva iznosi " + rezultat);

}
}
