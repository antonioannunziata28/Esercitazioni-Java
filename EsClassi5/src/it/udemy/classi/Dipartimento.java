package it.udemy.classi;

import java.util.ArrayList;
import java.util.List;

public class Dipartimento {

	private String nome;
	private int numTelefono;
	private Impiegato dirigente;
	private String cittaSede;
	private String regioneSede;
	private List<Impiegato> impiegati = new ArrayList<>();
	
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumTelefono() {
		return numTelefono;
	}
	public void setNumTelefono(int numTelefono) {
		this.numTelefono = numTelefono;
	}
	public Impiegato getDirigente() {
		return dirigente;
	}
	public void setDirigente(Impiegato dirigente) {
		this.dirigente = dirigente;
	}
	public String getCittaSede() {
		return cittaSede;
	}
	public void setCittaSede(String cittaSede) {
		this.cittaSede = cittaSede;
	}
	public String getRegioneSede() {
		return regioneSede;
	}
	public void setRegioneSede(String regioneSede) {
		this.regioneSede = regioneSede;
	}
	public List<Impiegato> getImpiegati() {
		return impiegati;
	}
	public void setImpiegati(List<Impiegato> impiegati) {
		this.impiegati = impiegati;
	}
	@Override
	public String toString() {
		return "Dipartimento [nome=" + nome + ", numTelefono=" + numTelefono + ", dirigente=" + dirigente
				+ ", cittaSede=" + cittaSede + ", regioneSede=" + regioneSede + ", impiegati=" + impiegati + "]";
	}
	
	
	
}
