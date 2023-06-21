package EjerciciosTres;

import static com.ipartek.formacion.bibliotecas.Consola.*;

public class FechaPrueba {
	public static void main(String[] args) {
		int dia, mes, año;

		Fecha fecha1 = new Fecha();

		dia = leerEntero("Escribe un dia: ");
		mes = leerEntero("Escribe un mes: ");
		año = leerEntero("Escribe un año: ");

		fecha1.setDia(dia);
		fecha1.setMes(mes);
		fecha1.setAño(año);

		if (fecha1.fechaCorrecta(fecha1)) {
			mostrarLinea(fecha1.toString());
		} else {
			mostrarLineaError("La fecha introducida no es correcta");
		}

		fecha1.diaSiguiente(fecha1);

		mostrarLinea(fecha1);

		fecha1.diaSiguiente(fecha1);
		fecha1.diaSiguiente(fecha1);
		fecha1.diaSiguiente(fecha1);
		fecha1.diaSiguiente(fecha1);
		fecha1.diaSiguiente(fecha1);
		fecha1.diaSiguiente(fecha1);

		mostrarLinea(fecha1);
	}
}
