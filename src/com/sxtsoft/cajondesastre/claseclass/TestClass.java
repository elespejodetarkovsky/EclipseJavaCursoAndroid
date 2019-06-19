package com.sxtsoft.cajondesastre.claseclass;

import java.lang.reflect.Constructor;

public class TestClass {

	public static void main(String[] args) {
		
		Class clase = PatitoGoma.class;
	
	
	Constructor[] constructores = clase.getConstructors();
	
	for (Constructor constructor: constructores) {
		Class[] tipos = constructor.getParameterTypes();
		for(Class tipo: tipos) {
			System.out.println(tipo);
		}
	}
	
	}
	
	
	
	
}
