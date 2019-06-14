package com.sxtsoft.cajondesastre.clasesanonimas;

import java.util.Comparator;

public class ProductoComparatorCodigo implements Comparator<Producto> {

	@Override
	public int compare(Producto p1, Producto p2) {
		
		return p1.getCodigo() - p2.getCodigo();
	}

}
