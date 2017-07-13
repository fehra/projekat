import java.util.Scanner;
public class temperatura {
//napisati program koji ucitava od korisnika temp u celzijusima double tipa podatka.nakon što je program 
	//uèitao temp. od strane korisnika pretvara istu u fahrenheite i ispisuje tezultat kosiniku
	public static void main(String[] args) {
		
		Scanner unos = new Scanner (System.in);
		System.out.println("Unesite temperaturu u celzijusima: ");
		double celzij=unos.nextDouble();
		double Fahrenheit = (9.0/5) * celzij + 32;
		System.out.println("temperatura u fahrenheitima je:" + Fahrenheit);
	}

}
