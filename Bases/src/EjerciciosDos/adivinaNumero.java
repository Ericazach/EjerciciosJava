package EjerciciosDos;

import java.util.Random;

import static com.ipartek.formacion.bibliotecas.Consola.*;

public class adivinaNumero {
	public static void main(String[] args) {

		int num, aux;

		Random aux1 = new Random();

		aux = aux1.nextInt(10);

		do {
			num = leerEntero("Escoge un numero");

			while (num != aux) {
				num = leerEntero("Intenta otra vez");
			}

			if (num == aux) {
				mostrarLinea("Felicidades!!!");
			}

		} while (num != aux);
	}
}
