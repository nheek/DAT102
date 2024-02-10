package oppgave5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// a
		ArrayList<String> ordListe = new ArrayList<>();
		Map<String, Integer> ordFrekvens = new HashMap<>();
		
		ordListe.add("er");
		ordListe.add("det");
		ordListe.add("alle");
		ordListe.add("er");
		ordListe.add("det");
		ordListe.add("det");
		
		for (String ord : ordListe) {
			if (!ordFrekvens.containsKey(ord)) {
				ordFrekvens.put(ord, 1);
			} else {
				Integer thisKeyFrekvens = ordFrekvens.get(ord);
				thisKeyFrekvens++;
				ordFrekvens.put(ord, thisKeyFrekvens);
			}
		}
		
		System.out.println(ordFrekvens); // check if it works
		
		// b
		Scanner input = new Scanner(System.in);
		System.out.print("Skriv ord: ");
		String userKey = input.nextLine();
		
		Integer userKeyFrekvens = ordFrekvens.get(userKey) != null ? ordFrekvens.get(userKey) : 0;
		System.out.println("Ord: " + userKey + ", Frekvens: " + userKeyFrekvens);
		
		
	}

}
