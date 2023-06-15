package EjerciciosDos;

import static com.ipartek.formacion.bibliotecas.Consola.*;

public class intercambiarLugares {
	public static void main(String[] args) {
		int a, b, aux;

		a = leerEntero("Introduce un numero");
		b = leerEntero("Introduce otro numero");

		mostrarLinea("El numero A es: " + a + " y el numero b es: " + b);

		aux = a;
		a = b;
		b = aux;

		mostrarLinea("El numero A es: " + a + " y el numero b es: " + b);

	}
}
