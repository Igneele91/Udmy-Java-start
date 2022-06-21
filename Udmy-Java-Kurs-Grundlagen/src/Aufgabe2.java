
public class Aufgabe2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * Aufgabe: 
		 *
		 * 1. Auto kostet: 3500
		 * 2. Auto kostet: 2340,48
		 * 
		 * 
		 * 
		 * 1. Daten in Variablen abspeichern
		 * 2. Kommazahl umwandle zu einer Ganzzahl
		 * 3. Beide Ganzzahlen zu einem Gesamtbeitrag verrechnen.
		 * 4. Gesamtbetrag ausgeben mit Hilfe von System.out.println(""); 
		 */
		
		int autoKosten1 =  3500 ;
		double autoKosten2 = 2340.48;
		
		int autoKosten2GanzZahl = (int)autoKosten2;        // weil wegen der bezeichnung nicht wie voreher am anfagn schon geht aber auch. 
		
		int gesamtAutokosten = autoKosten1 + autoKosten2GanzZahl ;
		
		System.out.println(" Gesamtkosten des Autos sind: " + gesamtAutokosten );
		
		
		
	}

}
