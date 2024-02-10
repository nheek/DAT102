package oppgave4;

import java.util.HashSet;

public class Main {
	public static void main (String[] args) {
		// a
		HashSet<String> mengde1 = new HashSet<>();
		HashSet<String> mengde2 = new HashSet<>();
		
		mengde1.add("String1");
		mengde1.add("String2");
		mengde1.add("String2");
		mengde1.add("String0");
		
		mengde2.add("String4");
		mengde2.add("String5");
		mengde2.add("String5");
		mengde2.add("String0");
		
		for (String m : mengde1) {
			System.out.println(m);
		}
		
		for (String m : mengde2) {
			System.out.println(m);
		}
		
		// b
		HashSet<String> mengde3 = new HashSet<>();
		mengde3.addAll(mengde1);
		mengde3.retainAll(mengde2);
		
		System.out.println(mengde1); // sjekker om mengde1 ble redigert
		System.out.println(mengde3);
		
		// c
		System.out.println("c");
		HashSet<String> mengde4 = new HashSet<>();
		mengde4.addAll(mengde1);
		mengde4.addAll(mengde2);
		
		System.out.println(mengde1); // sjekker om mengde1 ble redigert
		System.out.println(mengde4);
	}
}
