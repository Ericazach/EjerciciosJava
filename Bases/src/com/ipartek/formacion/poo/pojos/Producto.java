package com.ipartek.formacion.poo.pojos;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Producto {
	private Long id;
	private String nombre;
	private BigDecimal precio;
	private LocalDate caducidad;
	
	//Source - generate Constructor
	
	public Producto(Long id, String nombre, BigDecimal precio, LocalDate caducidad) {
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.caducidad = caducidad;
	}
	
	public Producto (Producto producto) {
		this(producto.getId(), producto.getNombre(), producto.getPrecio(), producto.getCaducidad());
		
	}
	
	public Producto() {
		
	}
	
	// Source generate Getter y Setter
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public BigDecimal getPrecio() {
		return precio;
	}
	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}
	public LocalDate getCaducidad() {
		return caducidad;
	}
	public void setCaducidad(LocalDate caducidad) {
		this.caducidad = caducidad;
	}
	
	// Metodos de instancia
	
	public static Producto paqueteDosporUno(Producto p1, Producto p2) {
		Producto producto = new Producto();
		
		producto.setNombre("2x1: " + p1.getNombre() + " y " + p2.getNombre());
		producto.setPrecio(p1.getPrecio().max(p2.getPrecio()));
		
		LocalDate caducidad1 = p1.getCaducidad();
		LocalDate caducidad2 = p2.getCaducidad();
		
		LocalDate caducidad = caducidad1.compareTo(caducidad2) < 0 ? caducidad1 : caducidad2;
		
		producto.setCaducidad(caducidad);
		
		return producto;
	}
	
	// Metodos de instancia
	
	public String obtenerFicha() {
		String ficha = "\nId: " + id +
				"\nNombre: " + nombre +
				"\nPrecio: " + precio +
				"\nCaducidad: " + caducidad;
		
		return ficha;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", caducidad=" + caducidad + "]";
	}
	
	

}
