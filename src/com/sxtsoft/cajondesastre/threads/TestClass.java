package com.sxtsoft.cajondesastre.threads;

public class TestClass {
	
	public static void main(String[] args) {
		
		String nombreThread = Thread.currentThread().getName();
		
		System.out.println("Thread: " + nombreThread);
		
		//Vamos a crear un hilo de ejecución
		
		Thread t1  = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				
				for (int i = 0; i <=100; i++) {
					System.out.println(Thread.currentThread().getName() + ": " + i);
				}
			}
			
		});
		
		t1.setPriority(10);
		t1.start();
		
		for (int i = 0; i <=100; i++) {
			System.out.println("main: " + i);
		}
	}

}
