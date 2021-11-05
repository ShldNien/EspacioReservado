package com.daw.pruebas;

public class EjercicioArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] arrDoub = new double[5];
		arrDoub[0]=1.02;
		arrDoub[1]=5.79;
		arrDoub[2]=6.66;
		arrDoub[3]=2.03;
		arrDoub[4]=9.99;
		double suma = 0;
		/*
		 * Hacer un programa que:
		 * Itere por el array y al final nos 
		 * devuelva la media de sus elementos
		 */
		for(int i=0;i<arrDoub.length;i++) {
			suma=suma+arrDoub[i];
		}
		System.out.println(suma/arrDoub.length);
	}

}
