package Computadora;

import java.util.Scanner;

public class UDisco {
	private 
	int controlador;
	char disco;
	
public UDisco() {
	
	int primerNum;
	Scanner Leer = new Scanner(System.in);
	System.out.println("Vamos a crear LA UNIDAD DE DISCO");
	System.out.print("Apriete cualquier numero para continuar: ") ;
	primerNum=Leer.nextInt();
	
	this.controlador=1;
	this.disco='a';
	
	System.out.println("La unidad de disco se ha creado");
	
	System.out.println("¿Desea ver su contenido?");
	System.out.print("Apriete cualquier numero para ver contenido: ") ;
	boolean pregunta=Leer.hasNextInt();
	
	if(pregunta) {
	System.out.println("Posee "+  this.controlador +" controlador");
	System.out.println("Posee disco llamado: " + this.disco);
	}

}
}
/*
 * Alumno: Priscila Penela
 * Comisión: TT
 * Fecha:23/3/2023
*/