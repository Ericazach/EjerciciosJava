package Ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {

		int number;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un numero ");

		number = sc.nextInt();

		System.out.println("El doble de tu numero es: " + number * 2 + " y el triple es: " + number * 3);

		sc.close();
	}
}
