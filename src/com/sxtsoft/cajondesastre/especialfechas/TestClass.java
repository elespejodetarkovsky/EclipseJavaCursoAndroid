package com.sxtsoft.cajondesastre.especialfechas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestClass {

	public static void main(String[] args) throws ParseException {
		
		String strFecha = "2900/12/2002";
		
		Date fecha1 = new Date();
		Date fecha2 = new Date(0);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm");
		
		Date fecha3 = sdf.parse(strFecha);
		
		
		System.out.println(fecha3);
		
		String strParteFecha = sdf.format(fecha1);
		String strParteHora = sdf2.format(fecha1);
		
		System.out.println(strParteFecha);
		System.out.println(strParteHora);
	}
}
