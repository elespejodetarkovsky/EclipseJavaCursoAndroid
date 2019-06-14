package com.sxtsoft.cajondesastre.clasesanonimas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestClass {

	public static void main(String[] args) {
		
		List<Producto> productos = new ArrayList<>();
				
		productos.add(new Producto(100,"A",12.0));
		productos.add(new Producto(200,"B",19.0));
		productos.add(new Producto(300,"H",11.0));
		productos.add(new Producto(300,"Z",10.0));
		productos.add(new Producto(10,"N",15.0));
		productos.add(new Producto(14,"M",1.0));
		productos.add(new Producto(11,"G",9.0));
		
		System.out.println(productos);
		
		//Me interesa reorganizar el array en base
		//a un criterio de ordenacion
		
		Collections.sort(productos, new ProductoComparatorNombre());
		
		System.out.println(productos);
		
		Collections.sort(productos, new ProductoComparatorCodigo());
		
		System.out.println(productos);
		
		
		//Ahora usaremos un comparator que 
		//NO TENEMOS!!
		
		Collections.sort(productos, new Comparator<Producto>() {

			@Override
			public int compare(Producto p1, Producto p2) {
				
				if (p1.getPrecio() == p2.getPrecio()) {
					return p1.getCodigo() - p2.getCodigo();
				} else {
					// Utilizo Duoble porque Double IS-A comparable...
					Double precio1 = p1.getPrecio();
					Double precio2 = p2.getPrecio();
					return precio1.compareTo(precio2);
				}
			}
			
		});
		
		System.out.println(productos);
		
	}
	

}
