package com.ipartek.formacion.poo.pojos;

import java.util.ArrayList;
import java.util.Objects;

public class Almacen {
	// Variables de Instancia
	private Long id;
	private String name;
	private Double latitud;
	private Double longitud;

	private ArrayList<Producto> productos = new ArrayList<>();

	// Constructores
	public Almacen(Long id, String name, Double latitud, Double longitud) {
		setId(id);
		setName(name);
		setLongitud(longitud);
		setLatitud(latitud);
	}

	// Getters y Setters

	public Long getId() {
		return id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, latitud, longitud, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Almacen other = (Almacen) obj;
		return Objects.equals(id, other.id) && Objects.equals(latitud, other.latitud)
				&& Objects.equals(longitud, other.longitud) && Objects.equals(name, other.name);
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getLatitud() {
		return latitud;
	}

	public void setLatitud(Double latitud) {
		this.latitud = latitud;
	}

	public Double getLongitud() {
		return longitud;
	}

	public void setLongitud(Double longitud) {
		this.longitud = longitud;
	}

	// Metodos espacificos

	public void meter(Producto producto) {
		if (producto == null) {
			throw new RuntimeException("No se admiten productos nulos");
		}
		productos.add(producto);
	}

	public Producto cambiar(Producto producto) {
		for (int i = 0; i < productos.size(); i++) {
			if (productos.get(i).getId() == producto.getId()) {
				productos.set(i, producto);
				return producto;
			}
		}

		return null;
	}

	public Producto sacar(Long id) {
		Producto producto = null;

		for (int i = 0; i < productos.size(); i++) {
			if (productos.get(i).getId() == id) {
				producto = productos.get(i);
				productos.remove(i);
				return producto;
			}
		}

		return null;
	}

	public Producto verPorId(Long id) {
		for (Producto producto : productos) {
			if (producto.getId() == id) {
				return producto;
			}
		}

		return null;
	}

	@SuppressWarnings("unchecked")
	public ArrayList<Producto> listado() {
		return (ArrayList<Producto>) productos.clone();
	}

	// toString

	@Override
	public String toString() {
		return "Almacen [id=" + id + ", name=" + name + ", latitud=" + latitud + ", longitud=" + longitud
				+ ", productos=" + productos + "]";
	}

}
