package tp4;
import java.util.ArrayList;

import java.util.Scanner;
import java.io.IOException; 
public class Menu {

	int operacion;
	
	Menu(){
		
		Scanner teclado = new Scanner(System.in);
		
	do {	
		
		System.out.println("MENU DE OPERACIONES\n");
        System.out.println("1- Sumar\n");
        System.out.println("2- Restar\n");
        System.out.println("3- Multiplicacion\n");
        System.out.println("4- Dividir\n");
        System.out.println("5- Salir\n");
        System.out.println("Ingrese una opcion: ");
		this.operacion = teclado.nextInt();
		
		switch (operacion){
		case 1: 
			suma();
			System.out.println("Presione Enter para continuar...");
			new java.util.Scanner(System.in).nextLine();
			
		break;
		case 2:
			resta();
			System.out.println("Presione Enter para continuar...");
			new java.util.Scanner(System.in).nextLine();
			
		break;
		case 3: 
			multiplicacion();
			System.out.println("Presione Enter para continuar...");
			new java.util.Scanner(System.in).nextLine();
			
		break;
		case 4: 
			division();
			System.out.println("Presione Enter para continuar...");
			new java.util.Scanner(System.in).nextLine();
			
		break;
		case 5: 
			salir();
			System.out.println("Presione Enter para continuar...");
			new java.util.Scanner(System.in).nextLine();
			
		break;
		}
		
	
	} while(operacion != 5);
	
	 System.out.println("Fin del Programa");
	 teclado.close();
	 
	
	}	
	
	public void suma() {
		Scanner suma = new Scanner(System.in);
		
		System.out.println("Ingrese un numero entero: ");
		int n1 = suma.nextInt();
		System.out.println("Ingrese un segundo numero entero: ");
		int n2 = suma.nextInt();
		int respuesta = n1 + n2;
		System.out.println("La suma de "+n1+" y "+n2+" es: "+respuesta);
	}
	
	public void resta() {
        Scanner resta = new Scanner(System.in);
		
		System.out.println("Ingrese un numero entero: ");
		int n1 = resta.nextInt();
		System.out.println("Ingrese un segundo numero entero: ");
		int n2 = resta.nextInt();
		int respuesta = n1 - n2;
		System.out.println("La resta de "+n1+" y "+n2+" es: "+respuesta);
	}
	
	public void multiplicacion() {
        Scanner multi = new Scanner(System.in);
		
		System.out.println("Ingrese un numero entero: ");
		int n1 = multi.nextInt();
		System.out.println("Ingrese un segundo numero entero: ");
		int n2 = multi.nextInt();
		int respuesta = n1 * n2;
		System.out.println("La multiplicación de "+n1+" y "+n2+" es: "+respuesta);
	}
	
	public void division() {
        Scanner divi = new Scanner(System.in);
		
		System.out.println("Ingrese un numero entero: ");
		int n1 = divi.nextInt();
		System.out.println("Ingrese un segundo numero entero: ");
		int n2 = divi.nextInt();
		int respuesta = n1 / n2;
		System.out.println("La división de "+n1+" y "+n2+" es: "+respuesta);
	}
	
	public void salir() {
		System.out.println("Menu cerrado");
	}

	public static void main(String[] args) {
	        
	           Menu menu = new Menu();
	           
	
}
}
/*
 *Alumno: Penela Priscila
 *Comisión: TT
 *Fecha: 6/5/2023
 *
 */
