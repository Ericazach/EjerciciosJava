package EjerciciosTres;

import static com.ipartek.formacion.bibliotecas.Consola.*;

public class LetraDNIPrueba {
	public class Main {

		public static void main(String[] args) {
			LetraDNI nif1 = new LetraDNI();
			nif1.leer();
			mostrarLinea(nif1);

			LetraDNI nif2 = new LetraDNI(12345678);
			mostrarLinea(nif2);
		}
	}
}
