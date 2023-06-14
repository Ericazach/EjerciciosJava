import java.util.Scanner;

public class HolaMundo {
	public static void main(String[] args) {
		System.out.println("Hola");

		int a = 5;
		int b = 6;

		double d = 12.6, e = 54.3;
		float f = 12.43f;

		boolean bool = true;

		char c = 'e';

		System.out.println(a);
		System.out.println(b);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(c);
		System.out.println(bool);

		String name = "Erica";

		Scanner s = new Scanner(System.in);

		System.out.println("DIME TU NOMBRE");

		name = s.nextLine();

		System.out.println("Hola " + name);

		System.out.print("Dame a: ");

		a = s.nextInt();

		System.out.print("Dame b: ");

		b = s.nextInt();

		int suma = a + b;

		System.out.println("a + b = " + suma);
		
		s.close();

	}
}
