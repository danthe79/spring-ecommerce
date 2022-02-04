package com.curso.ecommerce.model;

public class producto {
	
	private Integer id;
	private String nombre;
	private String descripción;
	private String imagen;
	private Double precio;
	private int cantidad;
	
	public producto() {
		// TODO Auto-generated constructor stub
	}

	public producto(Integer id, String nombre, String descripción, String imagen, Double precio, int cantidad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripción = descripción;
		this.imagen = imagen;
		this.precio = precio;
		this.cantidad = cantidad;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripción() {
		return descripción;
	}

	public void setDescripción(String descripción) {
		this.descripción = descripción;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "producto [id=" + id + ", nombre=" + nombre + ", descripción=" + descripción + ", imagen=" + imagen
				+ ", precio=" + precio + ", cantidad=" + cantidad + "]";
	}
	
	

}
