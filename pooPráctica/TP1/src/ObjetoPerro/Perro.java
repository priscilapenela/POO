package ObjetoPerro;
import java.util.Scanner;

//TP1 
/*Aquí tenemos:
un objeto el perro
una característica del objeto el nombre, cuyo valor es "Spike"
un mensaje ladrar
un método decir ¡Guau!

 * Dado el texto e imagen que observamos, hacer lo siguiente.
1) Hacer un Diagrama de Clase(Plano de Software) para este caso usando StarUML.
    Si declara atributos,  programe  métodos setters y getters.(Para más adelante)
2) Escribir el programa correspondiente en Java usando Eclipse. 

Nota: En main se debe solicitar el ingreso del nombre del perro usando Objeto
         de la clase Scanner, para leer el nombre desde el teclado.
          Al Objeto perro se le asignará el nombre ingresado y luego se mostrará
          ese nombre en pantalla

 */

public class Perro {
	
	private String Nombre;
	
	public String getNombre(){
		return Nombre;
	}
	
	public void Ladrido(){
		System.out.println("Guau");
	}
	
	public void setNombre(String Nom){
		this.Nombre = Nom;
	}

	public static void main(String[] args) {
		Perro p1 = new Perro();
		Scanner teclado = new Scanner(System.in);
		String ladrar = "LADRAR"; 
		
		System.out.println("Ingrese el nombre de su perro: ");
		String nombre = teclado.next();
		p1.setNombre(nombre);
		
		System.out.println("El nombre es: " + p1.getNombre());
		
		System.out.println("Ingrese LADRAR para interactuar con " + p1.getNombre() + ": ");
		String ladrido = teclado.next();
		
		
		if(ladrido.equals(ladrar)){
			p1.Ladrido();
		}
		else {
			System.out.println("Silencio");
		}
		
	}

}
/*
 *Alumno: Penela Priscila
 *Comisión: TT
 *Fecha: 20/3/2023
 *
 */
