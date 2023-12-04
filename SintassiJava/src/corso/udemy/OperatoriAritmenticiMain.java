package corso.udemy;

public class OperatoriAritmenticiMain {

	public static void main(String[] args) {

		int a = 10;
		int b = 30;
		
		int c = a + b; //Somma entrambe i valori e li salva nella variabile c
		
		c = a + 40; // in questo modo c vale 40
		
		c+= 40; //prendiamo il valore di c e gli aggiungiamo 40 quindi ora vale 80
		
		b += 50; // qui b vale 80
		
		b += a; //aggiungiamo il valore di a al valore di b quindi ora b vale 90
		
		a = a +1; // aggiungeremo al valore di a 1
		a++; // è l'equivalente di scrivere a = a + 1;
		
		//ciò è valido anche per la sottrazione 
		
		a--; // è l'equivalente di scrivere a = a - 1;
		
		c = a % 2; //l'operatore % ci ritorna il resto della divisione
	}

}
