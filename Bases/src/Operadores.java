
public class Operadores {
	public static void main(String[] args) {
		System.out.println(5 + 1 + 2);
		System.out.println(Math.pow(5, 2));

		int x = 5;

		System.out.println(x == 5);
		System.out.println(x != 5);

		System.out.println(1 <= x && x <= 10);

		int a, b, c;

		a = b = c = 1;

		c = a > b ? a : b;

		System.out.println(c);

		boolean arrancando = true;

		System.out.println(arrancando ? "Arrancado" : "Parado");
		
		System.out.println((int) (Math.random() * 6.0) + 1);
	}
}
