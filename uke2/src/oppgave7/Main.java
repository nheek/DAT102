package oppgave7;

import java.util.LinkedList;

public class Main {
	public static void main (String[] args) {
		// e
		LinkedList<Student> studentListe = new LinkedList<>();
		
		studentListe.add(new Student(3, "Nick", "Hipol", "Bergen"));
		studentListe.add(new Student(5, "Not Nick", "Not Hipol", "Not Bergen"));
		studentListe.add(new Student(1, "In Nick", "In Hipol", "In Bergen"));
		studentListe.add(new Student(4, "Out Nick", "Out Hipol", "Out Bergen"));
		studentListe.add(new Student(2, "Same Nick", "Same Hipol", "Same Bergen"));
		
		// f
		studentListe.sort(null);
		System.out.println(studentListe);
		
		// g
	}
}
