package com.sxtsoft.cajondesastre.numberformatertest;

import java.util.HashMap;
import java.util.Map;

public class NumberFormatterImpl implements NumberFormatter {
	
	private static final Map<Integer,String> UNIDADES;
	private static final Map<Integer,String> DECENAS;
	private static final Map<Integer,String> CENTENAS;
	private static final Map<Integer,String> EXCEPCIONES;
	
	static {
		
		UNIDADES = new HashMap<>();
		DECENAS = new HashMap<>();
		CENTENAS = new HashMap<>();
		EXCEPCIONES = new HashMap<>();
		
		UNIDADES.put(0, "");
		UNIDADES.put(1, "uno");
		UNIDADES.put(2, "dos");
		UNIDADES.put(3, "tres");
		UNIDADES.put(4, "cuatro");
		UNIDADES.put(5, "cinco");
		UNIDADES.put(6, "seis");
		UNIDADES.put(7, "siete");
		UNIDADES.put(8, "ocho");
		UNIDADES.put(9, "nueve");
	
		DECENAS.put(0,"");
		DECENAS.put(3,"treinta");
		DECENAS.put(4,"cuarenta");
		DECENAS.put(5,"cincuenta");
		DECENAS.put(6,"sesenta");
		DECENAS.put(7,"setenta");
		DECENAS.put(8,"ochenta");
		DECENAS.put(9,"noventa");
		
		CENTENAS.put(0,"");
		CENTENAS.put(1,"ciento");
		CENTENAS.put(2,"doscientos");
		CENTENAS.put(3,"trescientos");
		CENTENAS.put(4,"cuatrocientos");
		CENTENAS.put(5,"quinientos");
		CENTENAS.put(6,"seiscientos");
		CENTENAS.put(7,"setecientos");
		CENTENAS.put(8,"ochocientos");
		CENTENAS.put(9,"novecientos");
		
		EXCEPCIONES.put(10,"diez");
		EXCEPCIONES.put(11,"once");
		EXCEPCIONES.put(12,"doce");
		EXCEPCIONES.put(13,"trece");
		EXCEPCIONES.put(14,"catorce");
		EXCEPCIONES.put(15,"quince");
		EXCEPCIONES.put(16,"dieciseis");
		EXCEPCIONES.put(17,"diecisiete");
		EXCEPCIONES.put(18,"dieciocho");
		EXCEPCIONES.put(19,"diecinueve");
		EXCEPCIONES.put(20,"veinte");
		EXCEPCIONES.put(21,"veintiuno");
		EXCEPCIONES.put(22,"veintidós");
		EXCEPCIONES.put(23,"veintitrés");
		EXCEPCIONES.put(24,"veinticuatro");
		EXCEPCIONES.put(25,"veinticinco");
		EXCEPCIONES.put(26,"veintiseis");
		EXCEPCIONES.put(27,"veintisiete");
		EXCEPCIONES.put(28,"veintiocho");
		EXCEPCIONES.put(29,"veintinueve");
			
	}
	
	public String convert(int numero) {

		if (numero < 0 || numero > 999){
			throw new IllegalArgumentException("número fuera de rango");
		}

		if (numero == 100) {
			return "cien";
		}
		
		if (numero == 0) {
			return "cero";
		}
		
		int c = numero / 100;
		int d = numero / 10 % 10;
		int u = numero % 10;
		
		String resultado = "";
		
		int du = d * 10 + u;
		
		if(du >= 10 && du < 30) {
			resultado = EXCEPCIONES.get(du);
		} else {
			String conjuncion = (d == 0 || u == 0) ? "" : " y ";
			
			resultado = DECENAS.get(d) + conjuncion + UNIDADES.get(u);
		}
		
		resultado = CENTENAS.get(c) + " " + resultado;
		
		return resultado.trim();

	}


}