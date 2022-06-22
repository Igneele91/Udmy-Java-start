
public class SchleifeWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Kontrollstrukturen steuern den Programmablaufplan
		
				// while = solange...
				
				/*
				 * Allgemeiner Aufbau einer while-Schleife
				 * 
				 * while(Bedinungen){ 
				 * 
				 * 	Anweisungsblock
				 * 	}
				 * 
				 * Merke: Bedinung kann entweder true = wahr oder false = nicht wahr sein
				 *
				 */
		int count = 1;                            // Achtung aufbau anderst als bei for schleife wiel weil es ist ja while
//		while(count != 6) {
//			System.out.println(" Ich bin: " + count);    
//			count ++;
//		}
		
		// endloss schleife da kein zähler vorhanden ist while die bedinung ist immer true
		while (true){
			System.out.println(" Hi ");
			if (count == 3) {
				break;
			}
			count ++; // Zähler ohne den würde endlos laufen.
		}
		// den count ++ immer bei while dabei
		
	}

}
