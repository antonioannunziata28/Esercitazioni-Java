package classi.esercizi;

public class Rettangolo {

	public int base;
	public int altezza;
	
	public Rettangolo(int base, int altezza) {
		
		this.base = base;
		this.altezza = altezza;
	}
	
	public int calcolaPerimetro() {
		int perimetro = (this.base * 2) + (this.altezza * 2);
		System.out.println("Il perimetro del rettangolo è: " + perimetro + " cm");
		return perimetro;
	}
	
	public int calcolaArea() {
		int area = this.base * this.altezza;
		System.out.println("Mentre l'are è di: " + area + " cm2");
		return area;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltezza() {
		return altezza;
	}

	public void setAltezza(int altezza) {
		this.altezza = altezza;
	}
	
	
}
