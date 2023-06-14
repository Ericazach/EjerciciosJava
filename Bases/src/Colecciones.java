import java.util.ArrayList;

public class Colecciones {
	public static void main(String[] args) {
		ArrayList<String> textos = new ArrayList<>();

		textos.add("Uno");
		textos.add("Dos");
		textos.add("Tres");

		for (String texto : textos) {
			System.out.println(texto);
		}
	}
}
