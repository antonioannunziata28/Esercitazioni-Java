package classi.oggetti.metodi.teoria;

public class Main {

	public static void main(String[] args) {
		// Una classe è un entità logica dove vengono raggruppate tutte 
		// informazioni legate fra loro, un esempio potrebbe essere creare una classe impiegato
		// e al suo interno potremmo trovare tutti gli attributi ad essa legati, ad esempio
		// il nome e il cognome dell'impiegato, l'età ecc.. oltre ai relativi metodi che rappresentano
		// le operazioni di quella determinata classe, come ad esempio timbrare il cartellino, 
		// svolgere un compito ecc..
		
		//CREATA LA CLASSE IMPIEGATO
		
		//In questo modo avremo instanziato l'oggetto impiegato
		Impiegato impiegato = new Impiegato(); //impiegato è un istanza della classe Impiegato
		
		//A questo punto possiamo accedere a tutte le info public del nostro oggetto in questo modo
		impiegato.name = "Antonio"; //Da notare che entrambe gli attributi sono stati soltanto
		impiegato.surname = "Annunziata"; //dichiarati nella classe Impiegato e ora ne settiamo il valore
		
		//Possiamo creare piu' oggetti appartenenti alla stessa classe ad esempio:
		Impiegato impiegato1 = new Impiegato();
		
		//e assegnargni valori differenti
		impiegato1.name = "Giuseppe";
		impiegato1.surname ="Mastone";
		
		//effettuiamo una chiamata al metodo della classe Impiegato sull'oggetto in questo caso impiegato
		impiegato.calcolaCodiceFiscale();
		//allo stesso modo possiamo effettuare una chiamata al metodo per tutti gli oggetti istanziati
		//della classe Impiegato
		impiegato1.calcolaCodiceFiscale();
		
		//chiamiamo un metodo della classe Impiegato che accetti dei parametri di ingresso
		impiegato.verificaSeMaggiorenne(28);
		impiegato1.verificaSeMaggiorenne(17);
		
		//chiamiamo un metodo che prende dei paramentri in ingresso ma ci ritorna un booleano e lo stampiamo
		//oppure possiamo salvare il valore che ci ritorna in una variabile
		
		//primo caso:
		System.out.println(impiegato.verificaMaggiorenneBooleana(28));
		System.out.println(impiegato1.verificaMaggiorenneBooleana(17));
		//secondo caso:
		boolean eMaggiorenne = impiegato.verificaMaggiorenneBooleana(28);
		System.out.println("è maggiorenne? " + eMaggiorenne); //stampiamo il valore della variabile
		boolean eMaggiorenne1 = impiegato.verificaMaggiorenneBooleana(17);
		System.out.println("è maggiorenne? " + eMaggiorenne1); 
		
		
	}

}
