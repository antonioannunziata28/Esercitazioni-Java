package array.oggetti.teoria;

public class ArrayDiOggettiMain {

	public static void main(String[] args) {
		
		//Creiamo un array di oggetti
		Studente[] arrayOgg = new Studente[10];
		//A differenza di un array di dati primitivi, fino a quando non inseriamo dei dati all'interno
		//del nostro array di oggetti sarà formato da valori null, mentre un array di dati primitivi
		//sarà pieno di 0;
		System.out.println(arrayOgg[0]);
		
		Studente studente = new Studente();
		studente.setCognome("Annunziata");
		studente.setNome("Antonio");
		
		//Popoliamo l'array
		arrayOgg[0] = studente;
		//Per stampare un valore in una locazione dell'array
		System.out.println(arrayOgg[0].getCognome());
		
		//Per assegnare un nuovo valore ad un attributo dell'oggetto nell'array
		arrayOgg[0].setCognome("Rossi");
		arrayOgg[0].setNome("Paolo");
		//Ristampiamo i valori
		System.out.println(arrayOgg[0].getCognome() + " " + arrayOgg[0].getNome());
		
		//se provassimo ora a stampare dei valori in una cella dell'array che non è stata popolata 
		//avremo un eccezione, perchè il valore di tale cella sarà null
		//System.out.println(arrayOgg[1].getCognome());
		
		//Allora valoriziamo anche la posizione 1 del nostro array di oggetti
		arrayOgg[1] = new Studente();
		
		//Ora la posizone 1 non sarà null ma conterrà un riferimento al nostro oggetto
		
		//Valoriziamo gli attributi del nostro oggetto
		arrayOgg[1].setCognome("Newman");
		arrayOgg[1].setNome("Paul");
		
		//Stampiamo i valori contenuti nella posizione 1 dell'array
		System.out.println(arrayOgg[1].getCognome() + " " + arrayOgg[1].getNome());
		
		//Oppure possiamo popolare il nostro array con un ciclo for
		for (int i = 0; i < arrayOgg.length; i++) {
			arrayOgg[i] = new Studente();
		}

	}

}
