package com.sxtsoft.cajondesastre.deporte;

public class Ciclista implements Deportista{

	@Override
	public void entrenar() {
		
		System.out.println("ciclista levantándose a las 5 de la mañana");
				
	}

	@Override
	public void competir() {
		System.out.println("ciclista compitiendo");
		
	}
		
		
}
