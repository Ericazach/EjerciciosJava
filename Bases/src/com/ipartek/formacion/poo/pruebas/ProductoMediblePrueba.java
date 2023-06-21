package com.ipartek.formacion.poo.pruebas;

import static com.ipartek.formacion.bibliotecas.Consola.*;

import java.math.BigDecimal;

import com.ipartek.formacion.poo.pojos.Almacen;
import com.ipartek.formacion.poo.pojos.Producto;
import com.ipartek.formacion.poo.pojos.ProductoMedible;

public class ProductoMediblePrueba {

	public static void main(String[] args) {
		ProductoMedible pm = new ProductoMedible();

		pm.setId(1L);
		pm.setNombre("Prueba");
		pm.setPrecio(new BigDecimal("123"));
		pm.setCaducidad(null);

		pm.setAlto(1.2);
		pm.setAncho(2.0);
		pm.setProfundidad(3.0);

//		Producto pack = ProductoMedible.paqueteDosporUno(pm, new Producto());

		mostrarLinea(pm);

		Almacen almacen = new Almacen(1L, "Bilbao", 42.2, -2.9);

		almacen.meter(pm);

		mostrarLinea("Listado");
		for (Producto p : almacen.listado()) {
			mostrarLinea(p.obtenerFicha());

			if (p instanceof ProductoMedible) {
				ProductoMedible prodMed = (ProductoMedible) p;
				mostrarLinea("Area: " + prodMed.getAlto() * prodMed.getAncho() + prodMed.getProfundidad());
			}
		}

		// Siempre es un mismo objeto señalizado de diferentes puntos
		ProductoMedible pm1 = new ProductoMedible();

		pm.setAlto(1.0);
		pm.setAncho(2.0);
		pm.setProfundidad(3.0);

		mostrarLinea("Antes " + pm1);

		Producto producto = pm1;

		if (producto instanceof ProductoMedible pm2) {
			mostrarLinea("Despues " + pm2);
		}

		Producto p = new Producto();
		if (p instanceof ProductoMedible) {
			ProductoMedible pm3 = (ProductoMedible) p;
			mostrarLinea(pm3);
		} else {
			mostrarLineaError("No se puede utilizar como producto medible");
		}

		Producto p1 = new Producto();
		Producto p2 = new Producto();

		mostrarLinea(p1.equals(p2));
	}

	public String toString() {
		return String.format(
				"ProductoMedible [id=%s, nombre=%s, precio=%s, caducidad=%s, alto=%s, ancho=%s, profundidad=%s]");
	}
}
