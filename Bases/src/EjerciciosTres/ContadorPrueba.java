package EjerciciosTres;

import static com.ipartek.formacion.bibliotecas.Consola.*;

public class ContadorPrueba {
	public static void main(String[] args) {

		Contador contador1 = new Contador();

		int number;

		number = leerEntero("Introduce un numero: ");

		contador1.setCont(number);
		
		contador1.incremento();
		
		mostrarLinea(contador1.getCont());
		mostrarLinea("-------------------------------");

		contador1.incremento();
		contador1.incremento();

		mostrarLinea(contador1.getCont());
		mostrarLinea("-------------------------------");

		contador1.decremento();

		mostrarLinea(contador1.getCont());
		mostrarLinea("-------------------------------");

		Contador contador2 = new Contador(10);

		contador2.incremento();

		mostrarLinea(contador2.getCont());
		mostrarLinea("-------------------------------");

		contador2.decremento();

		mostrarLinea(contador2.getCont());
		mostrarLinea("-------------------------------");

		Contador contador3 = new Contador(contador1);
		mostrarLinea(contador3.getCont());

	}
}
