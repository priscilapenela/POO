package luchadoresJaponeses;

public class Sumo implements Comparable<Sumo> {
	private int altura;
	private int peso;

	public Sumo(int alt2, int p2) {
		this.altura = alt2;
		this.peso = p2;
	}

	public int getAltura() {
		return this.altura;
	}

	public void setAltura(int alt2) {
		this.altura = alt2;
	}

	public int getPeso() {
		return this.peso;
	}

	public void setPeso(int p2) {
		this.peso = p2;
	}

	@Override
	public String toString() {
		return "Sumo [altura=" + getAltura() + ", peso=" + getPeso() + "]";
	}

	@Override
	public int compareTo(Sumo o) {
		int pesoComparison = Integer.compare(this.peso, o.peso);
		int alturaComparison = Integer.compare(this.altura, o.altura);

		if (pesoComparison > 0 && alturaComparison > 0) {
			return 1;
		} else if (pesoComparison == 0 && alturaComparison > 0) {
			return 1;
		} else if (pesoComparison > 0 && alturaComparison == 0) {
			return 1;
		} else {
			return 0;
		}
	}

}
