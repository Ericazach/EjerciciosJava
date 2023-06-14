package Ejercicios;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {

		int n1, n2;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un numero");
		n1 = sc.nextInt();
		System.out.println("Introduce otro numero");
		n2 = sc.nextInt();

		if (n1 > n2) {
			System.out.println("El numero " + n1 + " es mayor a " + n2);
		} else if (n2 > n1) {
			System.out.println("El numero " + n2 + " es mayor a " + n1);
		} else {
			System.out.println("Los numeros son iguales");
		}
		sc.close();
	}
}
