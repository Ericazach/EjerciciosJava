package EjerciciosTres;

import static com.ipartek.formacion.bibliotecas.Consola.*;

public class CuentaPrueba {

	public static void main(String[] args) {
		String nombre, numeroCuenta;
		double tipoInteres, saldo;

		Cuenta cuenta1 = new Cuenta();

		nombre = leerLinea("Nombre de la cuenta: ");
		numeroCuenta = leerLinea("Numero de cuenta");
		tipoInteres = leerDoble("Tipo de interes: ");
		saldo = leerDoble("Saldo: ");

		cuenta1.setNombre(nombre);
		cuenta1.setNumeroCuenta(numeroCuenta);
		cuenta1.setTipoInteres(tipoInteres);
		cuenta1.setSaldo(saldo);

		Cuenta cuenta2 = new Cuenta("Juan Ferrández Rubio", "12345678901234567890", 1.75, 300);

		Cuenta cuenta3 = new Cuenta(cuenta1);

		mostrarLinea("Datos cuenta 1");
		mostrarLinea("Nombre: " + cuenta1.getNombre());
		mostrarLinea("Numero de Cuenta: " + cuenta1.getNumeroCuenta());
		mostrarLinea("Tipo de interes: " + cuenta1.getTipoInteres());
		mostrarLinea("Saldo: " + cuenta1.getSaldo());
		System.out.println("-----------------");

		cuenta1.ingreso(3000);

		mostrarLinea("Saldo: " + cuenta1.getSaldo());
		System.out.println("-----------------");

		mostrarLinea("Datos cuenta 2");
		mostrarLinea("Nombre: " + cuenta2.getNombre());
		mostrarLinea("Numero de Cuenta: " + cuenta2.getNumeroCuenta());
		mostrarLinea("Tipo de interes: " + cuenta2.getTipoInteres());
		mostrarLinea("Saldo: " + cuenta2.getSaldo());
		System.out.println("-----------------");

		mostrarLinea("Datos cuenta 3");
		mostrarLinea("Nombre: " + cuenta3.getNombre());
		mostrarLinea("Numero de Cuenta: " + cuenta3.getNumeroCuenta());
		mostrarLinea("Tipo de interes: " + cuenta3.getTipoInteres());
		mostrarLinea("Saldo: " + cuenta3.getSaldo());
		System.out.println("-----------------");

		cuenta3.transferencia(cuenta2, 10);

		mostrarLinea("Saldo cuenta 2");
		mostrarLinea("Saldo: " + cuenta2.getSaldo());
		System.out.println("-----------------");

		mostrarLinea("Saldo cuenta 3");
		mostrarLinea("Saldo: " + cuenta3.getSaldo());
		System.out.println("-----------------");
	}

}
