package com.sxtsoft.cajondesastre.numberformatertest;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumberFortmatterTest {

	//necesitamos la clase a probar...
	
	private NumberFormatter numberFormatter = new NumberFormatterImpl();
	
	@Test
	public void convert() {
		
		String resultado = numberFormatter.convert(980);
		assertEquals("novecientos ochenta", resultado);
		
		resultado = numberFormatter.convert(50);
		assertEquals("cincuenta", resultado);
		
		resultado = numberFormatter.convert(0);
		assertEquals("cero", resultado);
		
		resultado = numberFormatter.convert(11);
		assertEquals("once", resultado);
		
		resultado = numberFormatter.convert(12);
		assertEquals("doce", resultado);
		
		resultado = numberFormatter.convert(15);
		assertEquals("quince", resultado);
		
		resultado = numberFormatter.convert(900);
		assertEquals("novecientos", resultado);
		
		resultado = numberFormatter.convert(999);
		assertEquals("novecientos noventa y nueve", resultado);
		
		resultado = numberFormatter.convert(800);
		assertEquals("ochocientos", resultado);
		
		resultado = numberFormatter.convert(700);
		assertEquals("setecientos", resultado);
		
		resultado = numberFormatter.convert(750);
		assertEquals("setecientos cincuenta", resultado);
		
		resultado = numberFormatter.convert(600);
		assertEquals("seiscientos", resultado);
		
		resultado = numberFormatter.convert(500);
		assertEquals("quinientos", resultado);
		
		resultado = numberFormatter.convert(400);
		assertEquals("cuatrocientos", resultado);
		
		resultado = numberFormatter.convert(300);
		assertEquals("trescientos", resultado);
		
		resultado = numberFormatter.convert(200);
		assertEquals("doscientos", resultado);
		
		resultado = numberFormatter.convert(100);
		assertEquals("cien", resultado);
		
		resultado = numberFormatter.convert(149);
		assertEquals("ciento cuarenta y nueve", resultado);
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void convertException() {
		
		numberFormatter.convert(-200);
	}
	
//	@Test(expected = IllegalArgumentException.class)
//	public void convertExceptionPositivos() {
//		
//		numberFormatter.convert(10);
//	}

}
