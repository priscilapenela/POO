package Computadora;

import java.util.Scanner;

public class Consola {
	private
	String pantalla;
	String teclado;

	public Consola() {
		
		int primerNum;
		Scanner Leer = new Scanner(System.in);
		System.out.println("Vamos a crear la CONSOLA");
		System.out.print("Apriete cualquier numero para continuar: ") ;
		primerNum=Leer.nextInt();
		
		this.pantalla="Pantalla";
		this.teclado="Teclado";
		
		System.out.println("La consola se ha creado");
		
		System.out.println("¿Desea ver su contenido?");
		System.out.print("Apriete cualquier numero para ver contenido: ") ;
		boolean pregunta=Leer.hasNextInt();
		
		if(pregunta) {
		 System.out.println("Se agrega el componente: " + this.pantalla);
		 System.out.println("Se agrega el componente: " + this.teclado);
		}
	}
		
}

/*
 * Alumno: Priscila Penela
 * Comisión: TT
 * Fecha:23/3/2023
*/