package com.daw.pruebas;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Tema3Actividad1 {

	public static void main(String[] args) {
		Tema3Actividad1 act = new Tema3Actividad1();
		Scanner scan = new Scanner(System.in);
		int ejer = 1;
		int num1=0, num2=0, num3=0;
		while (ejer!=0) {
			
			try {
				System.out.print("Por favor, indique un ejercicio del 1 al 4 (0 para exit): ");
				ejer = scan.nextInt();
			
				switch (ejer) {
				case 1:
					System.out.println("Ejercicio 1. Del 0 al N");					
					act.delCeroAlEne();
					break;
				case 2:
					System.out.println("Ejercicio 2. Del 0 al N Invertido");
					act.delCeroAlEneInv();
					break;
				case 3:
					System.out.println("Ejercicio 3. Sumatoria");
					act.sumatoria();
					break;
				case 4:
					System.out.println("Ejercicio 4. Hasta negativo");
					act.hastaNegativo();
					break;
	
				default:
					if(ejer!=0) {
						System.out.println("Error, indique numero del 1 al 4 (0 para salir)");
					}
					break;
				}
				
			} catch (InputMismatchException e) {
				System.out.println("Fatal Error, deleting all files on your computer...");
				break;
			}
		}
		scan.close();

	}

	////////////////////////////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////////////////////////
	////////////////////////RESUELVE AQUÍ TUS EJERCICIOS////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////////////////////////
	
	/**
	 * 1. Escriba un programa que muestre los números de 0 a N, 
	 * donde N es un valor leído de teclado.
	 */
	private void delCeroAlEne() {
		//pedirle al usuario que introduzca datos por teclado
		Scanner sc = new Scanner(System.in);
		//guardar en una variable lo que el usuario ha introducido por teclado (recordad, scan.nextInt();
		int num;
		num = sc.nextInt();
		//cread una variable auxiliar con la que iteraréis
		int aux = 0;
		//Crear estructura while con condición (aux <= variable usuario N)
		while (aux <= num) {
			//Dentro de estructura while, mostrar el número que tenéis en vuestra variable aux (recordad... syso)
			System.out.println("Mostramos aux :" + aux);
			//Incrementar esa aux en 1
			aux++;
		}


		
		//fin
		
	}
	
	/**
	 * 2.	Escriba un programa similar al anterior pero que muestre los números en orden inverso
	 */
	private void delCeroAlEneInv() {
		// TODO Auto-generated method stub
		//pedirle al usuario que introduzca datos por teclado
		Scanner sc = new Scanner(System.in);
		//guardar en una variable lo que el usuario ha introducido por teclado (recordad, scan.nextInt();
		int num;
		num = 0;
		//cread una variable auxiliar con la que iteraréis
		int aux = sc.nextInt();
		//Crear estructura while con condición (aux <= variable usuario N)
		while (num <= aux) {
			//Dentro de estructura while, mostrar el número que tenéis en vuestra variable aux (recordad... syso)
			System.out.println("Mostramos aux :" + aux);
			//Incrementar esa aux en 1
			aux--;
		}

	}
	
	/**
	 * 3.	Escriba un programa que devuelva la sumatoria de un valor leído por teclado 
	 * (la sumatoria de N es la suma de todos los términos desde 1… N).
	 */
	private void sumatoria() {
		Scanner sc = new Scanner(System.in);
		int numTecl = sc.nextInt();
		int suma = 0;
		int aux1 = 0;
		while (aux1 <= numTecl) {
			suma = suma + aux1;
			System.out.println("La suma de todos los términos es : "+suma);
			aux1++;
		}

	}
		
		
	
	/**
	 * 4.	Implemente un programa que pida números hasta que se introduzca uno negativo. 
	 * Mostrar entonces la media de los valores introducidos.
	 */
	private void hastaNegativo() {
		Scanner sc = new Scanner(System.in);
		int numTecl = 0;
		int aux2 = 0;		
		int suma = 0;
		
		while(numTecl!=-1) {
			suma = suma + numTecl;
			numTecl = sc.nextInt();
			aux2++;
		}
		System.out.println(suma/aux2);
	}
		
}