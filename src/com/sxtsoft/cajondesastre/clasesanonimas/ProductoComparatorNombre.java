package com.sxtsoft.cajondesastre.clasesanonimas;

import java.util.Comparator;

public class ProductoComparatorNombre implements Comparator<Producto>{

	@Override
	public int compare(Producto p0, Producto p1) {
		
		return p0.getNombre().compareTo(p1.getNombre());

	}
}
