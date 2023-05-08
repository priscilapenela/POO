package tps1;

public class Articulo implements Entregable {
	private String titulo;
	private String genero;
	private boolean entregado;

	public Articulo() {
		titulo = " ";
		genero = " ";
		entregado = false;
	}

	public Articulo(String titulo2, String genero2) {
		this.titulo = titulo2;
		this.genero = genero2;
	}

	public String getTitulo() {
		return this.titulo;
	}

	public String getGenero() {
		return this.genero;
	}

	public void setTitulo(String titulo2) {
		this.titulo = titulo2;
	}

	public void setGenero(String genero2) {
		this.genero = genero2;
	}

	@Override
	public void entregar() {
		this.entregado = true;

	}

	@Override
	public void devolver() {
		this.entregado = false;
	}

	@Override
	public boolean isEntregado() {
		return this.entregado;
	}

	@Override
	public int compareTo(Object a) {
		// TODO Auto-generated method stub
		return 0;
	}

}
