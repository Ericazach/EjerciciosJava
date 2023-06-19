package com.ipartek.formacion.poo.pruebas;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;

import static com.ipartek.formacion.bibliotecas.Consola.*;
import com.ipartek.formacion.poo.pojos.Producto;

public class ProductoPrueba {

	public static void main(String[] args) {

		Producto manzana = new Producto();

		manzana.setId(5L);
		manzana.setNombre("Manzanas");
		manzana.setPrecio(new BigDecimal("1.23"));
		manzana.setCaducidad(LocalDate.of(2024, 1, 2));

		Producto naranja = new Producto(1L, "Naranjas", new BigDecimal("2.13"), LocalDate.of(2024, 12, 12));

//		mostrarProducto(manzana);
//		mostrarProducto(naranja);

		Producto pack = Producto.paqueteDosporUno(manzana, naranja);

//		mostrarProducto(pack);
//		
//		System.out.println(pack);

		ArrayList<Producto> almacen = new ArrayList<>();

		almacen.add(naranja);
		almacen.add(manzana);
		almacen.add(pack);

		Producto manzana2 = new Producto(manzana);

		almacen.add(manzana2);

		boolean seguir;

		do {
			Producto p = pedirProducto();
			almacen.add(p);
			seguir = leerBoolean("Otro Producto?");
		} while (seguir);

		mostrarLinea("INFORME DE ALMACEN");

		for (Producto producto : almacen) {
//			mostrarLinea(product);
			mostrarProducto(producto);
		}

	}

	private static void mostrarProducto(Producto p) {
		System.out.println(p.obtenerFicha());
	}

	private static Producto pedirProducto() {
		Producto p = new Producto();

		p.setId(leerLong("Id"));
		p.setNombre(leerLinea("Nombre"));
		p.setPrecio(leerBigDecimal("Precio"));
		p.setCaducidad(leerLocalDate("Caducidad"));

		return p;
	}
}
