package oblig2.oppgave1;

public class ParentesSjekker {
    public boolean sjekkParenteser(String s) {
        LenketStabel stack = new LenketStabel();

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            if (erStartParentes(currentChar)) {
                stack.push(currentChar);
            } else if (erSluttParentes(currentChar)) {
                if (stack.isEmpty()) {
                    return false; // Mismatched closing parenthesis
                }
                char poppedChar = stack.pop();
                if (!erParentesPar(poppedChar, currentChar)) {
                    return false; // Mismatched parentheses
                }
            }
        }

        return stack.isEmpty(); // Check if any unclosed opening parentheses left
    }

    public boolean erStartParentes(char s) {
        String startParenteser = "{[(";
        return startParenteser.indexOf(s) != -1;
    }

    public boolean erSluttParentes(char s) {
        String sluttParenteser = "}])";
        return sluttParenteser.indexOf(s) != -1;
    }

    public boolean erParentesPar(char start, char slutt) {
        return (start == '{' && slutt == '}') ||
               (start == '[' && slutt == ']') ||
               (start == '(' && slutt == ')');
    }
}
