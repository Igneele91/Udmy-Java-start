
public class WasisteinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Variable Dekleration
		// Datentyp Name = Wert;
		
		
		int zahl = 50;
		double zahl1 = 34.34;
		
		
		// Array Deklaration    im array wir immer mit 0 angefangen
		// Datentyp [] Name = new Datentyp[Anzahl];
		
		
		
		// Weg 1 ein Array zu erstellen
		int [] zahlenArray = new int[7]; // ich kann 7 elemente im array speichern vom typ int 
		zahlenArray[3] = 50;    // im Bild bei der 3 ist die 50 gespeichert.
		zahlenArray[5] = 500;
		zahlenArray[0] = 40;
		// nur oben int array
		
		
		double[] zahlenArray1 = new double [7];  // erstell nur das array mit 7 felder
		zahlenArray1[1] = 34.23;
		zahlenArray1[4] = 50.45;	
		// nur double im array
		
		
		
		// Weg 2 ein array zu erstellen
		
		String [] personA = { " Peter ", " Müller ", " 35 "	};
		System.out.println(" Name: " + personA[0]);
		// direkt platz zuweisung mit dem string array 
		
		
		// beim array [index platz ] = und das ist der wert wie im Bild, java video nr 59 gezeigt.
		// immer von index 0 begonnen klare übersicht
		// Array = Datenstruktur übersichtlich 
		
		// Array kann nur 1 Datentyp erstellen = nur Int    -    Array 1x 
		// Array kann nur 1 Datentyp erstellen = nur Double -    Array 1x 
		// Array ist ein reserviertes Feld im Arbeitsspeicher!
	}

}
