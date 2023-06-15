package EjerciciosDos;

import static com.ipartek.formacion.bibliotecas.Consola.*;

import java.io.IOException;

public class numerosAcabadosEnDos {
	public static void main(String[] args) throws IOException {
		int number, counter = 0;
		char car = 's';

		number = leerEntero("Introduce un numero: ");

		while (car != 'n' && car != 'N') {
			if (number % 10 == 2) {
				counter++;
			}

			number = leerEntero("Introduce un numero: ");
			mostrarLinea("Desea continuar?");
			car = (char) System.in.read();

		}

		mostrarLinea("Se ha introducido " + counter + " numeros acabados en 2");

	}
}
