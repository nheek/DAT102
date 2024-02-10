package oppgave3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    	// a
    	ArrayList<Integer> liste = new ArrayList<>();
    	
    	liste.add(10);
    	liste.add(20);
    	liste.add(10);
    	liste.add(32);
    	liste.add(55);
    	
    	// liste.add("Stringgg");
    	// får feil fordi liste må ha type Integer
    	
    	System.out.println(liste.get(3));
    	System.out.println(liste.get(4));
    	
    	// b
    	int antallEl = liste.size();
    	System.out.println(antallEl);
    	
    	liste.add(1, 68);
    	System.out.println(liste);
    	
    	// c
    	System.out.println(liste.contains(20));
    	System.out.println(liste.contains(100));
    	
    	// d
    	System.out.println(liste.indexOf(10));
    	
    	// husk at vi satte inn 68 i index 1
    	System.out.println(liste.lastIndexOf(10));
    	
    	// e
    	liste.removeAll(liste);
    	System.out.println(liste.isEmpty());
    }
	
}
