package TPS1;

public class Prueba {

	public static void main(String[] args) {

		Articulo p1 = new Pelicula();
		Articulo p2 = new Pelicula("Rapidos y Furiosos", " Gary Scott Thompson");
		Articulo p3 = new Pelicula("Volver al Futuro", 1985, "Accion", "Rob Cohen");
		Articulo p4 = new Pelicula("Volver al Futuro", 1965, "Accion", "Rob Cohen");

		Articulo s1 = new Serie();
		Articulo s2 = new Serie("WandaVision", "Matt Shakman");
		Articulo s3 = new Serie("The Mandalorian", 4, "Ciencia Ficcion", "Jon Favreau");

		Articulo v1 = new VideoJuego();
		Articulo v2 = new VideoJuego("Star Wars Jedi: Fallen Order", 100);
		Articulo v3 = new VideoJuego("The Legend of Zelda: Breath of the Wild", 101, "Acción-Aventura", "Nintendo");

		VideoClub vc1 = new VideoClub();

		vc1.addArticulos(p1);
		vc1.addArticulos(p2);
		vc1.addArticulos(p3);
		vc1.addArticulos(p4);
		vc1.addArticulos(s1);
		vc1.addArticulos(s2);
		vc1.addArticulos(s3);
		vc1.addArticulos(v1);
		vc1.addArticulos(v2);
		vc1.addArticulos(v3);

		p1.entregar();
		p2.entregar();
		s1.entregar();
		v2.entregar();

		vc1.mostrarArticulos();

	}
}