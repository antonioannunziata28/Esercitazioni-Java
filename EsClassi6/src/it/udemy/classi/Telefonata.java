package it.udemy.classi;

public class Telefonata {

	private int numero;
	private int durata;
	private int costo;

	
	public Telefonata(int numero, int durata, int costo) {
		super();
		this.numero = numero;
		this.durata = durata;
		this.costo = costo;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getDurata() {
		return durata;
	}
	public void setDurata(int durata) {
		this.durata = durata;
	}
	public int getCosto() {
		return costo;
	}
	public void setCosto(int costo) {
		this.costo = costo;
	}
	
	
}
