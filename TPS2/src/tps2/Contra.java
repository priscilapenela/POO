package tps2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Contra {
	private String contra;
	private Stack<Character> s1;
	private Stack<Character> s2;
	private Queue<Character> c1;

	public Contra(String cont) throws Exception {
		setContra(cont); //se referencia al método set ya que hay que realizar validaciones
		s1 = new Stack<>();
		s2 = new Stack<>();
		c1 = new LinkedList<>();
	}

	public String getContra() {
		return contra;
	}

	public void setContra(String contrasenia) throws Exception {
		System.out.println();
		if (contrasenia.length() < 200) { //por consigna se explica que la cadena no puede superar los 200 caracteres
			if (contrasenia.length() % 6 == 0) { //cada contraseña debe poseer obligatoriamente 6 caracteres
				this.contra = contrasenia;
			} else {
				throw new Exception("La cantidad de caracteres de la cadena ingresada no cumple con los parámetros. Por favor, verifique he intente nuevamente.");
			}
		} else {
			throw new Exception("La cadena ingresada se encuentra excedida de tamaño. Esta debe ser menor de 200 caracteres.");
		}

	}

	@Override
	public String toString() {
		return "Contra [contrasenia=" + getContra() + "]";
	}

	public ArrayList<String> obtenerContra() throws Exception {

		for (int i = 0; i < this.contra.length(); i++) { // Se inserta cada caracter del String en una posicion de p1
			if (this.contra.matches("([0-9]|[a-z]|[A-Z])+")) { /* Creacion de una expresion regular para verificar que la cadena
			                                                    * ingresada solo contenga letras (mayusculas y minusculas) y números
												                */
				s1.push(this.contra.charAt(i));
			} else {
				throw new Exception("La cadena ingresada contiene espacios en blanco o posee caracteres especiales." + "\n" + "Solo se admiten numeros del 0-9 y letras de la a-z (mayusculas o minusculas)");
			}
		}

		int mitad = ((this.contra.length()) / 2) + 1; // Calcular la mitad + 1 para almacenar en p2
		for (int i = this.contra.length(); i >= mitad; i--) { // Se recorre hasta la mitad de p1, se remueven los
																// caracteres y se guardar en p2
			s2.push(s1.pop());
		}

		int a = 0; // Variable bandera para alternar entre las pilas
		int cantContras = (this.contra.length()) / 6; // Calculo de la cantidad de contraseñas contenidas en el
														// String
		for (int i = 0; i < cantContras; i++) { // Recorre según la cantidad de contras
			for (int j = 0; j < 6; j++) { // Recorre de a 6 caracteres
				if (c1.isEmpty()) {// Verifica que la cola esté vacia
					c1.offer(s1.pop()); // Guarda el caracter del centro de todo el String (según nuentro ejemplo
										// sería
										// R)
				} else {
					if (a == 0) { // Según el valor de a, va a remover y guardar caracteres altenando las pilas
						c1.offer(s2.pop());
						a = 1;
					} else {
						c1.offer(s1.pop());
						a = 0;
					}
				}
			}
		}
		ArrayList<String> contras = new ArrayList<String>();
		int tamanio = c1.size(); // Se calcula el tamaño de la cola ya que este irá variando en cada iteracion
									// del for
		for (int i = 0; i < tamanio; i += 6) { // Itera mientras que i sea menor que el tamaño de la cola e i crece de a
												// 6

			StringBuilder sd = new StringBuilder(); /*
													 * Se crea un objeto de la clase StringBuilder que proporciona
													 * métodos para agregar, eliminar o modificar caracteres. A
													 * diferencia de la clase String que es inmutable, StringBuilder
													 * construye cadenas dinámicas
													 */
			for (int j = 0; j < 6; j++) { // Concatena cada 6 caracteres de c1
				sd.append(c1.poll());
			}
			contras.add(sd.toString()); // Se convierte a String y se guarda en una posicion del ArrayList
		}
		return contras;
	}

}
