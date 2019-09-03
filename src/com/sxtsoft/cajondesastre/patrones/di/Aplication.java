package com.sxtsoft.cajondesastre.patrones.di;

import com.sxtsoft.cajondesastre.patrones.di.interfaces.ProductoServices;
import com.sxtsoft.cajondesastre.patrones.di.interfaces.impl.ProductoServicesImpC;

public class Aplication {
	
	//private ProductoServices productoServices = new ProductoServicesImpC(4, "fd");
	private ProductoServices productoServices;
	
	
	//inyeccion vía constructor
	//segundo metodo
	public Aplication(ProductoServices productoServices) {
		this.productoServices = productoServices;
	}


	//primera forma de inyectar dependencia
	//cuestión de que alguien coloque la dependencia y deje de ser null
	public void setProductoServices(ProductoServices productoServices) {
		this.productoServices = productoServices;
	}
	
	

//	public static void main(String[] args) {
//		
//		
//		System.out.println("bienvenido a la app");
//		
//		Aplication aplication = new Aplication();
//		
//		int numeroProductos = aplication.productoServices.getAll().size();
//		
//		System.out.println("ya tenemos " + numeroProductos + " productos en el sistema");
//		
//	}
	
}
