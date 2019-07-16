package com.sxtsoft.cajondesastre.projectmodel;

public class Gasto {
	
	private Long codigo;
	private Categoria categoria;
	private double importe;
	private Usuario usuario;
	private long longitud;
	private long latitud;
	
	public Gasto() {
		
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
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

	@Override
	public String toString() {
		return "Gasto [codigo=" + codigo + ", categoria=" + categoria + ", importe=" + importe + ", usuario=" + usuario
				+ ", longitud=" + longitud + ", latitud=" + latitud + "]";
	}
	
	
	
}
