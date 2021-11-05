package com.daw.pruebas;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Luis Francisco Mateo Parra 1ºDAW
 * Programacion
 * Actividad 3
 */

public class Tema3Actividad3 {

	public static void main(String[] args) {
		Tema3Actividad3 act = new Tema3Actividad3();
		Scanner scan = new Scanner(System.in);
		int ejer = 1;
		while (ejer!=0) {
			
			try {
				System.out.print("Por favor, indique un ejercicio del 1 al 10 (0 para exit): ");
				ejer = scan.nextInt();
			
				switch (ejer) {
				case 1:
					System.out.println("Ejercicio 1. Del 0 al 20");					
					act.delCeroAlVeinte();
					break;
				case 2:
					System.out.println("Ejercicio 2. Pares del 1 al 200");
					act.pares();
					break;
				case 3:
					System.out.println("Ejercicio 3. Impares del 1 al 200");
					act.impares();
					break;
				case 4:
					System.out.println("Ejercicio 4. Factorial");
					act.factorial();
					break;
				case 5:
					System.out.println("Ejercicio 5. ¿Cuantos negativos?");
					act.cuantosNeg();
					break;
				case 6:
					System.out.println("Ejercicio 6. ¿Cuantos positivos y cuantos negativos?");
					act.cuantosPosNeg();
					break;
				case 7:
					System.out.println("Ejercicio 7. ¿Cuantos positivos y cuantos negativos hasta que 0?");
					act.cuantosPosNegHQC();
					break;
				case 8:
					System.out.println("Ejercicio 8. Potencias");
					act.potencias();
					break;
				case 9:
					System.out.println("Ejercicio 9. Suma de pares e Impares");
					act.sumParImpar();
					break;
				case 10:
					System.out.println("Ejercicio 10. Los dineros");
					act.elsDiners();
					break;
	
				default:
					if(ejer!=0) {
						System.out.println("Error, indique numero del 1 al 10 (0 para salir)");
					}
					break;
				}
				
			} catch (InputMismatchException e) {
				System.out.println("Fatal Error, deleting all files on your computer...");
				break;
			}
		}

	}
	
	
	/*
	 * RESUELVE TUS EJERCICIOS DENTRO DE CADA METODO.
	 */
	
	/**
	 * Ejercicio 1: Escribe un programa que muestre por pantalla
	 * los 20 primeros numeros enteros naturales. (1, 2, 3 ... 20)
	 * 
	 * 0,5 pts
	 */
	private void delCeroAlVeinte() {
		for (int i=0;i<21;i++) {
			System.out.println("Los números, respectivamente: "+i);
		}
		
	}

	/**
	 * Ejercicio 2: Escribe un programa que muestre los numeros 
	 * pares comprendidos entre el 1 y el 200.
	 * 
	 * 1 pto
	 */
	private void pares() {

		for(int i=1;i<=200;i++) {
			int par = i%2;
			if(par==0) {
				System.out.println("Los números pares, respectivamente: "+i);
			}
		}
		
	}

	/**
	 * Ejercicio 3: Escribe un programa que muestre los numeros
	 * impares comprendidos entre el 1 y el 200.
	 *  
	 * 1 pto
	 */
	private void impares() {
		for(int i=1;i<=200;i++) {
			int par = i%2;
			if(par!=0) {
				System.out.println("Los números impares, respectivamente: "+i);
			}
		}
	}

	/**
	 * Ejercicio 4. Escribe un programa que lea por teclado
	 * un numero positivo y muestre por pantalla el valor factorial
	 * de ese numero. (N!)
	 * Ej.
	 * 0! = 1
	 * 1! = 1
	 * 2! = 2 * 1
	 * 3! = 3 * 2 * 1
	 * 4! = 4 * 3 * 2 * 1
	 * 5! = 5 * 4 * 3 * 2 * 1
	 * 
	 * N! = N * (N-1) * (N-2) * (N-3) * ... * 1
	 *  
	 * 1 pto
	 */
	private void factorial() {
		Scanner sc = new Scanner(System.in);
		int numTecl;
		//int factorial = 0;
		System.out.println("Introduzca el número a realizar su factorial: ");
		numTecl = sc.nextInt();
		int factorial = numTecl;
		int aux = numTecl;
		for (int i=numTecl;i>1;i--) {
			
			//factorial = (aux)*(aux-i)*1;
			//System.out.println("Factorial de : "+numTecl);
			//System.out.println(factorial);
			
			factorial = factorial * (numTecl-1);
			numTecl--;
			
			
		}
		System.out.println("Factorial: "+factorial);
	}

	
	/**
	 * Ejercicio 5. Escribe un programa que lea 10 valores por teclado.
	 * Al final el programa debe mostrarnos
	 * cuantos de esos valores han sido numeros negativos.
	 *  
	 * 1 pto
	 */
	private void cuantosNeg() {
		Scanner sc = new Scanner(System.in);
		int numTecl;
		int contador=0;
		for (int i=0;i<10;i++) {
			System.out.println("Introduzca un número.");
			numTecl = sc.nextInt();
			if(numTecl<0) {
				contador++;
				System.out.println("");
			}else{
				System.out.println("");
			}
		}	
		System.out.println("Cantidad de negativos: "+contador);
	}

	/**
	 * Ejercicio 6. Escribe un programa que lea 10 valores por teclado.
	 * Al final el programa debe mostrarnos
	 * cuantos de esos valores han sido numeros negativos y cuantos positivos.
	 *  
	 * 1 pto
	 */
	private void cuantosPosNeg() {
		Scanner sc = new Scanner(System.in);
		int numTecl;
		int contadorPositivos=0;
		int contadorNegativos=0;
		for (int i=0;i<10;i++) {
			System.out.println("Introduzca un número.");
			numTecl = sc.nextInt();
			if(numTecl<0) {
				contadorNegativos++;
				System.out.println("");
			}else{
				contadorPositivos++;
				System.out.println("");
			}
		}	
		System.out.println("Cantidad de positivos: "+contadorPositivos);
		System.out.println("Cantidad de negativos: "+contadorNegativos);
	}
	

	/**
	 * Ejercicio 7. Escribe un programa que lea valores por teclado.
	 * hasta que se inserte un 0. Al final el programa debe mostrarnos
	 * cuantos de esos valores han sido numeros negativos y cuantos positivos.
	 *  
	 * 1 pto
	 */
	private void cuantosPosNegHQC() {
		Scanner sc = new Scanner(System.in);
		int numTecl;
		int contadorPositivos=0;
		int contadorNegativos=0;
		System.out.println("Introduzca un número distinto de 0.");
		numTecl = sc.nextInt();
		while (numTecl!=0) {
			System.out.println("Introduzca un número distinto de 0.");
			numTecl = sc.nextInt();
			if(numTecl<0) {
				contadorNegativos++;
				System.out.println("");
			}else{
				contadorPositivos++;
				System.out.println("");
			}
		}	
		System.out.println("Cantidad de positivos: "+contadorPositivos);
		System.out.println("Cantidad de negativos: "+contadorNegativos);
	}

	/**
	 * Ejercicio 8: Escribe un programa que calcule el valor de
	 * 2 elevado a un número que el usuario introducirá por teclado.
	 * Este numero que se introduce por teclado no puede ser mayor que
	 * 10.
	 * Al final el programa nos mostrara el resultado de esa potencia.
	 * NO SE PUEDE USAR EL OPERADOR DE POTENCIA (^)
	 *  
	 * 1 pto
	 */
	private void potencias() {
		Scanner sc = new Scanner(System.in);
		int numTecl;
		int resultado = 2;
		System.out.println("Introduzca un exponente para 2: ");
		numTecl = sc.nextInt();
		if(numTecl==0) {
			resultado = 1;
		}else{
			for(int i=numTecl;i>1;i--) {
				resultado = resultado*2;
			}
		}
		System.out.println("El resultado es: "+resultado);
	}

	
	/**
	 * Ejercicio 9: Escribe un programa que sume independientemente
	 * los pares y los impares de los números comprendidos entre el 100 y el 200.
	 * Al final el programa nos tiene que mostrar el valor de ambas sumas.
	 *  
	 * 1 pto
	 */
	private void sumParImpar() {
		int par;
		int sumaPar=0;
		int impar;
		int sumaImpar=0;
		
		for(int i=100;i<200;i++) {
			par = i%2;
			if(par==0) {
			sumaPar = sumaPar + i;
			}
		}
		System.out.println("Pares: "+sumaPar);
		for(int j=100;j<200;j++) {
			impar = j%2;
			if(impar!=0) {
			sumaImpar = sumaImpar + j;
			}
		}
		System.out.println("Impares "+sumaImpar);
	}

	/**
	 * Ejercicio 10: Escribe un programa que dada una cantidad de euros
	 * que el usuario introduce por teclado (múltiplo de 5 €) mostrará los billetes de
	 * cada tipo que serán necesarios para alcanzar dicha cantidad (utilizando
	 * billetes de 500, 200, 100, 50, 20, 10 y 5). Hay que indicar el mínimo de
	 * billetes posible. Por ejemplo, si el usuario introduce 145 el programa indicará
	 * que será necesario 1 billete de 100 €, 2 billetes de 20 € y 1 billete de 5 € (no
	 * será válido por ejemplo 29 billetes de 5, que aunque sume 145 € no es el
	 * mínimo número de billetes posible).
	 * 
	 * 1 pto
	 */
	private void elsDiners() {
		Scanner sc = new Scanner(System.in);
		int numTecl;
		int cont500,cont200,cont100,cont50,cont20,cont10,cont5;
		cont500=0;
		cont200=0;
		cont100=0;
		cont50=0;
		cont20=0;
		cont10=0;
		cont5=0;
		System.out.println("Introduzca un múltiplo de 5:");
		numTecl = sc.nextInt();
		int multiplo5 = numTecl%5;
		while(numTecl>0 && multiplo5 == 0) {
			if (numTecl>=500) {
				numTecl-=500;
				cont500++;
			}else if(numTecl>=200) {
				numTecl-=200;
				cont200++;
			}else if(numTecl>=100) {
				numTecl-=100;
				cont100++;
			}else if(numTecl>=50) {
				numTecl-=50;
				cont50++;
			}else if(numTecl>=20) {
				numTecl-=20;
				cont20++;
			}else if(numTecl>=10) {
				numTecl-=10;
				cont10++;
			}else if(numTecl>=5) {
				numTecl-=5;
				cont5++;
			}
		}
		System.out.println("Ud. necesitaría "+ cont500 + " billetes de 500, " + cont200 + " billetes de 200, " + cont100 + " billetes de 100, " + cont50 + " billetes de 50, " 
				+ cont20 + " billetes de 20, " + cont10 + " billetes de 10 y " + cont5 + " billetes de 5.");
		
	}
	
	/*
	 * Escribe al principio del documento usando comentarios.
	 * Nombre y apellidos
	 * Programacion
	 * Actividad 3
	 * 
	 * 0,5 pts
	 * 
	 */

}
