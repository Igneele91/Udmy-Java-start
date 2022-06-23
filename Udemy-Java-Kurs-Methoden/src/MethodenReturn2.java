
public class MethodenReturn2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// <Modifikator Rückgabetyp Methodenname ( Datentyp Parameter1,
		// DatentypParameter2 )>
		// Ein Modifikator gibt den Sichtbereich der Methoden an, es gibt public, privat
		// und protected

		// Merke: Eine Methode erledigt eine bestimmte Aufgabe

		int a = summe();
		System.out.println(" Der Wert aus der Methode summ() ist : " + a);

		int summe = a - 5;
		System.out.println(" Der Wert in summe ist: " + summe);
	}

	public static int summe() {
		int a, b, summe;
		a = 5;
		b = 5;

		summe = a + b;

		return summe;

	}

}
