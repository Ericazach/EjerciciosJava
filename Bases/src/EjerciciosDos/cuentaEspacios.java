package EjerciciosDos;

import static com.ipartek.formacion.bibliotecas.Consola.*;

import java.util.StringTokenizer;

public class cuentaEspacios {

	public static void main(String[] args) {
		mostrarLinea("Numero de palabras " + cuentaEspacios("Hola como"));

		String frase = leerLinea("Introduce una frase");

		StringTokenizer st = new StringTokenizer(frase);
		mostrarLinea("Numero de palabras: " + st.countTokens());
	}

	public static int cuentaEspacios(String s) {
		int counter = 1, pos;

		s = s.trim();

		if (s.isEmpty()) {
			counter = 1;
		} else {
			pos = s.indexOf(" ");
			while (pos != -1) {
				counter++;
				pos = s.indexOf(" ", pos + 1);
			}
		}

		return counter;
	}

}
