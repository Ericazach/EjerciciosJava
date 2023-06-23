package com.ipartek.formacion.poo.pruebas;

import java.util.ArrayList;
import java.util.function.DoubleBinaryOperator;

public class LambdaPrueba {
	public static void main(String[] args) {
		DoubleBinaryOperator operacion;

		operacion = (a, b) -> a + b;
		System.out.println(operacion.applyAsDouble(5, 6));

		operacion = (a, b) -> {
			return a - b;
		};
		System.out.println(operacion.applyAsDouble(5, 6));

		ArrayList<Integer> enteros = new ArrayList<>();

		enteros.add(5);
		enteros.add(6);
		enteros.add(7);

		enteros.forEach(entero -> System.out.println(entero));

	}
}
