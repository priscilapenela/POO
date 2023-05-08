package tps1;

public class ServiceVideoClub{

	public static void main(String[] args) {

		Pelicula p1 = new Pelicula();
		Pelicula p2 = new Pelicula("Rapidos y Furiosos", " Gary Scott Thompson");
		Pelicula p3 = new Pelicula("Volver al Futuro", 1985, "Accion", "Rob Cohen");
		Pelicula p4 = new Pelicula("Rocky", 1965, "Accion", "Rob Cohen");

		Serie s1 = new Serie();
		Serie s2 = new Serie("WandaVision", "Matt Shakman");
		Serie s3 = new Serie("The Mandalorian", 4, "Ciencia Ficcion", "Jon Favreau");

		VideoJuego v1 = new VideoJuego();
		VideoJuego v2 = new VideoJuego("Star Wars Jedi: Fallen Order", 100);
		VideoJuego v3 = new VideoJuego("The Legend of Zelda: Breath of the Wild", 101, "Acción-Aventura", "Nintendo");

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