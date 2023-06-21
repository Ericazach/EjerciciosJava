package EjerciciosTres;

import static com.ipartek.formacion.bibliotecas.Consola.*;

public class LibrosPrueba {

	public static void main(String[] args) {
		String titulo, autor;
		int totalEjemplares;

		Libro libro1 = new Libro("El Quijote", "Cervantes", 1, 0);
		Libro libro2 = new Libro();

		titulo = leerLinea("Introduce un titulo:");
		autor = leerLinea("Introduce un autor: ");
		totalEjemplares = leerEntero("Numero de ejemplares");

		libro2.setTitulo(titulo);
		libro2.setAutor(autor);
		libro2.setTotalEjemplares(totalEjemplares);

		mostrarLinea("Libro 1");
		mostrarLinea("Titulo: " + libro1.getTitulo());
		mostrarLinea("Autor: " + libro1.getAutor());
		mostrarLinea("Total de ejemplares: " + libro1.getTotalEjemplares());
		mostrarLinea("Total prestados: " + libro1.getEjemplaresPrestados());
		mostrarLinea("--------------------------------");

		if (libro1.prestamo()) {
			mostrarLinea("Se ha prestado el libro " + libro1.getTitulo());
		} else {
			mostrarLinea("No quedan ejemplares del libro " + libro1.getTitulo() + " para prestar");
		}

		if (libro1.devolucion()) {
			mostrarLinea("Se ha devuelto el libro " + libro1.getTitulo());
		} else {
			mostrarLinea("No quedan ejemplares del libro " + libro1.getTitulo() + " para prestar");
		}

		if (libro1.prestamo()) {
			mostrarLinea("Se ha prestado el libro " + libro1.getTitulo());
		} else {
			mostrarLinea("No quedan ejemplares del libro " + libro1.getTitulo() + " para prestar");
		}

		if (libro1.prestamo()) {
			mostrarLinea("Se ha prestado el libro " + libro1.getTitulo());
		} else {
			mostrarLinea("No quedan ejemplares del libro " + libro1.getTitulo() + " para prestar");
		}

		mostrarLinea("Libro 1");
		mostrarLinea("Titulo: " + libro1.getTitulo());
		mostrarLinea("Autor: " + libro1.getAutor());
		mostrarLinea("Total de ejemplares: " + libro1.getTotalEjemplares());
		mostrarLinea("Total prestados: " + libro1.getEjemplaresPrestados());
		mostrarLinea("--------------------------------");

		mostrarLinea("Libro 2");
		mostrarLinea("Titulo: " + libro2.getTitulo());
		mostrarLinea("Autor: " + libro2.getAutor());
		mostrarLinea("Total de ejemplares: " + libro2.getTotalEjemplares());
		mostrarLinea("Total prestados: " + libro2.getEjemplaresPrestados());
		mostrarLinea("--------------------------------");
	}
}
