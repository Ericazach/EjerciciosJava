import java.util.Date;
import java.util.Scanner;

public class Conversiones {
	public static void main(String[] args) {
		String numeroTexto = "123";

		System.out.println(numeroTexto + 4);

		int numero = Integer.parseInt(numeroTexto);

		System.out.println(numero + 4);

		Scanner sc = new Scanner(System.in);

		System.out.println("Te gusta?");

		String boolTexto = sc.nextLine();

		boolean bool = "S".equalsIgnoreCase(boolTexto.trim().substring(0, 1));

		System.out.println(bool);

		sc.close();

		String boolOtroTexto = String.valueOf(bool);
		
		System.out.println(boolOtroTexto);
		
		Date fecha = new Date();
		String fechaTexto = fecha.toString();
		
		System.out.println(fechaTexto);
	}
}
