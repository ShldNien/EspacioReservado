package com.daw.pruebas;

import java.util.*;

public class SetsYMapas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("SETS Y MAPAS");
		
		Set<String> setHash = new HashSet<String>();
		
		setHash.add("Hola");
		setHash.add("Maniana");
		setHash.add("Diego");
		setHash.add("Almeria");
		setHash.add("Diego");

		System.out.println("SetHash creado:\n"+setHash);
		
		String cadena = "Diego";
		System.out.println("\nLa cadena "+cadena+" tiene un hashCode:"+ cadena.hashCode()+"\n");
		
		for(String s : setHash) {
			System.out.println(s + " tiene un hashCode:"+s.hashCode());
		}
		
		Set<String> treeSet = new TreeSet<String>();
		
		treeSet.add("Diego");
		treeSet.add("Biego");
		treeSet.add("Biego");

		System.out.println("\nTreeSet creado:\n"+treeSet);
		
		Map<String, String> hashMap = new HashMap<String, String>();
		hashMap.put("751867738","Diego");
		hashMap.put("751867738","Alfonso");
		hashMap.put("64075662A","Pepito");
		hashMap.put("64075662B","Diego");
		
		System.out.println("\nHashMap creado:\n"+hashMap);
		System.out.println("\nClave 751867738 con valor : "+ hashMap.get("751867738"));

		ArrayList<String> strList = new ArrayList<String>();
		
		strList.add("Luis");
		strList.add("Fran");
		strList.add("Sebas");
		strList.add("Antonio");
		strList.add("Carlos");
		strList.add("Rober");
		strList.add("Joseph");
		strList.add("Alba");
		strList.add("Conrado");
		strList.add("Miguel");
		
		System.out.println("Alumnos : "+strList);
		
		Set<String> hashSet = new HashSet<String>();
		
		hashSet.add("Absenta");
		hashSet.add("Bourbon");
		hashSet.add("Carabina");
		hashSet.add("Delorian");
		hashSet.add("Elon");
		hashSet.add("Flusk");
		
		System.out.println("SetHash Creado: "+hashSet);
		
		String cad = "Absenta";
		System.out.println("El HashCode de "+cad+" es : "+cad.hashCode());
		
		Set<String> setTree = new TreeSet<String>();
		
		setTree.add("la");
		setTree.add("li");
		setTree.add("lu");
		setTree.add("le");
		setTree.add("lo");
		
		
		System.out.println("El TreeSet creado: "+setTree);
		
		Map<String> hashMap

		
	}
	/*
	 * 1. Crear una coleccion por cada tipo de coleccion. (ArrayList) (Set -> HashSet y TreeSet) (Maps -> HashMap y TreeMap)
	 * 2. Meter valores a cada una de las colecciones creadas
	 * 	a) En el caso de HashMap y TreeMap... esos valores tienen que tener sentido
	 * 3. Recorrer con un foreach cada una de las colecciones Set y Arraylist que hemos creado
	 */
	

		
		
		
}
