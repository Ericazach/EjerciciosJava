package EjerciciosDos;

public class Empleado {
	private String nombre;

	public Empleado() {
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Empleado(String nombre) {
		setNombre(nombre);
	}

	@Override
	public String toString() {
		return "Empleado " + nombre;
	}

}
