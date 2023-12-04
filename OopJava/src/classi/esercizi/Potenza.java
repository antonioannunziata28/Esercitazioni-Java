package classi.esercizi;

public class Potenza {
	
	private int base;
	
	public Potenza(int a) {
		this.base = a;
	}
	
	public void pow() {
		int potenzaBase = base * base;
		System.out.println(potenzaBase);
	}

	public void cambioBase(int base) {
		this.base = base;
	}
	
	
}
