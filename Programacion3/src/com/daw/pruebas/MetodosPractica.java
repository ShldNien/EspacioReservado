package com.daw.pruebas;

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class MetodosPractica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1,num2,num3;
		System.out.println("Introduzca el 1er número: ");
		num1 = sc.nextInt();
		System.out.println("Introduzca el 2º número: ");
		num2 = sc.nextInt();
		System.out.println("Introduzca el 3er número: ");
		num3 = sc.nextInt();
		int total = Suma(num1, num2, num3);
		int mayor = Mayor(num1,num2,num3);
		System.out.println("El total de la suma entre los 3 números es: "+total);
		System.out.println("El mayor de los 3 números es : "+mayor);
		int[] arrTecl = {0,0,0,0,0};
		System.out.println("Introduzca un total de 5 números : ");
		
		arrTecl[0]=sc.nextInt();
		arrTecl[1]=sc.nextInt();
		arrTecl[2]=sc.nextInt();
		arrTecl[3]=sc.nextInt();
		arrTecl[4]=sc.nextInt();

		int arrSumar = arrSuma(arrTecl);
		System.out.println("La suma total del array será "+arrSumar);
		
	}

	/**
	 * 
	 * @param x
	 * @param y
	 * @param z
	 * @return
	 */
	public static int Suma(int x, int y, int z) {
		int suma=x+y+z;
		return suma;
	}
	
	/**
	 * 
	 * @param x
	 * @param y
	 * @param z
	 * @return
	 */
	public static int Mayor(int x, int y, int z) {
		int mayor = 0;
		if(x>y && x>z) {
			mayor=x;
		}else if(y>x && y>z) {
			mayor=y;
		}else if(z>x && z>y) {
			mayor=z;
		}
		return mayor;
	}
	
	/**
	 * 
	 * @param x
	 * @return
	 */
	public static int arrSuma(int[] x) {
		int suma=0;
		for(int i=0;i<x.length;i++) {
			suma+=x[i];
		}
		return suma;
	}
	
	public static void sumatoria(int num) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int numeroParaIntroducir = 0;
		for(int i=0; i<num; i++) {
			System.out.println("Introduzca un número al array");
			numeroParaIntroducir = sc.nextInt();
			arr.add(numeroParaIntroducir);
		}
		
		int sumatoria = 0;
		for(int i=0; i<arr.size();i++) {
			sumatoria += arr.get(i);
		}
		System.out.println("Sumatoria es: "+sumatoria);
	}
}
