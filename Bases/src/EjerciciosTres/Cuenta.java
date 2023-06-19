package EjerciciosTres;

public class Cuenta {
	private String nombre;
	private String numeroCuenta;
	private double tipoInteres;
	private double saldo;

	public Cuenta(String nombre, String numeroCuenta, double tipoInteres, double saldo) {
		super();
		this.nombre = nombre;
		this.numeroCuenta = numeroCuenta;
		this.tipoInteres = tipoInteres;
		this.saldo = saldo;
	}

	public Cuenta() {
	}

	public Cuenta(Cuenta cuenta) {
		this(cuenta.getNombre(), cuenta.getNumeroCuenta(), cuenta.getTipoInteres(), cuenta.getSaldo());
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public double getTipoInteres() {
		return tipoInteres;
	}

	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean ingreso(double cantidad) {
		boolean ingresoCorrecto = true;
		if (cantidad > 0) {
			saldo = saldo + cantidad;
		} else {
			ingresoCorrecto = false;
		}
		
		return ingresoCorrecto;
	}

	public boolean descuento(double cantidad) {
		boolean descuentoCorrecto = true;
		if (saldo >= 0) {
			saldo = saldo - cantidad;
		} else if (cantidad < 0) {
			descuentoCorrecto = false;
		} else {
			descuentoCorrecto = false;
		}

		return descuentoCorrecto;
	}

	public boolean transferencia(Cuenta cuentaDestino, double monto) {
		boolean transferenciaCorrecta = true;
		if (monto < 0) {
			transferenciaCorrecta = false;
		} else if (saldo >= 0) {
			descuento(monto);
			cuentaDestino.ingreso(monto);
		} else {
			transferenciaCorrecta = false;
		}
		
		return transferenciaCorrecta;
	}
}
