package com.sxtsoft.execptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowableGenerator {

	
	public void generate() throws Throwable {
		
		int numeroAleatorio = (int)(Math.random() * 10);
		
		switch (numeroAleatorio) {
		
		case 0: throw new Throwable();
		case 1: throw new Exception();
		case 2: throw new RuntimeException();
		case 3: throw new Error();
		case 4: throw new StackOverflowError();
		case 5: throw new IllegalArgumentException();
		case 6: throw new IOException();
		case 7: throw new IndexOutOfBoundsException();
		case 8: throw new ArrayIndexOutOfBoundsException();
		case 9: throw new FileNotFoundException();
		default: throw new ArithmeticException();
		
		}
	}
	
	
}
