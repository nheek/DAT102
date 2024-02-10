package oppgave7;

import java.util.Objects;

public class Student implements Comparable<Student> {
	// a
	private int studentNR;
	private String fornavn;
	private String etternavn;
	private String studiested;
	
	public Student(int studentNR, String fornavn, String etternavn, String studiested) {
		this.studentNR = studentNR;
		this.fornavn = fornavn;
		this.etternavn = etternavn;
		this.studiested = studiested;
	}

	public int hentStudentNR() {
		return studentNR;
	}

	public void settStudentNR(int studentNR) {
		this.studentNR = studentNR;
	}

	public String hentFornavn() {
		return fornavn;
	}

	public void settFornavn(String fornavn) {
		this.fornavn = fornavn;
	}

	public String hentEtternavn() {
		return etternavn;
	}

	public void settEtternavn(String etternavn) {
		this.etternavn = etternavn;
	}

	public String hentStudiested() {
		return studiested;
	}

	public void settStudiested(String studiested) {
		this.studiested = studiested;
	}
	
	// b
	@Override
	public int compareTo(Student annenStudent) {
		int isSameEtternavn = this.etternavn.compareTo(annenStudent.hentEtternavn());
		// return Integer.compare(this.studentNR, annenStudent.hentStudentNR());
		return isSameEtternavn != 0 ? isSameEtternavn : this.fornavn.compareTo(annenStudent.hentFornavn());
	}

	// c
	@Override
	public String toString() {
		return studentNR + " " + fornavn + " " + etternavn + " " + studiested;
	}
	
	// d
	@Override
	public int hashCode() {
		return Objects.hash(studentNR);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return studentNR == other.studentNR;
	}
}
