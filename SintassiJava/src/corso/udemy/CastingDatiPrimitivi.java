package corso.udemy;

public class CastingDatiPrimitivi {

	public static void main(String[] args) {
		
		// Casting è quando trasformiamo il tipo di una variabile in un altro
		
		short r = 20;
		int e = r;
		//in questo casto short è piu piccolo quindi avverrà un casting implicito
		
		int t = 40;
		short w = (short) t;
		//casting esplicito, l'intero è piu grande del tipo short, ciò può portare a comportamenti anomali
		
		float tmp = 2.3F;
		double y = tmp;
		
		double i = 2.3;
		float q = (float) i;
		
		/*
		 * IL CASTING IMPLICITO E' QUANDO TRASFORMIAMO UN TIPO DI DATO PIU PICCOLO IN UNO PIU GRANDE
		 * IL CASTING ESPLICITO E' QUANDO TRASFORMIAMO UN TIPO DI DATO PIU GRANDE IN UNO PIU PICCOLO, CIO
		 * 	PUO PORTARE A COMPORTAMENTI ANOMALI O PERDITE DI PRECISIONE DEL DATO
		 */
		
	}

}
