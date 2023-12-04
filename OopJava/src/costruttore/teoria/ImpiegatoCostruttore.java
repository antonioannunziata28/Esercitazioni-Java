package costruttore.teoria;

public class ImpiegatoCostruttore {

	//Attributi
	public String name;
	public String surname;
	
	//Il metodo Costruttore è un metodo che non ritorna nulla, ha lo stesso nome della classe e serve
	//per a definire la struttura dell'oggetto cui andremo a creare. Nel caso precedente non abbiamo creato
	//alcun costruttore per istanziare l'oggetto, questo perchè java c'è ne mette a disposizione gia uno 
	//di default. La creazione di un cotruttore ci darà la possibilità di creare un oggetto seguendo la
	//struttura da noi definita e passando i valori dei paramentri direttamente nel momento in cui 
	//istanzieremo l'oggetto, vedi classe ImpiegatoMain.java
	
	public ImpiegatoCostruttore(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}
}
