package Ejercicios;

import java.util.Scanner;

public class Ejercicios {
	public static void main(String[] args) {
		int n1, n2;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un numero: ");
		n1 = sc.nextInt();

		System.out.println("Introduce otro numero: ");
		n2 = sc.nextInt();

		System.out.println("Has elegido el numero: " + n1 + " y el numero: " + n2);

		sc.close();
	}
}
