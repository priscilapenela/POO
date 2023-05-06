package tp5;

//public class Cajero implements Empleado 
public class Cajero extends Empleado
{
	String nombre;
	double sueldo;
	
	public Cajero(String nom, double sueldo) {
		super(nom,sueldo, 0, 0, 0);
	}

	/*public Cajero(String nom, double sueldo) {
		this.nombre = nom;
		this.sueldo = sueldo;
	}*/
	
	@Override
	public String toString() {
		//return "Cajero [nombre=" + nombre + ", sueldo=" + sueldo + "]";
		return "Cajero [nombre=" + this.getNombre() + ", sueldo=" + this.getSalario() + "]";
	}

	/*public String getNombreC() {
		return this.nombre;
	}

	public double getSueldoC() {
		return this.sueldo;
	}

	public void setNombreC(String n) {
		this.nombre = n;
	}

	public void setSueldoC(double s) {
		this.sueldo = s;
	}*/

	//@Override
	public void averiguarSueldo() {
		//System.out.println("El sueldo del cajero " + this.getNombreC() + " es " + this.getSueldoC());
		System.out.println("El sueldo del cajero " + this.getNombre() + " es " + this.getSalario());
	}

	
}
