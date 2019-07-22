package com.sxtsoft.cajondesastre.projectmodel;

public class Usuario {

	private Long codigo;
	private String nombre;
	private String apellido;
	private String apodo;
	private Gender genero;
	private String password;
	
	public Usuario() {
		
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getApodo() {
		return apodo;
	}

	public void setApodo(String apodo) {
		this.apodo = apodo;
	}

	
	public Gender getGenero() {
		return genero;
	}

	public void setGenero(Gender genero) {
		this.genero = genero;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Usuario [codigo=" + codigo + ", nombre=" + nombre + ", apellido=" + apellido + ", apodo=" + apodo + "]";
	}
	
	
}
