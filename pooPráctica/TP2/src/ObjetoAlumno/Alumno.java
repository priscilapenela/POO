package ObjetoAlumno;

import java.util.Scanner;

public class Alumno {
	private
	String nombre;
	int edad;
	double promedio;
	
	public
	Alumno() {
		this.nombre="Juan";
		this.edad=23;
		this.promedio=8.25;
	}
	
	Alumno(String nom, int e, double prom){
		this.nombre= nom;
		this.edad=e;
		this.promedio=prom;
	}
	
	
	public String getNombre() {
		return this.nombre;
	}
	
	public int getEdad() {
		return this.edad;
	}
	
	public double getPromedio() {
		return this.promedio;
	}
	
	public void setNombre(String nom1)
	{
		this.nombre=nom1;
	}
	
	public void setEdad(int edad1)
	{
		this.edad=edad1;
	}
	
	public void setPromedio(double prom1)
	{
		this.promedio=prom1;
	}

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Se creará el Objeto alu1, ¿desea continuar? Ingrese 1(SI) o 2(NO) ");
		int r = teclado.nextInt();
		
		if(r == 1) {
			Alumno alu1 = new Alumno();
			System.out.println("El nombre del alumno es: " + alu1.getNombre());
			System.out.println("La edad del alumno es: " + alu1.getEdad());
			System.out.println("El promedio del alumno es: " + alu1.getPromedio());
			
			System.out.println("Se modificará la edad y el promedio, ¿desea continuar? Ingrese 1(SI) o 2(NO)");
			r = teclado.nextInt();
			
			if(r == 1) {
				alu1.setEdad(26);
				alu1.setPromedio(9.50);
				
				System.out.println("Nueva edad del alumno: " + alu1.getEdad());
				System.out.println("Promedio ha cambiado a: " + alu1.getPromedio());
			}
			else {
				System.out.println("No han habido cambios");
			}
			
		}
		else{
			System.out.println("No se ha creado alu1");
		}
		
		System.out.println("Se creará el Objeto alu2, ¿desea continuar? Ingrese 1(SI) o 2(NO)");
		r = teclado.nextInt();
		
		if(r==1) {
		Alumno alu2 = new Alumno("Ana",22,9.25);
		System.out.println("El nombre del alumno es: " + alu2.getNombre());
		System.out.println("La edad del alumno es: " + alu2.getEdad());
		System.out.println("El promedio del alumno es: " + alu2.getPromedio());
		}
		else {
			System.out.println("No se ha creado alu2");
		}
		
	}

}
/*
 * Alumno: Priscila Penela
 * Comisión: TT
 * Fecha:23/3/2023
*/