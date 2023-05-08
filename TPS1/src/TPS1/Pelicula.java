package tps1;

import java.util.ArrayList;
import java.util.LinkedList;

public class Pelicula extends Articulo {
	private int anio;
	private String director;

	public Pelicula() {
		super(" ", "no definido");
		this.anio = 0;
		this.director = " ";
	}

	public Pelicula(String titulo2, String director2) {
		super(titulo2, " ");
		this.director = director2;
	}

	public Pelicula(String titulo2, int anio2, String genero2, String director2) {
		super(titulo2, genero2);
		this.anio = anio2;
		this.director = director2;
	}

	public int getAnio() {
		return this.anio;
	}

	public String getDirector() {
		return this.director;
	}

	public void setAnio(int anio2) {
		this.anio = anio2;
	}

	public void setDirector(String director2) {
		this.director = director2;
	}

	@Override
	public String toString() {
		return "Pelicula [titulo=" + getTitulo() + ", año=" + getAnio() + ", genero=" + getGenero() + ", director="
				+ getDirector() + "]";
	}

	@Override
	public int compareTo(Object a) {
		Pelicula aux;
		if (a instanceof Pelicula) {
			aux = (Pelicula) a;
			return Integer.compare(this.anio, aux.anio);
		} else
			return 0;

	}

	public void peliAntigua(LinkedList<Articulo> articulos) {
		ArrayList<Pelicula> PelisAntiguas = new ArrayList<Pelicula>();

		for (Articulo ar : articulos) {
			if (ar instanceof Pelicula) {
				if (PelisAntiguas.isEmpty()) {

					PelisAntiguas.add((Pelicula) ar);
				} else {
					Pelicula primera = PelisAntiguas.get(0);
					if (primera.compareTo(ar) > 0) {

						PelisAntiguas.clear();
						PelisAntiguas.add((Pelicula) ar);

					}

					if (primera.compareTo(ar) == 0) {
						PelisAntiguas.add((Pelicula) ar);
					}
				}
			}
		}
		System.out.println(PelisAntiguas);

	}
}
