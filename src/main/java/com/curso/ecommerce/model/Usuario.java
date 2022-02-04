package com.curso.ecommerce.model;

public class Usuario {
	
	private Integer id;
	private String nombres;
	private String apellidos;
	private String username;
	private String email;
	private String direccion;
	private String telefono;
	private String password;
	
	
	
	public Usuario(Integer id, String nombres, String apellidos, String username, String email, String direccion,
			String telefono, String password) {
		super();
		this.id = id;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.username = username;
		this.email = email;
		this.direccion = direccion;
		this.telefono = telefono;
		this.password = password;
	}
	
	public Usuario() {
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
