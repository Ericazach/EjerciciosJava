package Ejercicios;

import java.util.Scanner;

public class igualesONo {
	public static void main(String[] args) {

		int n1, n2;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un numero:");
		n1 = sc.nextInt();
		System.out.println("introduce otro numero:");
		n2 = sc.nextInt();

		if (n1 == n2) {
			System.out.println("Los numeros son iguales");
		} else {
			System.out.println("Los numeros no son iguales");
		}

		sc.close();
	}
}
