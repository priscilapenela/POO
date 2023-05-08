package tps1;

import java.util.ArrayList;
import java.util.LinkedList;

public class Serie extends Articulo {

	private int numTemporadas;
	private String creador;

	Serie() {
		super();
		this.numTemporadas = 3;
		this.creador = " ";
	}

	Serie(String titulo2, String creador2) {
		super(titulo2, " ");
		this.numTemporadas = 3;
		this.creador = creador2;
	}

	Serie(String titulo2, int temporadas2, String genero2, String creador2) {
		super(titulo2, genero2);
		this.numTemporadas = temporadas2;
		this.creador = creador2;
	}

	public int getNumTemporadas() {
		return this.numTemporadas;
	}

	public String getCreador() {
		return this.creador;
	}

	public void setNumTemporadas(int temporadas2) {
		this.numTemporadas = temporadas2;
	}

	public void setCreador(String creador2) {
		this.creador = creador2;
	}

	@Override
	public String toString() {
		return "Serie [titulo=" + getTitulo() + ", temporadas=" + getNumTemporadas() + ", genero=" + getGenero()
				+ ", creador=" + getCreador() + "]";
	}

	@Override
	public int compareTo(Object a) {
		Serie aux;
		if (a instanceof Serie) {
			aux = (Serie) a;
			return Integer.compare(this.numTemporadas, aux.numTemporadas);
		} else
			return 0;
	}

	public void serieTemporadas(LinkedList<Articulo> articulos) {
		ArrayList<Serie> serieTemporadas = new ArrayList<Serie>();

		for (Articulo ar : articulos) {
			if (ar instanceof Serie) {
				if (serieTemporadas.isEmpty()) {

					serieTemporadas.add((Serie) ar);
				} else {
					Serie primera = serieTemporadas.get(0);
					if (primera.compareTo(ar) < 0) {

						serieTemporadas.clear();
						serieTemporadas.add((Serie) ar);

					}

					if (primera.compareTo(ar) == 0) {
						serieTemporadas.add((Serie) ar);
					}
				}
			}
		}
		System.out.println(serieTemporadas);

	}
}
