package com.sxtsoft.cajondesastre.calculadora;

public class CalculadoraImpl implements Calculadora{

	@Override
	public double sumar(double opt1, double opt2) {
		
		return opt1 + opt2;
	}

	@Override
	public double restar(double opt1, double opt2) {
		
		return opt1 - opt2;
	}

	@Override
	public double multiplicar(double opt1, double opt2) {
		
		return opt1 * opt2;
	}

	@Override
	public double dividir(double opt1, double opt2) {
		
		return opt1 / opt2;
	}

}
