package TPS1;

import java.util.ArrayList;
import java.util.LinkedList;

public class VideoClub {
	private LinkedList<Articulo> articulos;

	public VideoClub() {
		articulos = new LinkedList<>();
	}

	public void addArticulos(Articulo articulo2) {
		articulos.add(articulo2);
	}

	public void mostrarArticulos() {
		ArrayList<Articulo> Entregados = new ArrayList<Articulo>();
		Pelicula aux = null;
		VideoJuego aux2 = null;
		Serie aux3 = null;

		System.out.println("TODOS LOS ARTICULOS\n");
		for (Articulo ar : articulos) {
			System.out.println(ar);
			if (ar instanceof Pelicula) {

				aux = (Pelicula) ar;
				if (aux.isEntregado()) {
					Entregados.add(ar);
				}

			}

			if (ar instanceof Serie) {

				aux3 = (Serie) ar;
				if (aux3.isEntregado()) {
					Entregados.add(ar);
				}
			}

			if (ar instanceof VideoJuego) {

				aux2 = (VideoJuego) ar;
				if (aux2.isEntregado()) {
					Entregados.add(ar);
				}
			}

		}

		System.out.println("\n------------ARTICULOS ENTREGADOS-----------\n");
		for (Articulo ar : Entregados) {
			System.out.println(ar);
		}

		System.out.println("\nTotal de Series, Peliculas y VideoJuegos entregados: " + Entregados.size());

		System.out.println("\n-------------------------INFORMACION--------------------------\n");
		System.out.print("PELICULA/S ANTIGUA/S: ");
		aux.peliAntigua(articulos);
		System.out.print("VIDEOJUEGO/S CON MÁS HORAS: ");
		aux2.juegoHoras(articulos);
		System.out.print("SERIE/S CON MÁS TEMPORADAS: ");
		aux3.serieTemporadas(articulos);

	}
}
