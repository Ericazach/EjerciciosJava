import java.math.BigDecimal;
import java.math.MathContext;

public class Funciones {
	public static void main(String[] args) {
		System.out.println(sumar(5, 10));

		double a = 4, b = -5, c = -6;

		double[] resultados = ecuacionCuadratica(a, b, c);

		BigDecimal abd = new BigDecimal("4");
		BigDecimal bbd = new BigDecimal("-5");
		BigDecimal cbd = new BigDecimal("-20");

		BigDecimal[] rbd = ecuacionCuadratica(abd, bbd, cbd);

		System.out.println(rbd[0]);
		System.out.println(rbd[1]);
		System.out.println(rbd[2]);

		System.out.println(resultados[0]);
		System.out.println(resultados[1]);

		System.out.println(verificarEcuacion(a, b, c, resultados[0]));
		System.out.println(verificarEcuacion(a, b, c, resultados[1]));
	}

	static double sumar(double x, double y) {
		return x + y;
	}

	static double[] ecuacionCuadratica(double a, double b, double c) {
		double x1 = 0.0, x2 = 0.0;
		double[] resultado = new double[2];

		double raiz = Math.sqrt(Math.pow(b, 2) - 4 * a * c);
		double denominador = 2 * a;

		x1 = (-b + raiz) / denominador;
		x2 = (-b - raiz) / denominador;

		resultado[0] = x1;
		resultado[1] = x2;

		return resultado;
	}

	static boolean verificarEcuacion(double a, double b, double c, double x) {
		double ecuacion = a * x * x + b * x + c;

		System.out.println(ecuacion);
		return ecuacion == 0;
	}

	static BigDecimal[] ecuacionCuadratica(BigDecimal a, BigDecimal b, BigDecimal c) {
		BigDecimal x1 = BigDecimal.ZERO, x2 = BigDecimal.ZERO;
		BigDecimal[] resultado = new BigDecimal[2];
		BigDecimal raiz = b.multiply(b).subtract(new BigDecimal("4").multiply(a).multiply(c).sqrt(MathContext.DECIMAL128));
		BigDecimal denominador = new BigDecimal("2").multiply(a);

		x1 = ((b.negate().add(raiz)).divide(denominador));
		x2 = ((b.negate().subtract(raiz)).divide(denominador));

		resultado[0] = x1;
		resultado[1] = x2;

		return resultado;
	}
}
