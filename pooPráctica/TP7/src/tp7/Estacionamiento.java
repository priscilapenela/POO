package tp7;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Estacionamiento {
	private Queue<Avioneta> vehiculos;
	private Queue<Avioneta> colaEspera;
	private Queue<Avioneta> colaSalida;

	public Estacionamiento() {
		vehiculos = new LinkedList<>();
		colaEspera = new LinkedList<>();
		colaSalida = new LinkedList<>();
	}

	public void addAvioneta(Avioneta avi) {

		if (vehiculos.size() < 12) {
			vehiculos.offer(avi);

		} else {
			colaEspera.offer(avi);
		}
	}

	public void statusEstacionamiento() {

		Stack<Avioneta> stack = new Stack<>();
		while (!vehiculos.isEmpty()) {
			stack.push(vehiculos.poll());
		}

		while (!stack.empty()) {
			colaSalida.offer(stack.pop());
		}

		while (stack.empty()) {
			while (!colaSalida.isEmpty()) {
				if (colaSalida.element().getAccion() == 'S') {
					colaSalida.poll();
				} else {
					stack.push(colaSalida.poll());
				}
			}
		}

		while (!stack.empty()) {
			vehiculos.offer(stack.pop());
		}

		if (!colaEspera.isEmpty()) {
			while (vehiculos.size() < 12) {
				vehiculos.offer(colaEspera.poll());
			}
		}

		System.out.println(vehiculos);
	}

	public void mostrarEstacionamiento() {
		statusEstacionamiento();
	}
}
/*
 * Alumno: Priscila Penela
 * Comision TT
 * Fecha: 12/05/2023
 * 
 */
