package it.udemy.classi;

import java.util.Objects;

public class Persona {

	private String nome;
	private String cognome;
	private String indirizzo;
	private int numTelefono;
	
	
	public Persona(String nome, String cognome, String indirizzo, int numTelefono) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.indirizzo = indirizzo;
		this.numTelefono = numTelefono;
	}

	

	@Override
	public String toString() {
		return "Persona: nome =" + nome + ", cognome=" + cognome + ", indirizzo=" + indirizzo + ", numTelefono="
				+ numTelefono;
	}
	
	
//	@Override
//	public boolean equals(Object obj) {
//		Persona other = (Persona) obj;
//		
//		if(nome.equals(other.getNome()) && 
//				cognome.equals(other.getCognome()) &&
//				indirizzo.equals(other.getIndirizzo()) &&
//				numTelefono == other.getNumTelefono()) {
//			return true;
//		} else {
//			return false;
//		}
//	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(cognome, other.cognome) && Objects.equals(indirizzo, other.indirizzo)
				&& Objects.equals(nome, other.nome) && numTelefono == other.numTelefono;
	}



	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCognome() {
		return cognome;
	}


	public void setCognome(String cognome) {
		this.cognome = cognome;
	}


	public String getIndirizzo() {
		return indirizzo;
	}


	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}


	public int getNumTelefono() {
		return numTelefono;
	}


	public void setNumTelefono(int numTelefono) {
		this.numTelefono = numTelefono;
	}
	
	
	
}
