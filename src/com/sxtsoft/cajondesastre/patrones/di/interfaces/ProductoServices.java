package com.sxtsoft.cajondesastre.patrones.di.interfaces;

import java.util.List;

import com.sxtsoft.cajondesastre.clasesanonimas.Producto;

public interface ProductoServices {
	
	public Producto read(int codigo);
	public List<Producto> getAll();
	

}
