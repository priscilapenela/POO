package tps1;

import java.util.ArrayList;
import java.util.LinkedList;

public class VideoJuego extends Articulo {

	private int horasEstimadas;
	private String compania;

	VideoJuego() {
		super();
		horasEstimadas = 10;
		compania = " ";
	}

	VideoJuego(String titulo2, int horas) {
		super(titulo2, " ");
		this.horasEstimadas = horas;
		this.compania = " ";
	}

	VideoJuego(String titulo2, int horas, String genero2, String compania2) {
		super(titulo2, genero2);
		this.horasEstimadas = horas;
		this.compania = compania2;
	}

	public int getHorasEstimadas() {
		return this.horasEstimadas;
	}

	public String getCompania() {
		return this.compania;
	}

	public void setHorasEstimadas(int horas2) {
		this.horasEstimadas = horas2;
	}

	public void setCompania(String compania2) {
		this.compania = compania2;
	}

	@Override
	public String toString() {
		return "Videojuego [titulo=" + getTitulo() + ", horas=" + getHorasEstimadas() + ", genero=" + getGenero()
				+ ", compañia=" + getCompania() + "]";
	}

	@Override
	public int compareTo(Object a) {
		VideoJuego aux;
		if (a instanceof VideoJuego) {
			aux = (VideoJuego) a;
			return Integer.compare(this.horasEstimadas, aux.horasEstimadas);
		} else
			return 0;
	}

	public void juegoHoras(LinkedList<Articulo> articulos) {
		ArrayList<VideoJuego> juegoHoras = new ArrayList<VideoJuego>();

		for (Articulo ar : articulos) {
			if (ar instanceof VideoJuego) {
				if (juegoHoras.isEmpty()) {

					juegoHoras.add((VideoJuego) ar);
				} else {
					VideoJuego primera = juegoHoras.get(0);
					if (primera.compareTo(ar) < 0) {

						juegoHoras.clear();
						juegoHoras.add((VideoJuego) ar);

					}

					if (primera.compareTo(ar) == 0) {
						juegoHoras.add((VideoJuego) ar);
					}
				}
			}
		}
		System.out.println(juegoHoras);

	}
}
