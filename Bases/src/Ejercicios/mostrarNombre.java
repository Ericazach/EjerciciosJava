package Ejercicios;

import java.util.Scanner;

public class mostrarNombre {
	public static void main(String[] args) {

		String name;

		Scanner sc = new Scanner(System.in);

		System.out.println("Como te llamas?");

		name = sc.nextLine();

		System.out.println("Buenos dias " + name);

		sc.close();
	}
}
