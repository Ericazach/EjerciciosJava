package Ejercicios;

import java.util.Scanner;

public class ParOImpar {
	public static void main(String[] args) {

		int number;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un numero: ");
		number = sc.nextInt();

		if (number % 2 == 0) {
			System.out.println("El numero es par");
		} else {
			System.out.println("El numero es impar");
		}

		sc.close();
	}
}
