package EjerciciosTres;

public class Libro {
	private String titulo;
	private String autor;
	private int totalEjemplares;
	private int ejemplaresPrestados;

	public Libro() {

	}

	public Libro(String titulo, String autor, int totalEjemplares, int ejemplaresPrestados) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.totalEjemplares = totalEjemplares;
		this.ejemplaresPrestados = ejemplaresPrestados;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getTotalEjemplares() {
		return totalEjemplares;
	}

	public void setTotalEjemplares(int totalEjemplares) {
		this.totalEjemplares = totalEjemplares;
	}

	public int getEjemplaresPrestados() {
		return ejemplaresPrestados;
	}

	public void setEjemplaresPrestados(int ejemplaresPrestados) {
		this.ejemplaresPrestados = ejemplaresPrestados;
	}

	public boolean prestamo() {
		boolean prestamoCorrecto = true;
		if (totalEjemplares <= 0) {
			prestamoCorrecto = false;
		} else {
			totalEjemplares--;
			ejemplaresPrestados++;
		}

		return prestamoCorrecto;
	}

	public boolean devolucion() {
		boolean devolucionCorrecta = true;
		if (ejemplaresPrestados == 0) {
			devolucionCorrecta = false;
		} else {
			totalEjemplares++;
			ejemplaresPrestados--;
		}

		return devolucionCorrecta;
	}

	@Override
	public String toString() {
		return "titulo: " + titulo + "\nautor: " + autor + "\nejemplares: " + totalEjemplares + "\nprestados: "
				+ ejemplaresPrestados;
	}

}
