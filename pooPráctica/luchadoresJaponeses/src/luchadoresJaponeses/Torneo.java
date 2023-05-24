package luchadoresJaponeses;

import java.util.ArrayList;
import java.util.LinkedList;

public class Torneo {
	private ArrayList<Sumo> participantes;

	public Torneo(int cantSumos) throws Exception {
		if (1 <= cantSumos && cantSumos <= 100000) {
			participantes = new ArrayList<Sumo>(cantSumos - 1);
		} else {
			throw new Exception("La cantidad de participantes es mayor o menor de la permitida" + cantSumos);
		}
	}

	public void addParticipantes(Sumo sumito) {
		participantes.add(sumito);
	}

	public LinkedList<Integer> isDominante() {
		LinkedList<Sumo> copiaP = new LinkedList<Sumo>();
		LinkedList<Integer> cantDominantes = new LinkedList<Integer>();
		copiaP.addAll(participantes);
		int cont = 0;
		for (Sumo s1 : participantes) {
			for (Sumo s2 : copiaP) {
				if (s1.compareTo(s2) == 1) {
					cont++;
				}
			}
			cantDominantes.add(cont);
			cont = 0;
		}

		return cantDominantes;
	}

	public void mostrarParticipantes() {
		System.out.println(participantes.size());
		for (Sumo s : participantes) {
			System.out.println(s);
		}
	}

}
