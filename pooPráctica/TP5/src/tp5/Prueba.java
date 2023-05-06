package tp5;

public class Prueba {

	public static void main(String[] args) {
		
		
		 
		Cajero e2 = new Cajero("Lauti",328);
		Mozo e1 = new Mozo("Mateo",329.0);
		
		e1.recibirPropina(100);
		e1.recibirPropina(200);
		e1.recibirPropina(300);
		e1.averiguarSueldo();
	    calculoSueldo(e1);
	    System.out.println(e1.toString());
	    System.out.println(e2.toString());
		
	}
	
	static void calculoSueldo(Empleado i) 
	//public static void calculaSueldo(Empleado i)
	{
		// TODO Auto-generated method stub
		i.averiguarSueldo();
	}


}
/*
 *Alumno: Penela Priscila
 *Comisión: TT
 *Fecha: 6/5/2023
 *
 */