package tp6;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	int operacion;
	
	Menu(ArrayList<Empleado> em1){
		Scanner teclado = new Scanner(System.in);
		
		do {	
			
			System.out.println("MENU DE OPERACIONES\n");
	        System.out.println("1- Ingresar Empleado");
	        System.out.println("2- Modificar Empleado");
	        System.out.println("3- Dar de Baja Empleado");
	        System.out.println("4- Aumentar 5% a todos");
	        System.out.println("5- Ver lista de empleados");
	        System.out.println("6- Salir");
	        System.out.print("\nIngrese una opcion: ");
			this.operacion = teclado.nextInt();
			
			//for(int i=1;i<50;i++)System.out.println();
			
			switch (operacion){
			case 1: 
				ingresarEmpleado(em1);
				System.out.println("Presione Enter para continuar...");
				new java.util.Scanner(System.in).nextLine();
			break;
			case 2:
				modificarEmpleado(em1);
				System.out.println("Presione Enter para continuar...");
				new java.util.Scanner(System.in).nextLine();
				
			break;
			case 3: 
				darBaja(em1);
				System.out.println("Presione Enter para continuar...");
				new java.util.Scanner(System.in).nextLine();
				
			break;
			case 4: 
				aumento(em1);
				System.out.println("Presione Enter para continuar...");
				new java.util.Scanner(System.in).nextLine();
				
			break;
			case 5: 
				verLista(em1);
				System.out.println("Presione Enter para continuar...");
				new java.util.Scanner(System.in).nextLine();
				
			break;
			case 6:
				salir();
				System.out.println("Presione Enter para continuar...");
				new java.util.Scanner(System.in).nextLine();
			break;
			}
			
		
		} while(operacion != 6);
		
		 System.out.println("Fin del Programa");
		 teclado.close();
		 
		
		}
	
	public void ingresarEmpleado(ArrayList<Empleado> empleado) {
		Scanner Leer = new Scanner(System.in);
		
		System.out.println("\nINGRESAR EMPLEADO\n");
		 
			System.out.print("Ingresar nombre: ");
			String n = Leer.next();
			System.out.print("\nIngrese salario: ");
			double s = Leer.nextDouble();
			System.out.print("\nIngresar año de ingreso: ");
			int a = Leer.nextInt();
			System.out.print("\nIngresar mes de ingreso: ");
			int m = Leer.nextInt();
			System.out.print("\nIngresar dia de ingreso: ");
			int d = Leer.nextInt();
			
			empleado.add(new Empleado(n,s,a,m,d));
		
	}

	public void modificarEmpleado(ArrayList<Empleado> empleado) {
		Scanner Leer = new Scanner(System.in);
		for(Empleado e : empleado) {
			System.out.println(e.getNombre()+ "  Indice: "+ empleado.indexOf(e));
		}
			System.out.println("\nIngrese el indice del empleado que desea modificar: ");
			int index = Leer.nextInt();
			System.out.println("Ingresar nuevo nombre: ");
			String n2 = Leer.next();
			empleado.get(index).setNombre(n2);
		
		
	}
	
	public void darBaja(ArrayList<Empleado> empleado) {
		Scanner Leer = new Scanner(System.in);
		for(Empleado e: empleado) {
			System.out.println(e.getNombre()+ "  Indice: "+ empleado.indexOf(e));
		}
		System.out.println("Ingrese el indice del empleado que desea eliminar: ");
		int index = Leer.nextInt();
		empleado.remove(index);
		System.out.println("Desea verificar cambios? 1-Si 2-No");
		int option = Leer.nextInt();
		if(option == 1) 
			mostrar(empleado);
	}
	
	public void aumento(ArrayList<Empleado> empleado) {
		System.out.println("Aumento del 5%: ");
		for(Empleado e: empleado) {
			e.raiseSalario(5);
		}
		
	}
	
	public void verLista(ArrayList<Empleado> empleado) {
		System.out.println("Lista de empleados: ");
		mostrar(empleado);
	}
	
	public void salir() {
		System.out.println("Fin");
	}
	
	static void mostrar(ArrayList<Empleado> staff)
	//static void mostrar(LinkedList<Empleado> staff, Scanner Leer)
   { 	   
        for (Empleado e : staff)
        {
        	System.out.println("nombre=" + e.getNombre() + ",salario=" + e.getSalario() + ",fecha de alta=" 
                               + e.getFecha_alta());
           int indice=staff.indexOf(e);
		   System.out.println(e.getNombre()+ "  Indice: "+ indice);
        }  
        //System.out.println("Con get(i) " + staff.get(0));
        //System.out.println("Sin get(i) " + staff);
        System.out.println("Tamaño ArrayList: "+ staff.size());
       // System.out.println("Tamaño LinkedList: "+ staff.size());
        
   }

}
