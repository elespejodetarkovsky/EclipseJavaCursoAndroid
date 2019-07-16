package com.sxtsoft.cajondesastre.projectmodel;

import java.util.Date;

public class TipoGasto extends Gasto{

	private Long codigo;
	private String nombre;
	private Date fecha;
	private String detalle;
	private Caracteristica caracteristica;
	
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

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public Caracteristica getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(Caracteristica caracteristica) {
		this.caracteristica = caracteristica;
	}

	@Override
	public String toString() {
		return "TipoGasto [codigo=" + codigo + ", nombre=" + nombre + ", fecha=" + fecha + ", detalle=" + detalle
				+ ", caracteristica=" + caracteristica + "]";
	}


	
	
	
}
