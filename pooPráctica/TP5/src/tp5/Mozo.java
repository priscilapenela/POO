package tp5;

//public class Mozo implements Empleado 
public class Mozo extends Empleado
{	
	String nombre;
	double sueldo;
	double propina;
	
	@Override
	public String toString() {
		//return "Mozo [nombre=" + nombre + ", sueldo=" + sueldo + ", propina=" + propina + "]";
		return "Mozo [nombre=" + this.getNombre() + ", sueldo=" + this.getSalario() + ", propina=" + this.getPropinaM() + "]";
	}
	
	public Mozo(String nom, double sueldo) {
		super(nom, sueldo, 0, 0, 0);
	}

	/*public Mozo(String nom, double sueldo) {
		this.nombre = nom;
		this.sueldo = sueldo;
	}

	public String getNombreM() {
		return this.nombre;
	}

	public double getSueldoM() {
		return this.sueldo;
	}

	public void setNombreM(String nom) {
		this.nombre = nom;
	}

	public void setSueldoM(double s) {
		this.sueldo = s;
	}*/
	
	public double getPropinaM() {
		return this.propina;
	}

	public void setPropinaM(double p) {
		this.propina = p;
	}
	
	public void recibirPropina(double propina){
		  this.setPropinaM(this.getPropinaM() + propina);
		}
	//@Override
	public void averiguarSueldo() {
		//double Total = this.sueldo + this.propina;
		double Total = this.getSalario() + this.propina;
		//System.out.println("El sueldo del mozo " + this.getNombreM() + " es " + Total);
		System.out.println("El sueldo del mozo " + this.getNombre() + " es " + Total);
	}

}
/*
 *Alumno: Penela Priscila
 *Comisión: TT
 *Fecha: 6/5/2023
 *
 */
