package it.udemy.main;

import it.udemy.model.Div;
import it.udemy.model.Mul;
import it.udemy.model.Operazione;
import it.udemy.model.Sub;

public class Main {

	public static void main(String[] args) {
//		Definisci un interfaccia 'operazione' e le sue classi derivate(sub.div.mul) in modo che da ciascuna sia
//		possibile eseguire la corrispondente operazione aritmentica(addizione, divisione, moltiplicazione) 
//		istanziando un oggetto classe 'operazione' e due operandi 
		

		//Prima soluzione
//		System.out.println(Operazione.sub(4, 3));
//		System.out.println(Operazione.mul(4, 3));
//		System.out.println(Operazione.div(15, 3));
		
		//Seconda soluzione
//		Operazione op = new Sub();
//		System.out.println(op.operazione(3, 3));
//		
//		Operazione op1 = new Div();
//		System.out.println(op1.operazione(10, 5));
//		
//		Operazione op2 = new Mul();
//		System.out.println(op2.operazione(3, 3));
		
		//Terza soluzione
		Sub addizione = new Sub();
		System.out.println(addizione.operazione(3, 3));
		
		Div divisione = new Div();
		System.out.println(divisione.operazione(15, 3));
		
		Mul moltiplicazione = new Mul();
		System.out.println(moltiplicazione.operazione(3, 5));
	}

}
