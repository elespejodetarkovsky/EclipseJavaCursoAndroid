package com.sxtsoft.cajondesastre.threads;

public class TestMultiplesHilos {

	public static void main(String[] args) {
		
		Thread t1 = new Thread (new MyRunnable());
		Thread t2 = new Thread (new MyRunnable());
		Thread t3 = new Thread (new MyRunnable());
		
		//los tres están en estado NEW
		
		t1.setName("Pepin");
		t2.setName("honorio");
		t3.setName("Carlota");
		
		t1.start();
		t2.start();
		t3.start();
		
		//Aquí manda el Scheduler...y los hilos competirn por la cpu
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}  
		
		System.out.println("Thread main se ha levantao...");
	}

}
