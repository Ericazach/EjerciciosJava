import static com.ipartek.formacion.bibliotecas.Consola.*;

import java.util.Date;

public class Conversiones {
	public static void main(String[] args) {

		int numero = leerEntero("Dime un numero");

		mostrarLinea(numero + 4);

		mostrarLinea(leerEntero("Dime un numero"));

		boolean bool = leerBoolean("Te gusta?");

		mostrarLinea(bool);

		String boolOtroTexto = String.valueOf(bool);

		mostrarLinea(boolOtroTexto);

		Date fecha = new Date();
		String fechaTexto = fecha.toString();

		mostrarLinea(fechaTexto);

		fechaTexto = String.valueOf(fecha);

		mostrarLinea(fechaTexto);
	}

}
