package classi.esercizi;

public class Calcolatrice {

	private int a;
	private int b;
	
	public void somma() {
		int somma = a + b;
		System.out.println("La somma di " + a + " + " + b + " equivale a " + somma);
	}
	
	public void moltiplicazione() {
		int moltiplicazione = a * b;
		System.out.println("La moltiplicazione di " + a + " x " + b + " equivale a " + moltiplicazione);
	}
	
	public void divisione() {
		int divisione = a / b;
		System.out.println("La divisione di " + a + "/" + b + " equivale a " + divisione);
	}
	
	public void sottrazione() {
		int sottrazione = a - b;
		System.out.println("La sottrazione di " + a + "-" + b + " equivale a " + sottrazione);
	}
}
