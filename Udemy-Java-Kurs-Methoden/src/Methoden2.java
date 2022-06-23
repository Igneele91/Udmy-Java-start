
public class Methoden2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Modifikator Rückgabetyp Methodenname ( Datentyp Parameter1, Datentyp
		// Parameter2 )>
		// Ein Modifikator gibt den Sichtbereich der Methoden an, es gibt public, privat
		// und protected

		// Merke: Eine Methode erledigt eine bestimmte Aufgabe

		for (int i = 1; i <= 10; i++) {
			erstelleGegner();
			// System.out.println();
		}

		// hmm

	}

	public static void erstelleGegner() {
		String gegnerName = "Olaf";
		int gegnerLeben = 100;
		System.out.println("Gegner wurde erstellt");

	}

}
