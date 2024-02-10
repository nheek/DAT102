package oppgave2;

public class Main {

	public static void main(String[] args) {
		// d
		Figur[] shapes = new Figur[3];
		
		shapes[0] = new Rektangel(3, 4);
		shapes[1] = new Trekant(5);
		shapes[2] = new Rektangel(6, 2);
		
		// e
		double totalAreal = 0;
		for (Figur shape : shapes) {
			totalAreal += shape.areal();
		}
		System.out.println(totalAreal);
		
		// f
		for (Figur shape : shapes) {
			shape.tegn();
			System.out.println();
		}
	}

}
