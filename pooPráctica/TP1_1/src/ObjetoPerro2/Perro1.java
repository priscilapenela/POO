package ObjetoPerro2;

import java.util.Scanner;

import ObjetoPerro2.Perro1;

/*Aquí tenemos:
un objeto el perro
una característica del objeto el nombre, cuyo valor es "Spike"
un mensaje ladrar
un método decir ¡Guau!

 * Dado el texto e imagen que observamos, hacer lo siguiente.
1) Hacer un Diagrama de Clase(Plano de Software) para este caso usando StarUML.
Si declara atributos, programe métodos setters y getters.(En este caso no los
usaremos).
Declare el método Constructor por defecto.
2) Escribir el programa correspondiente en Java usando Eclipse.
 */

public class Perro1{
	
	private String Nombre;
	private Integer Edad;
	
	/*public Perro1(){ //Constructor por Default
		//this.Nombre="Spike";
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese nombre del perro: ");
		this.Nombre=teclado.next();
		System.out.println("Ingrese edad del perro: ");
		this.Edad=teclado.nextInt();
	}*/
	
	public Perro1(String Nombre, Integer Edad){ //Constructor sobrecargado
		this.Nombre=Nombre;
		this.Edad=Edad;
	}
	
	public String getNombre(){
		return this.Nombre;
	}
	
	public Integer getEdad() {
		return this.Edad;
	}
	
	public void Ladrido(){
		System.out.print(this.Nombre);		
		System.out.println(" ladra");		
		System.out.println("Guau Guau Guau");
	}
	
	public void setNombre(String Nombre2){
		this.Nombre = Nombre2;
	}
	
	public void setEdad(Integer Edad2) {
		this.Edad = Edad2;
	}

	public static void main(String[] args) {
		//Perro1 p1 = new Perro1();
		Perro1 p1 = new Perro1("Spike",5);
		
		System.out.println("El nombre del perro es: " + p1.getNombre());
		System.out.println("La edad del perro es: " + p1.getEdad());
		
		p1.Ladrido();
}
}
/*
 * Alumno: Priscila Penela
 * Comision: TT
 * Fecha: 20/3/2023
 */

