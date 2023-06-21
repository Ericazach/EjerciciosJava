package com.ipartek.formacion.poo.pruebas;

import static com.ipartek.formacion.bibliotecas.Consola.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;

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

		mostrarProducto(pack);
//		
//		System.out.println(pack);

		ejemploAlmacen(manzana);

	}

	private static void ejemploAlmacen(Producto product) {
		ArrayList<Producto> almacen = new ArrayList<>();

		almacen.add(product);

		Producto manzana2 = new Producto(product);

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

		pedirId(p);

		pedirNombre(p);

		pedirPrecio(p);

		pedirCaducidad(p);

		return p;
	}

	private static void pedirCaducidad(Producto p) {
		boolean equivocado = true;

		do {
			try {
				p.setCaducidad(leerLocalDate("Caducidad"));
				equivocado = false;
			} catch (Exception e) {
				mostrarLineaError(e.getMessage());
			}
		} while (equivocado);
	}

	private static void pedirPrecio(Producto p) {
		boolean equivocado = true;

		do {
			try {
				p.setPrecio(leerBigDecimal("Precio"));
				equivocado = false;
			} catch (Exception e) {
				mostrarLineaError(e.getMessage());
			}
		} while (equivocado);
	}

	private static void pedirNombre(Producto p) {
		boolean equivocado = true;

		do {
			try {
				p.setNombre(leerLinea("Nombre"));
				equivocado = false;
			} catch (Exception e) {
				mostrarLineaError(e.getMessage());
			}
		} while (equivocado);
	}

	private static void pedirId(Producto p) {
		boolean equivocado = true;
		do {

			try {
				p.setId(leerLong("Id"));
				equivocado = false;
			} catch (Exception e) {
				mostrarLineaError(e.getMessage());
			}
		} while (equivocado);
	}
}
