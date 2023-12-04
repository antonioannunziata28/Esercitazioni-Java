package classi.esercizi;

import java.util.Scanner;

public class RettangoloMain {

	public static void main(String[] args) {
		// Creare la classe Rettangolo con i metodi calcolaArea() e calcolaPerimetro();
		System.out.println("Creare la classe Rettangolo con i metodi calcolaArea() e calcolaPerimetro()");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Dammi il valore della base");
		int base = scanner.nextInt();
		System.out.println("Ora dammi il valore dell'altezza");
		int altezza = scanner.nextInt();
		
		scanner.close();
		
		Rettangolo rettangolo1 = new Rettangolo(base, altezza);
		rettangolo1.calcolaPerimetro();
		rettangolo1.calcolaArea();
		
	}

}
