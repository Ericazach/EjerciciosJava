package EjerciciosDos;

import static com.ipartek.formacion.bibliotecas.Consola.*;

public class promedioNotas {
	public static void main(String[] args) {
		int students;
		double nota, suma = 0, mayor, menor;

		mostrarLinea("Nota media, mayor y menor de una clase");
		mostrarLinea("--------------------------------------");

		do {
			students = leerEntero("Introduce la cantidad de alumnos: ");
		} while (students <= 0);

		nota = leerDoble("Nota del alumno 1");

		suma = suma + nota;

		mayor = nota;
		menor = nota;

		for (int i = 2; i <= students; i++) {
			nota = leerDoble("Nota del alumno" + i + ":");
			suma = suma + nota;
			if (nota > mayor) {
				mayor = nota;
			}

			if (nota < menor) {
				menor = nota;
			}
		}

		mostrarLinea("Nota media: " + suma / students);
		mostrarLinea("La mayor nota ha sido un " + mayor);
		mostrarLinea("La menor nota ha sido un " + menor);
	}
}
