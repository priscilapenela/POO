package palindromo;

import java.util.Stack;

public class Palabra {
	private String palabrita;
	private Stack<Character> stack1;
	private Stack<Character> stack2;

	public Palabra(String p) {
		this.palabrita = p;
		stack1 = new Stack<>();
		stack2 = new Stack<>();
	}

	public String getPalabra() {
		return this.palabrita;
	}

	public void setPalabra(String p2) {
		this.palabrita = p2;
	}

	public Stack<Character> obtenerCaracteres() {
		for (int i = 0; i < this.palabrita.length(); i++) {
			stack1.push(this.palabrita.charAt(i));

		}
		return stack1;
	}

	public void isPalindromo() {
		for (int i = (this.palabrita.length() - 1); i >= 0; i--) {
			stack2.push(this.palabrita.charAt(i));
		}
		System.out.print("La palabra " + this.palabrita + " es Palindromo? ");
		System.out.print(obtenerCaracteres().equals(stack2) + "\n");

	}
}
