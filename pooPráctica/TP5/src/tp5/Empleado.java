package tp5;

/*public interface Empleado 
// abstract class Empleado	
{	
	public void averiguarSueldo(); //public abstract void averiguarSueldo();
}*/

public class Empleado{
	String nombre;
	double sueldo;
	int anio;
	int mes;
	int dia;
	
	public Empleado(String nom, double sueldo, int anio, int mes, int dia) {
		this.nombre= nom;
		this.sueldo= sueldo;
		this.anio= anio;
		this.mes= mes;
		this.dia= dia;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nom) {
		this.nombre = nom;
	}
	
	public double getSalario() {
		return this.sueldo;
	}
	
	public void setSalario(double s) {
		this.sueldo = s;
	}
	
	public String getFecha_alta() {
		return this.anio + "/" + this.mes + "/" + this.dia;
	}
	
	public void raiseSalario(int porcentaje) {
		this.setSalario(((this.getSalario() * porcentaje)/100) + this.getSalario()); 
	}

	public void averiguarSueldo() {}
	
}
