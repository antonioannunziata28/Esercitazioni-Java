package it.udemy.classi;

public class Ufficio {

	private Impiegato[] listaImpiegati;

	public Ufficio(Impiegato[] listaImpiegati) {
		super();
		this.listaImpiegati = listaImpiegati;
	}
	
	public int media(int[] matricola) {
		int somma = 0;
		int numImpiegatiTrovati = 0;
		for (Impiegato impiegato : listaImpiegati) {
			for (int impiegato2 : matricola) {
				if(impiegato.getMatricola() == impiegato2) {
					numImpiegatiTrovati++;
					somma += impiegato.getRetribuzione();
				}
			}
		}
		
		int media = somma/numImpiegatiTrovati;
		return media;
	}
	
	public String[] dipendentiPiuPagati(int[] a) {
		String [] h = new String[this.listaImpiegati.length];
		int media = media(a);
		int posImpiegato = 0;

		for(Impiegato imp : listaImpiegati) {
			if(imp.getRetribuzione() > media) {
				h[posImpiegato] = imp.getCognome();
				posImpiegato++;
			}
		}
		return h;
	}
	
}
