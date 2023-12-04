package incapsulamento.teoria;

public class PersonaMain {

	public static void main(String[] args) {
		
		Persona persona = new Persona();
		
//		persona.cognome = "Rossi";
//		persona.nome = "Nome";
		
		persona.setCognome("Rossi");
		persona.setNome("Paolo");
		
		System.out.println(persona.getCognome() + " " + persona.getNome());

	}

}
