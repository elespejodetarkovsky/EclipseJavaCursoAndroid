package com.sxtsoft.cajondesastre.deporte;

public class TestClass {

	public static void main(String[] args) {
		
		Deportista d1 = new Deportista() {
			
			//clase anónima
			//se implementa por cogones
			 
			@Override
			public void entrenar() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void competir() {
				// TODO Auto-generated method stub
				
			}
			
		};
		
		d1.entrenar();
		d1.competir();
		
		Deportista d2 = new Ciclista();
		d2.entrenar();
		d2.competir();
		
		System.out.println("***************************");
		
		Deportista d3 = new Futbolista();
		
		d3.entrenar();
		d3.competir();
		//d3.hacerTeatro no se encuentra pues se definió como Deportista
		
		
		System.out.println("\n\n *******");
		
		Deportista[] deportistas = {d2, d3};
		
		for (Deportista deportista: deportistas) {
			deportista.competir();
			System.out.println("Hola");
		}
	}

}
