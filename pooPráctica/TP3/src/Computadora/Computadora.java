package Computadora;

import java.util.Scanner;

public class Computadora {
	private
	UDisco disco = new UDisco();
	Consola consola = new Consola();
	
	public Computadora() {
		System.out.println("Se ha creado la Computadora con éxito");
	}
	
	public static void main(String[] args) {
		
		int primerNum;
		Scanner Leer=new Scanner(System.in);
		System.out.println("Vamos a crear al objeto compu1");
		System.out.print("Apriete cualquier numero para continuar: ") ;
		primerNum=Leer.nextInt();
		
		Computadora compu1 = new Computadora();
	}
	
}
/*
 * Alumno: Priscila Penela
 * Comisión: TT
 * Fecha:23/3/2023
*/