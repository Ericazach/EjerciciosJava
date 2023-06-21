package EjerciciosDos;

import static com.ipartek.formacion.bibliotecas.Consola.*;

import java.io.IOException;
import java.util.Scanner;

public class numerosAcabadosEnDos {
	public static void main(String[] args) throws IOException {
		int number, counter = 0;
		String car = "s";

		Scanner sc = new Scanner(System.in);
//		number = leerEntero("Introduce un numero: ");

		do {
			number = leerEntero("Introduce un numero ");

			if (number % 10 == 2) {
				counter++;
			}
			mostrarLinea("Desea continuar? (s/N)");
			car = sc.nextLine();
		} while (car.equals("s"));

		mostrarLinea("Se ha introducido " + counter + " numeros acabados en 2");
		sc.close();
	}
}
