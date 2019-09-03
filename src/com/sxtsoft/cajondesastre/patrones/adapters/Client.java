package com.sxtsoft.cajondesastre.patrones.adapters;

public class Client {

	//private Target target = new Target();
	private Target target = new Adapter();
	
	public static void main(String[] args) {
		
		new Client().target.request();
		
	}
}
