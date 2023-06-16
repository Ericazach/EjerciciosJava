import java.math.BigInteger;

public class Recursividad {
	public static void main(String[] args) {
		int i = Integer.MAX_VALUE;

		System.out.println(i);
		System.out.println(i + 1);

		System.out.println(factorial(new BigInteger("1000")).toString().length());
		System.out.println(factorialIterativo(new BigInteger("1000")).toString().length());
	}

	private static BigInteger factorial(BigInteger numero) {
		if (numero.compareTo(BigInteger.ONE) == 0) {
			return BigInteger.ONE;
		}
		return numero.multiply(factorial(numero.subtract(BigInteger.ONE))); // llamando la funcion por dentro
	}

	private static BigInteger factorialIterativo(BigInteger numero) {
		BigInteger total = BigInteger.ONE;

		for (BigInteger c = BigInteger.ONE; c.compareTo(numero) <= 0; c.add(BigInteger.ONE)) {
			total = total.multiply(c);
		}

		return total;
	}
}
