package oppgave8;

import oppgave7.Student;

public class NettStudent extends Student {
	// a
	private String hjemsted;
	
	public NettStudent(int studentNR, String fornavn, String etternavn, String studiested) {
		super(studentNR, fornavn, etternavn, studiested);
	}
	
	// b
	public String hentHjemsted() {
		return hjemsted;
	}

	public void settHjemsted(String hjemsted) {
		this.hjemsted = hjemsted;
	}
	
	// c
	@Override
	public String toString() {
		return super.toString() + " " + hjemsted;
	}
}
