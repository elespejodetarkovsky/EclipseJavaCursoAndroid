package com.sxtsoft.cajondesastre.calculadora;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraImplTest {

	//necesitamos una variable de instancia que contenga la calculadora
	
	private Calculadora calculadora = new CalculadoraImpl();
	
	//implementamos los 4 métodos de test que testean los
	//cuatro metodos de la calculadora
	
	@Test
	public void sumar() {
		
		double resultado = calculadora.sumar(2, 2);
		
		assertEquals(4.0, resultado, 0.1); //el ultimo parámetro es un delta un margen de error
											//ya que double no es exacto
		
		
	}
	
	@Test
	public void restar() {
		
		double resultado = calculadora.restar(4.3, 5.3);
		
		assertEquals(-1.0, resultado, 0.0001); //el ultimo parámetro es un delta un margen de error
											//ya que double no es exacto
		
		resultado = calculadora.restar(-5.0, -7.0);
		assertEquals(2.0, resultado,0001);
		
		
	}
	
	@Test
	public void multiplicar() {
		
		double resultado = calculadora.multiplicar(2.0, 2.0);
		
		assertEquals(4.0, resultado, 0.0001); 
		
		resultado = calculadora.multiplicar(-6.0, 5.0);
		assertEquals(-30, resultado,0000001);
		
	}
	
	@Test
	public void dividir() {
		
		double resultado = calculadora.dividir(10.0, 5.0);
		
		assertEquals(2, resultado, 0.0001); //el ultimo parámetro es un delta un margen de error
											//ya que double no es exacto
		
		resultado = calculadora.dividir(-3.0, 2.0);
		assertEquals(-1.5, resultado, 0.00001);
		
		resultado = calculadora.dividir(100.0, 0.0);
		assertEquals(Double.POSITIVE_INFINITY,resultado, 0.001);
		
		resultado = calculadora.dividir(0.0, 0.0);
		assertEquals(Double.NaN,resultado, 0.001);
		
	}
}
