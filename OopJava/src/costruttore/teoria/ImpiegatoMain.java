package costruttore.teoria;

public class ImpiegatoMain {

	public static void main(String[] args) {
		
		//Adesso creiamo il nostro oggetto a partire dal costruttore da noi definito nella classe di appartenenza
		//In questo modo abbiamo settato già i parametri con i valori che ci occorrevano
		ImpiegatoCostruttore impiegato = new ImpiegatoCostruttore("Antonio", "Annunziata");
		ImpiegatoCostruttore impiegato1 = new ImpiegatoCostruttore("Giuseppe", "Papa");
		
		//Stampiamo i parametri dei nostri oggetti
		System.out.println(impiegato.name + " " + impiegato.surname);
		System.out.println(impiegato1.name + " " + impiegato1.surname);
	}

}
