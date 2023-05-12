package tp7;

public class ServiceEstacionamiento {

	public static void main(String[] args) {

		Estacionamiento e1 = new Estacionamiento();

		Avioneta a1 = new Avioneta("AVRuO23", 'E');
		Avioneta a2 = new Avioneta("AVRuO24", 'E');
		Avioneta a3 = new Avioneta("AVRuO25", 'E');
		Avioneta a4 = new Avioneta("AVRuO26", 'E');
		Avioneta a5 = new Avioneta("AVRuO27", 'E');
		Avioneta a6 = new Avioneta("AVRuO28", 'E');
		Avioneta a7 = new Avioneta("AVRuO29", 'E');
		Avioneta a8 = new Avioneta("AVRuO30", 'E');
		Avioneta a9 = new Avioneta("AVRuO31", 'E');
		Avioneta a10 = new Avioneta("AVRuO32", 'E');
		Avioneta a11 = new Avioneta("AVRuO33", 'E');
		Avioneta a12 = new Avioneta("AVRuO34", 'E'); // hasta acá son 12 avionetas
		Avioneta a13 = new Avioneta("AVRuO35", 'E'); 
		Avioneta a14 = new Avioneta("AVRuO36", 'E');
		Avioneta a15 = new Avioneta("AVRuO37", 'E');

		e1.addAvioneta(a1);
		e1.addAvioneta(a2);
		e1.addAvioneta(a3);
		e1.addAvioneta(a4);
		e1.addAvioneta(a5);
		e1.addAvioneta(a6);
		e1.addAvioneta(a7);
		e1.addAvioneta(a8);
		e1.addAvioneta(a9);
		e1.addAvioneta(a10);
		e1.addAvioneta(a11);
		e1.addAvioneta(a12);
		e1.addAvioneta(a13);
		e1.addAvioneta(a14);
		e1.addAvioneta(a15);

		e1.mostrarEstacionamiento();
		a3.setAccion('S');
		a2.setAccion('S');
		e1.mostrarEstacionamiento();
		a4.setAccion('S');
		e1.mostrarEstacionamiento();

	}

}
/*
 * Alumno: Priscila Penela
 * Comision TT
 * Fecha: 12/05/2023
 * 
 */