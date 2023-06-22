package EjerciciosTres;

public class Fecha {
	private Integer dia;
	private Integer mes;
	private Integer año;

	// Constructores

	public Fecha() {
	}

	public Fecha(Integer dia, Integer mes, Integer año) {
		setDia(dia);
		setMes(mes);
		setAño(año);
	}

	// Setters y Getters

	public Integer getDia() {
		return dia;
	}

	public void setDia(Integer dia) {
		this.dia = dia;
	}

	public Integer getMes() {
		return mes;
	}

	public void setMes(Integer mes) {
		this.mes = mes;
	}

	public Integer getAño() {
		return año;
	}

	public void setAño(Integer año) {
		this.año = año;
	}

	// Metodos

	public boolean fechaCorrecta(Fecha fecha) {
		boolean date = false;

		int length = String.valueOf(fecha.getAño()).length();

		if ((fecha.getDia() <= 31 && fecha.getDia() >= 1) && (fecha.getMes() <= 12 && fecha.getMes() >= 1)
				&& (length == 4 && fecha.getAño() <= 2023)) {
			date = true;
		}
		return date;
	}

	@SuppressWarnings("unused")
	private boolean esBisiesto(Integer año) {
		boolean bisiesto = false;

		if (año % 4 == 0 && año % 100 != 0 || año % 400 == 0) {
			bisiesto = true;
		}
		return bisiesto;
	}

	public void diaSiguiente(Fecha fecha) {

		int nuevoDia = fecha.getDia() + 1;
		int nuevoMes = fecha.getMes();

		if (nuevoDia >= 32) {
			nuevoDia = 1;
			nuevoMes = fecha.getMes() + 1;
			fecha.setMes(nuevoMes);
			if (nuevoMes >= 13) {
				nuevoMes = 1;
				fecha.setMes(nuevoMes);
				int nuevoAño = fecha.getAño() + 1;
				fecha.setAño(nuevoAño);
			}
		}

		fecha.setDia(nuevoDia);

		fechaCorrecta(fecha);
	}

	@Override
	public String toString() {
		return "Fecha: " + dia + "-" + mes + "-" + año;
	}

}
