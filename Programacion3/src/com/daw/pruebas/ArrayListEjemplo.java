package com.daw.pruebas;

import java.util.ArrayList;

public class ArrayListEjemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Arraylists
		 * Integer = int
		 * Double = double
		 * String = String
		 * Boolean = boolean
		 * 
		 * Arraylist<tipo> nombreVariable = new Arraylist<tipo>();
		 */
		ArrayList<Integer> arr = new ArrayList<Integer>();
		ArrayList<Double> arrDoub = new ArrayList<Double>();
		ArrayList<String> arrStr = new ArrayList<String>();
		ArrayList<Boolean> arrBool = new ArrayList<Boolean>();
		
		/*
		 * Nuevo Alumno
		 */
		arrStr.add("Luis");
		arrStr.add("Fran");
		arrStr.add("Sebas");
		arrStr.add("Antonio");
		arrStr.add("Carlos");
		arrStr.add("Rober");
		arrStr.add("Joseph");
		arrStr.add("Alba");
		arrStr.add("Conrado");
		arrStr.add("Miguel");
		
		System.out.println("Alumnos 1º; "+arrStr);

	}

}
