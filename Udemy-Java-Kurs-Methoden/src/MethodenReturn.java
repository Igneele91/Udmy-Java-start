
public class MethodenReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// <Modifikator Rückgabetyp Methodenname ( Datentyp Parameter1, Datentyp
		// Parameter2 )>
		// Ein Modifikator gibt den Sichtbereich der Methoden an, es gibt public, privat
		// und protected

		// Merke: Eine Methode erledigt eine bestimmte Aufgabe

		
		
		int summe = taschenrechner(5, 5, '+');
		System.out.println(summe);
		
	}

	public static int taschenrechner(int zahl1, int zahl2, char operator) {
		int summe;

		if (operator == '+') {
			 summe = zahl1 + zahl2;
		} else {
			 summe = zahl1 - zahl2;
		}

		return summe;
	}

	// Achtung ist anweisung nur in { } ist nur lokal und kann nicht zugreifen!
	// Achtung bei '+' = 1 zeichen wichtig.

}
