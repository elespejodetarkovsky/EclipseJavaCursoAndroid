package com.sxtsoft.cajondesastre.interfaceserio;

public class FormularioAltaProducto {

	private ProductServices productService = new ProductServicesEquipoA();
	
	//pero podría probar esta otra implementación
	//private ProductServices productService = new ProductServicesEquipoB();
	public void m1() {
		
		Product p = new Product();
		Product createdProduct = productService.create(p);
		
		System.out.println("se ha creado el producto" + createdProduct);
	}
}
