package EjerciciosDos;

import static com.ipartek.formacion.bibliotecas.Consola.*;

public class TablaMultiplicar {
	public static void main(String[] args) {
		int number = leerEntero("Introduce un numero");

		mostrarLinea("Tabla del " + number);

		for (int i = 1; i <= 10; i++) {
			mostrarLinea(number + " * " + i + " = " + number * i);
		}

	}
}
