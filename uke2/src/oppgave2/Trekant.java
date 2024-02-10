package oppgave2;

public class Trekant implements Figur {
	private double sideLengde;
	
	public Trekant(double sideLengde) {
		this.sideLengde = sideLengde;
	}
	
 	@Override
	public double areal() {
		return (sideLengde * sideLengde)/ 2;
	}
	
	@Override
	public void tegn() {
		int start = 1;
		
		for (int x = 0; x < sideLengde; x++) {
			System.out.print("*".repeat(start));
			start++;
			System.out.println();
		}
	}
}
