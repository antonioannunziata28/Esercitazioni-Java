package incapsulamento.teoria;

public class Persona {

	// Il principio dell'incapsulamento ci consiglia di nascondere all'esterno della classe tutte 
	//le informazioni non necessarie
	
	//In questo modo i due attributi sono nascosti, cioè non visibili all'esterno della classe
	private String nome;
	private String cognome;
	
	
	//Se abbiamo la necessita di visualizzarli o settarli all'esterno della classe, possiamo creare
	//dei metodi publici che lo facciano per noi e richiamare i metodi laddove ci occorrono
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
	
	
	
	
}
