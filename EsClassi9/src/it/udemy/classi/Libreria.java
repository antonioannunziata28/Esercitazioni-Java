package it.udemy.classi;

public class Libreria {

	private Libro[] listaLibri = new Libro[10];

	public Libreria(Libro[] listaLibri) {
		this.listaLibri = listaLibri;
	}
	
	public Libro[] ricercaPerAutorePrezzoMaggiore(String nomeLibro, int prezzo) {
		Libro[] res = new Libro[10];
		int posizioneArray = 0;
		
		for (int i = 0; i < listaLibri.length; i++) {
			if(listaLibri[i] != null && listaLibri[i].getAutore().equals(nomeLibro) &&
					listaLibri[i].getPrezzo() > prezzo) {
				res[posizioneArray] = listaLibri[i];
				posizioneArray++;
			}
		}
		return res;
	}
	
	public String[] ricercaPerAutore(String autore) {
		int posizioneArray = 0;
		String[] res = new String[10];
		
		for(int i = 0; i < listaLibri.length; i++) {
			if(listaLibri[i] != null && listaLibri[i].getAutore().equals(autore)) {
				res[posizioneArray] = listaLibri[i].getNome();
				posizioneArray++;
			}
		}
		return res;
	}
	
	
}
