package tp6;

import java.util.ArrayList;


public class ArrayListTestEmpleado
{  
	public static void main(String[] args)
	{
	
		ArrayList<Empleado> staff = new ArrayList<Empleado>();	
		
		Empleado e1 = new Empleado("Juan",250,1989,9,3);
		Empleado e2 = new Empleado("Marta",200,2000,4,22);
		Empleado e3 = new Empleado("Marcelo",250,2002,12,10);
		
		staff.add(e1);
		staff.add(e2);
		staff.add(e3);
	  
		Menu m1 = new Menu(staff);
	 
	}
}
/*
 *Alumno: Penela Priscila
 *Comisión: TT
 *Fecha: 6/5/2023
 *
 */