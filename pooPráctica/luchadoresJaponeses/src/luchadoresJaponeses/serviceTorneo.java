package luchadoresJaponeses;

public class serviceTorneo {

	public static void main(String[] args) {
		
		Sumo s1 = new Sumo(1500, 300);
		Sumo s2 = new Sumo(1500, 320);
		
		Torneo t1 = new Torneo();
		
		t1.addParticipantes(s1);
		t1.addParticipantes(s2);
		
		t1.isDominante();

	}

}
