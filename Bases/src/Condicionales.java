import java.util.Scanner;

public class Condicionales {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Dime tu nombre ");

		String nombre = sc.nextLine();

//		if ("Erica".equals(nombre)) {
//			System.out.println("Hola alumno");
//		} else if ("Yeray".equals(nombre)) {
//			System.out.println("Hola antiguo alumno");
//		} else {
//			System.out.println("Hola " + nombre);
//		}

//		System.out.println("Hasta la proxima");

		switch (nombre) {
		case "Erica":
			System.out.println("Hola Erica");	
			break;
		case "Yerai":
			System.out.println("Hola antiguo alumno");
			break;
		default:
			System.out.println("Hola " + nombre);
		}
		
		System.out.println("Hasta la proxima");
		
		sc.close();
	}
}
