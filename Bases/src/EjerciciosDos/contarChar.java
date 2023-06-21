package EjerciciosDos;

import static com.ipartek.formacion.bibliotecas.Consola.*;

public class contarChar {

	public static void main(String[] args) {
		String texto;
		String car;
		int counter = 0;

		do {
			texto = leerLinea("Introduce un texto");
		} while (texto.isEmpty());

		car = leerLinea("Escribe una letra:");

		counter = contarCharc(texto, car);

		mostrarLinea("El caracter " + car + " aparece " + counter + " vez en el texto " + texto);

	}

	public static int contarCharc(String text, String caracter) {

		int counterChar = 0, pos;

		pos = text.indexOf(caracter);

		while (pos != -1) {
			counterChar++;
			pos = text.indexOf(caracter, pos + 1);
		}

		return counterChar;
	}
}
