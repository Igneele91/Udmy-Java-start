
public class Casten {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Was ist eine Typumwandlung / Casten?
		 * 
		 * Das ist eine Umwandlung von einem Datentypen in einen anderen Datentypen.
		 * 
		 */
		
		
		int userAlter = (int) 18.5;    // (int) = das ist ein Cast-Operator   immer in den ( )  Klammer 
		System.out.println(userAlter);      // weil (int) ist nur ganze Zahlen erlaubt so wird die 18.5 nicht erlaubt.
		
		
		
		// Implizites Casten (von klein nach gross) Kleine Datenverluste
		// Umwandlung findet bei Zuweisung statt.
		int zahl1 = 30;
		double zahl2 = zahl1;
		System.out.println(zahl2);
		
		
		
		// Explizites Casten (von gross nach klein) Datenverluste
		// Umwandlung findet mit Hilfe des cast (Datentyp)-Operators statt.
		
		
		// 1 Auto = 3450,45$    2. Auto = 2690.94$ sind double werte 
		double autoPreis1 = (double) 3450.45; // kanst es auch mal mit double probieren
		double autoPreis2 = (double) 2690.45;
		double gesamtPreis = autoPreis1 + autoPreis2;
		System.out.println(" der gesamt Preis von Auto 1 und 2 ist =  " + gesamtPreis + " Dollar");
		
		
		int autoPreis76 = (int) 3450.45; // habs mit int hier gemacht.
		int autoPreis77 = (int) 2690.45;
		int gesamtPreisV = autoPreis76 + autoPreis77;
		System.out.println(" der gesamt Preis von Auto 76 und 77 ist =  " + gesamtPreisV + " Dollar ");
		
		
		/*
		 * 
		 * Reihenfolge richtig vom Bild =
		 * 
		 * byte   =    1 byte
		 * short  =    2 byte 
		 * int    =    4 byte
		 * long   =    8 byte
		 * float  =    4 byte
		 * long   =    8 byte
		 * 
		 * boolean =  kann nicht umgewandelt werden !!!      Wichtig !!
		 * 
		 */
		
		
		
		
	}

}
