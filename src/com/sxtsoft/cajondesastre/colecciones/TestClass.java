package com.sxtsoft.cajondesastre.colecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class TestClass {

	public TestClass() {
		// TODO Auto-generated constructor stub
	}

	private static void collectionUtilities() {
		//1. crear rapidamente una lista
		
		List<String> nombres = Arrays.asList("D","F","A","B","A");
		
		//2. ordenar
		
		Collections.sort(nombres);
		
		System.out.println(nombres);
		
		//3. Ordenar en forma descendiente
		
		Collections.reverse(nombres);
		
		System.out.println(nombres);
		
		//4. Shuffle
		
		Collections.shuffle(nombres);
		
		System.out.println(nombres);
	}
	private static void testList() {
		
		List<String> nombres = new ArrayList<>();
		
		//añadimos elementos
		nombres.add("Pepín");
		nombres.add("Pepe");
		nombres.add("carola");
		nombres.add("Zar");
		nombres.add("Andres");
		
		
		System.out.println("Número elementos: " + nombres.size());
		
		//probamos con for clásico
		System.out.println("Listado de nombres con for clásico: ");
		
		for (int i = 0; i < nombres.size(); i++) {
			System.out.println(i + ": " + nombres.get(i));
		}
		
		//Método 2 utilizando que es el Iterator<String>
		
		Iterator<String> iterator = nombres.iterator();
		
		System.out.println("Listado de nombre con Iterator...");
		
		while(iterator.hasNext()) {
			String nombre = iterator.next();
			System.out.println(nombre);
		}
		
		//Método 3: Utilizando el for-each
		//cómodo, no tengo en cuenta los índices si no me importan
		
		System.out.println("Listado de nombre con for-each...");
		
		for (String nombre : nombres) {
			System.out.println(nombre);
		}
		
		//Vamos a mostrarla sin ietrarla
		
		System.out.println(nombres);
		
		//veremos si contiene a "Pepe"
		
		boolean contiene = nombres.contains("Pepe");
		
		System.out.println("Contiene a Pepe: " + contiene);
		
		//Vamos a sacar a Pepe
		
		nombres.remove("Pepe");
		
		System.out.println(nombres.size());
	}

	private static void testSet() {
		//Utilizaremos directamente LinkedHashSet
		
		Set<String> nombres = new LinkedHashSet<>();
		
		
		//añadimos elementos
		nombres.add("Pepín");
		nombres.add("Pepe");
		nombres.add("carola");
		nombres.add("Honorio");
		nombres.add("Pepín");

		
		//en que orden saldrán si iteramos
		
		System.out.println("Iteramos el LinkedHashSet: ");
		
		for (String nombre : nombres) {
			System.out.println(nombre);
		}
		
		//utilizo la referencia nombres y pruebo TreeSet
		//utilizar sólo si es estrictamente necesario
		
		nombres = new TreeSet<>();
		nombres.add("Pepín");
		nombres.add("Pepe");
		nombres.add("Carola");
		nombres.add("Zar");
		nombres.add("Andres");
		
		System.out.println("Iteramos el TreeSet: ");
		
		for (String nombre : nombres) {
			System.out.println(nombre);
		}
		
		
	}
	
	private static void testMap() {
		
		
		Map<Integer, String> mapa = new HashMap<>();
		
		mapa.put(10, "Pepín");
		mapa.put(50, "Honorio");
		mapa.put(77, "Carlota");
		mapa.put(50, "Tatiana");
		
		//Cual es el tamaño?
		System.out.println("Tamaño del mapa " + mapa.size());
		
		//1* Iterar  con la bolsa de las llaves
		
		Set<Integer> llaves = mapa.keySet();
		
		for (Integer llave : llaves) {
			System.out.println(llave + ": " + mapa.get(llave));
		}
		
		
		//vamos a iterar el mapa mediante "plata o plomo"
		
		System.out.println("Iteramos sin importar las llaves: ");
		for(String valor: mapa.values()) {
			System.out.println(valor);
		}
	}
	
	public static void main(String[] args) {
		// 
		//testList();
		//collectionUtilities();
		//testSet();
		testMap();
	}

}
