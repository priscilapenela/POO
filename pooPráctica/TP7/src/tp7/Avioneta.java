package tp7;

public class Avioneta {
	private String matricula;
	private char accion;

	public Avioneta(String matricula2, char act) {
		this.matricula = matricula2;
		this.accion = act;
	}

	public String getMatricula() {
		return this.matricula;
	}

	public void setMatricula(String matricula2) {
		this.matricula = matricula2;
	}

	public char getAccion() {
		return this.accion;
	}

	public void setAccion(char act2) {
		this.accion = act2;
	}

	@Override
	public String toString() {
		return "Avioneta [matricula=" + getMatricula() + ", accion=" + getAccion() + "]";
	}

}
/*
 * Alumno: Priscila Penela
 * Comision TT
 * Fecha: 12/05/2023
 * 
 */