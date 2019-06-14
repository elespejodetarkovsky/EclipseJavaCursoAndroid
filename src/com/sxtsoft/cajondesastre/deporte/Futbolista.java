package com.sxtsoft.cajondesastre.deporte;

public class Futbolista implements Deportista {

	@Override
	public void entrenar() {
		System.out.println("me levanto a las 10 y hago 4 rondos...");
	}

	public void hacerTeatro() {
		System.out.println("futbolista haciendo teatro...");
	}

	@Override
	public void competir() {
		System.out.println("futbolista compitiendo");
	}
}
