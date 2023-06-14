package Ejercicios;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int number;

		System.out.println("Introduce un numero: ");
		number = sc.nextInt();

		if (number % 10 == 0) {
			System.out.println("El numero es multiplo de 10");
		} else {
			System.out.println("El numero no es multiplo de 10");
		}

		sc.close();
	}
}
