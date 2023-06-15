package Ejercicios;

import java.util.Scanner;

public class multipleTresYCinco {
	public static void main(String[] args) {

		int number;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un numero");
		number = sc.nextInt();

		if (number % 3 == 0 && number % 5 == 0) {
			System.out.println("El numero es multiplo de 3 y 5");
		} else {
			System.out.println("El numero no es multiplo de 3 y 5");
		}
		sc.close();
	}

}
