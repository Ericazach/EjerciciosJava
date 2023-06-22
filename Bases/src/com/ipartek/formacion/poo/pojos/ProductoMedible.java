package com.ipartek.formacion.poo.pojos;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

public class ProductoMedible extends Producto {
	private Double alto;
	private Double ancho;
	private Double profundidad;

	public ProductoMedible(Long id, String nombre, BigDecimal precio, LocalDate caducidad, Double alto, Double ancho,
			Double profundidad) {
		super(id, nombre, precio, caducidad);
		setAlto(alto);
		setAncho(ancho);
		setProfundidad(profundidad);
	}

	public ProductoMedible() {
	}

	public Double getAlto() {
		return alto;
	}

	public void setAlto(Double alto) {
		this.alto = alto;
	}

	public Double getAncho() {
		return ancho;
	}

	public void setAncho(Double ancho) {
		this.ancho = ancho;
	}

	public Double getProfundidad() {
		return profundidad;
	}

	public void setProfundidad(Double profundidad) {
		this.profundidad = profundidad;
	}

	@Override
	public String obtenerFicha() {
		String ficha = super.obtenerFicha();
		ficha += "Alto: " + alto + "\nAncho: " + ancho + "\nProf: " + profundidad + "\n";
		return ficha;
	}

	@Override
	public String toString() {
		return String.format(
				"ProductoMedible [id=%s, nombre=%s, precio=%s, caducidad=%s, alto=%s, ancho=%s, profundidad=%s]",
				getId(), getNombre(), getPrecio(), getCaducidad(), alto, ancho, profundidad);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(alto, ancho, profundidad);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductoMedible other = (ProductoMedible) obj;
		return Objects.equals(alto, other.alto) && Objects.equals(ancho, other.ancho)
				&& Objects.equals(profundidad, other.profundidad);
	}

}
