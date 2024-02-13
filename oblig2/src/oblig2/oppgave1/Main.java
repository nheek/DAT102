package oblig2.oppgave1;

public class Main {
	public static void main (String[] args) {
		ParentesSjekker PS = new ParentesSjekker();
		String userString = "{ [ (  }";
		String javaProgram = """
				class HelloWorld {
				 public static void main(String[] args) {
				 System.out.println("Hello World!");
				 }
				}
				""";
		
		System.out.println(PS.sjekkParenteser(userString));
		System.out.println(PS.sjekkParenteser(javaProgram));
	}
}
