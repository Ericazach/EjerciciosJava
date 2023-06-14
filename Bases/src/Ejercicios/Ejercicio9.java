package Ejercicios;

import java.util.Scanner;

public class Ejercicio9 {
	public static void main(String[] args) {

		int number;

		Scanner sc = new Scanner(System.in);
		System.out.println("introduzca un numero entre 0 y 10");
		number = sc.nextInt();

		if (number >= 0 && number < 5) {
			System.out.println("Insuficiente");
		} else if (number >= 5 && number < 6) {
			System.out.println("Suficiente");
		} else if (number >= 6 && number < 7) {
			System.out.println("Bien");
		} else if (number >= 7 && number < 9) {
			System.out.println("Notable");
		} else {
			System.out.println("Sobresaliente");
		}

		sc.close();

	}
}
