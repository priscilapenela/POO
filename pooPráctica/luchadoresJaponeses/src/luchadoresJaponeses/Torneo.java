package luchadoresJaponeses;

import java.util.LinkedList;

public class Torneo {
	private LinkedList<Sumo> participantes;

	public Torneo() {
		participantes = new LinkedList<Sumo>();
	}

	public void addParticipantes(Sumo sumito) {
		participantes.add(sumito);
	}

	public void isDominante() {
		LinkedList<Sumo> copiaP = new LinkedList<Sumo>();
		LinkedList<Integer> cantDominantes = new LinkedList<Integer>();
		copiaP.addAll(participantes);
		int cont = 0;
		for (Sumo s1 : participantes) {
			for (Sumo s2: copiaP) {
				System.out.println(s2);
				if (s1.compareTo(s2) == -1 || s1.compareTo(s2) == 0 || s1.compareTo(s2) == 1) {
					cont++;
				}
			}
			cantDominantes.add(cont);
		}

		//System.out.println(cantDominantes);
	}

	public void mostrarParticipantes() {

	}

}
