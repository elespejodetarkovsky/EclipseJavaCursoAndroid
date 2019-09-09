package com.sxtsoft.cajondesastre.threads;

public class MyRunnable implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		String nombre = Thread.currentThread().getName();
		
		for (int i = 0; i < 100 ; i++) {
			System.out.println(nombre + ": " + i);
		}
		
		
	}
	

}
