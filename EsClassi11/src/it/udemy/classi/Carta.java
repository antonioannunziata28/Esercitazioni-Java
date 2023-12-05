package it.udemy.classi;

public class Carta {

	private String valore;
	private String seme;
	
	
	public Carta(String valore, String seme) {
		this.valore = valore;
		this.seme = seme;
	}

	
	public boolean equals(Carta carta1) {
		if(this.getSeme().equals(carta1.getSeme()) && this.getValore().equals(carta1.getValore())) {
			System.out.println("La carta 1 e la carta 2 hanno lo stesso valore e stesso seme");
			System.out.println("Carta 1 Seme: " + this.getSeme() + " carta 2 seme: " + carta1.getSeme());
			System.out.println("Carta 1 Valore: " + this.getValore() + " carta 2 Valore: " + carta1.getValore());
			return true;
		} else {
			System.out.println("Le due carte confrontante non sono uguali");
			System.out.println("Carta 1 Seme: " + this.getSeme() + " carta 2 seme: " + carta1.getSeme());
			System.out.println("Carta 1 Valore: " + this.getValore() + " carta 2 Valore: " + carta1.getValore());
			return false;
		}
	}
	

	public String getValore() {
		return valore;
	}


	public void setValore(String valore) {
		this.valore = valore;
	}


	public String getSeme() {
		return seme;
	}


	public void setSeme(String seme) {
		this.seme = seme;
	}
	
	
	
	
}
