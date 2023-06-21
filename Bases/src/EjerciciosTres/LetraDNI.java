package EjerciciosTres;

import static com.ipartek.formacion.bibliotecas.Consola.*;

public class LetraDNI {
	private int numeroDNI;
	private char letra;

	public LetraDNI() {
	}

	public LetraDNI(int numeroDNI) {
		setNumeroDNI(numeroDNI);
		letra = calcularLetra();
	}

	public int getNumeroDNI() {
		return numeroDNI;
	}

	public void setNumeroDNI(int numeroDNI) {
		this.numeroDNI = numeroDNI;
	}

	public char getLetra() {
		return letra;
	}

	public void setLetra(char letra) {
		this.letra = letra;
	}

	public void leer() {
		do {
			numeroDNI = leerEntero("Introduce DNI:");
		} while (numeroDNI <= 0);

		letra = calcularLetra();
	}

	private char calcularLetra() {
		char[] letras = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H',
				'L', 'C', 'K', 'E' };
		return letras[numeroDNI % 23];
	}

	@Override
	public String toString() {
		return "DNI: " + numeroDNI + "-" + letra;
	}
}
