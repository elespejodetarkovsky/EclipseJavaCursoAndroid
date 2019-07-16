package com.sxtsoft.cajondesastre.projectmodel;

import java.util.Date;

public class Gasto {
	
	private Long codigo;
	private double importe;
	private Usuario usuario;
	private TipoGasto tipoGasto;
	private Date fecha;
	private String detalle;
	private long longitud;
	private long latitud;
	private Caracteristica caracteristica;
	
	public Gasto() {
		
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public TipoGasto getTipoGasto() {
		return tipoGasto;
	}

	public void setTipoGasto(TipoGasto tipoGasto) {
		this.tipoGasto = tipoGasto;
	}

	public long getLongitud() {
		return longitud;
	}

	public void setLongitud(long longitud) {
		this.longitud = longitud;
	}

	public long getLatitud() {
		return latitud;
	}

	public void setLatitud(long latitud) {
		this.latitud = latitud;
	}

	public Caracteristica getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(Caracteristica caracteristica) {
		this.caracteristica = caracteristica;
	}

	@Override
	public String toString() {
		return "Gasto [codigo=" + codigo + ", importe=" + importe + ", usuario=" + usuario + ", tipoGasto=" + tipoGasto
				+ ", longitud=" + longitud + ", latitud=" + latitud + ", caracteristica=" + caracteristica + "]";
	}


	
	
	
}
