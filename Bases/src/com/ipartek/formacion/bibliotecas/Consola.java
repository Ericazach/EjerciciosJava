package com.ipartek.formacion.bibliotecas;

import java.util.Scanner;

public class Consola {

	private static final Scanner SC = new Scanner(System.in);

	public static void mostrarLinea(Object texto) {
		System.out.println(texto);
	}

	public static void mostrar(Object texto) {
		System.out.print(texto);
	}

	public static String leerLinea(String mensaje) {
		mostrar(mensaje + ": ");
		return SC.nextLine();
	}

	public static int leerEntero(String mensaje) {
		String texto = leerLinea(mensaje);
		int entero = Integer.parseInt(texto);

		return entero;
	}
	
	public static double leerDoble(String mensaje) {
		String texto = leerLinea(mensaje);
		double doble = Double.parseDouble(texto);

		return doble;
	}

	public static boolean leerBoolean(String mensaje) {
		String texto = leerLinea(mensaje);
		boolean booleano = Utilidades.convertirABollean(texto);

		return booleano;
	}

}
