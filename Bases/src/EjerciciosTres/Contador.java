package EjerciciosTres;

public class Contador {
	private int cont;

	public Contador() {

	}

	public Contador(int cont) {
		if (cont < 0) {
			this.cont = 0;
		} else {
			this.cont = cont;
		}

	}

	public Contador(Contador contador) {
		this(contador.getCont());
	}

	public int getCont() {
		return cont;
	}

	public void setCont(int cont) {
		if (cont < 0) {
			this.cont = 0;
		} else {
			this.cont = cont;
		}
	}

	public void incremento() {
		cont++;
	}

	public void decremento() {
		cont--;
		if (cont < 0) {
			cont = 0;
		}
	}
}
