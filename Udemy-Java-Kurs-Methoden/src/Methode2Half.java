
public class Methode2Half {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// <Modifikator R?ckgabetyp Methodenname ( Datentyp Parameter1, Datentyp
		// Parameter2 )>
		// Ein Modifikator gibt den Sichtbereich der Methoden an, es gibt public, privat
		// und protected

		// Merke: Eine Methode erledigt eine bestimmte Aufgabe

//		for(Anfangswerte; Abbruchbedingungen; Z?hler)
//		for (int i = 1; i<=10; i++) {
//			erstelleGegner();
//			// System.out.println();
//		}

		erstelleGegner(" Peter hat:  ", 100 );
		erstelleGegner(" Olaf  hat:  ",  200);
		
	}

//		public static void erstelleGegner() {
//			String gegnerName = "Olaf";
//			int gegnerLeben = 100;
//			System.out.println("Gegner wurde erstellt");
//						

	public static void erstelleGegner(String name, int lebenspunkte) {
		String gegnerName = name;
		int gegnerLeben = lebenspunkte;
		System.out.println(" Gegner wurde erstellt !  " + gegnerName + " LP: " + gegnerLeben);

	}

}
