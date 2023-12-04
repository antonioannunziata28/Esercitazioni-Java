package it.udemy.classi;

public class Libro {

	private String nome;
	private String autore;
	private double prezzo;
	
	public Libro(String nome, String autore, double prezzo) {
		super();
		this.nome = nome;
		this.autore = autore;
		this.prezzo = prezzo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
}
