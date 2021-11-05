package com.daw.pruebas;

import java.util.Scanner;

public class MetodoEjemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca 1er num :");
		int numTecl1 = sc.nextInt();
		System.out.println("Introduzca 2º num :");
		int numTecl2 = sc.nextInt();
		int suma = Sumar(numTecl1,numTecl2);
		System.out.println("Suma : "+suma);
		
		int num3;
		int num4;
		System.out.println("Introduzca 3er num : ");
		num3 = sc.nextInt();
		System.out.println("Introduzca 4º num : ");
		num4 = sc.nextInt();
		int comparado = Mayor(num3,num4);
		System.out.println("El mayor entre estos dos ultimos : "+comparado);
	}

	
	/**
	 * Método que suma dos variables y devuelve el resultado de la suma
	 * @param x
	 * @param y
	 * @return
	 */
	public static int Sumar(int x, int y) {
		int resultado=0;
		resultado = x+y;
		return resultado;
	}
	
	/**
	 * Método que multiplica tres valores y devuelve el resultado
	 * @param x
	 * @param y
	 * @param z
	 * @return
	 */
	public static int Multiplicar(int x, int y, int z) {
		int resultado = x*y*z;
		return resultado;
	}
	
	/**
	 * Método que evalúa que número es mayor
	 * @param x
	 * @param y
	 * @return
	 */
	public static int Mayor(int x, int y) {
		int mayor;
		if(x>y) {
			mayor=x;
		}else{
			mayor=y;
		}		
		return mayor;
	}
	
	/**
	 * Método que comprueba si un numero es 0
	 * @param x
	 * @return true si 0, false si != 0
	 */
	public static boolean esCero(int x) {
		boolean chivato = false;
		if(x==0) {
			chivato = true;
		}
		return chivato;
	}
}
