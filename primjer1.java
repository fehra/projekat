import java.util.Scanner;
public class primjer1 {
	

	public static void main(String[] args) {
	  // deklarisati varijable i dodijeliti im vrijednosti
		int broj = 5;
		int rezultat = broj * 2;
		//isprintati rezultat
		System.out.println("rezutat je : " + rezultat);
		//povrsina kruga
	/*	double poluprecnik = 20;
		double pi = 3.14159;
		double povrsina = poluprecnik * poluprecnik * pi ;
		System.out.println("povrsina kruga je : " + povrsina); */
		
		System.out.println("unesite jedan broj");
		Scanner input = new Scanner(System.in);
		double pi = 3.14159;
		double poluprecnik = input.nextDouble();
		double povrsina = poluprecnik * poluprecnik * pi ;
		System.out.println("povrsina kruga poluprecnika " + poluprecnik + "iznosi " + povrsina );
		
	
	}

}
