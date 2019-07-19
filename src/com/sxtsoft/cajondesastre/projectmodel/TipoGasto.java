package com.sxtsoft.cajondesastre.projectmodel;

import java.util.Date;

public class TipoGasto {

	private Long codigo;
	private String nombre;
	private Categoria categoria;
	
	public TipoGasto () {
		
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


	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "TipoGasto [codigo=" + codigo + ", nombre=" + nombre + ", categoria=" + categoria + "]";
	}



	
	
}
