package EjerciciosTres;

public class Empleado {
	private String dni;
	private String nombre;
	private Double sueldoBase;
	private int horasExtras;
	private Double tipoIRPF;
	private char casado;
	private int hijos;

	private static Double importeHoraExtra;

	// Constructores

	public Empleado() {
	}

	public Empleado(String dni) {
		setDni(dni);
	}

	// Getters y Setters

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(Double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	public int getHorasExtras() {
		return horasExtras;
	}

	public void setHorasExtras(int horasExtras) {
		this.horasExtras = horasExtras;
	}

	public Double getTipoIRPF() {
		return tipoIRPF;
	}

	public void setTipoIRPF(Double tipoIRPF) {
		this.tipoIRPF = tipoIRPF;
	}

	public char getCasado() {
		return casado;
	}

	public void setCasado(char casado) {
		this.casado = casado;
	}

	public int getHijos() {
		return hijos;
	}

	public void setHijos(int hijos) {
		this.hijos = hijos;
	}

	public static Double getImporteHoraExtra() {
		return importeHoraExtra;
	}

	public static void setImporteHoraExtra(Double importeHoraExtra) {
		Empleado.importeHoraExtra = importeHoraExtra;
	}

	// Metodos

	public double calcularHorasExtra() {
		return horasExtras * importeHoraExtra;
	}

	public double agregarHorasExtra() {
		return sueldoBase + calcularHorasExtra();
	}

	public double calcularRetencionIrpf() {
		double tipo = tipoIRPF;
		if (casado == 's' || casado == 'S') {
			tipo = tipo - 2; // 2 puntos menos si está casado
		}
		tipo = tipo - hijos; // un punto menos por cada hijo
		if (tipo < 0) {
			tipo = 0;
		}
		return agregarHorasExtra() * tipo / 100;
	}

	// calcular el importe liquido a cobrar
	public double calcularSueldo() {
		return agregarHorasExtra() - calcularRetencionIrpf();
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\nNif: ");
		sb.append(dni);
		sb.append("\nSueldo Base: ");
		sb.append(sueldoBase);
		sb.append("\nHoras Extras: ");
		sb.append(horasExtras);
		sb.append("\ntipo IRPF: ");
		sb.append(tipoIRPF);
		sb.append("\nCasado: ");
		sb.append(casado);
		sb.append("\nNúmero de Hijos: ");
		sb.append(hijos);
		return sb.toString();
	}

}
