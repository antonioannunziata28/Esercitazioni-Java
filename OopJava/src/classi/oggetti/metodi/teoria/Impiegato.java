package classi.oggetti.metodi.teoria;

public class Impiegato {

	//Questi due campi rappresentano gli attributi della classe Impiegato
	String name;
	String surname;
	
	//Creiamo un metodo della classe Impiegato
	public void calcolaCodiceFiscale() {
		//tutto il codice presente qui dentro, rappresenta la logica di questo metodo, cioè il codice
		// eseguito ad ogni chiamata al metodo
		System.out.println("Codice Fiscale: " +  name + " " + surname);
	}
	
	//Una classe può avere uno o piu' metodi
	public void calcolaCodiceFiscaleInglese() {
		System.out.println("Codice Fiscale Inglese: " + surname + " " + name);
	}
	
	//I metodi possono prendere in input dei dati, cioè possiamo passargli in ingresso dei dati
	//quei dati vengono chiamati parametri e vanno tra le due parentesi ()
	//in ingresso è possibile passare uno o piu' parametri è sufficiente separare i dati con la ,
	public void verificaSeMaggiorenne(int age) {
		if(age > 18) {
			System.out.println("L'impiegato è maggiorenne");
		} else {
			System.out.println("Ci dispiace non sei maggiorenne");
		}
	}
	
	//Un metodo può avere anche un ritorno, cioè restituirci un valore 
	public boolean verificaMaggiorenneBooleana(int eta) {
		boolean maggiorenne = false;
		if(eta > 18) {
			maggiorenne = true;
		}else {
			maggiorenne = false;
		}
		
		return maggiorenne;
	}
}
