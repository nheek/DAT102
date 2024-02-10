package oppgave2;

public class Rektangel implements Figur {
	private double hoyde;
	private double bredde;
	
	public Rektangel(double hoyde, double bredde) {
		this.hoyde = hoyde;
		this.bredde = bredde;
	}
	
	@Override
	public double areal() {
		return hoyde * bredde; 
	}
	
	@Override
	public void tegn() {
		for (int x = 0; x < hoyde; x++) {
			for (int y = 0; y < bredde; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
