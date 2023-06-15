package com.ipartek.formacion.bibliotecas;

public class Utilidades {
	public static boolean convertirABollean(String boolTexto) {
		boolean bool = "S".equalsIgnoreCase(boolTexto.trim().substring(0, 1));

		return bool;
	}
}
