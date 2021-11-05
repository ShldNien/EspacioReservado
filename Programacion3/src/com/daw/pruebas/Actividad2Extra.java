package com.daw.pruebas;

import java.sql.Time;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Actividad2Extra {

	public static void main(String[] args) {
		
		Actividad2Extra act = new Actividad2Extra();
		Scanner scan = new Scanner(System.in);
		int ejer = 1;
		int num1=0, num2=0, num3=0;
		while (ejer!=0) {
			
			
			try {
				System.out.print("Por favor, indique un ejercicio del 1 al 8 (0 para exit): ");
				ejer = scan.nextInt();
			
				switch (ejer) {
				case 1:
					
					System.out.println("Ejercicio 1. Operacion");
					
					act.operacion(num1, num2);
					break;
				case 2:
					System.out.println("Ejercicio 2. Operacion");
					act.mayor(num1, num2);
					break;
				case 3:
					System.out.println("Ejercicio 3. esPositivo");
					act.esPositivo(num1);
					break;
				case 4:
					System.out.println("Ejercicio 4. Ascendente");
					act.ascendente(num1, num2);
					break;
				case 5:
					System.out.println("Ejercicio 5. Mayor V2");
					act.mayorV2(num1, num2);
					break;
				case 6:
					System.out.println("Ejercicio 6. Iguales V2");
					act.igualesV2(num1, num2, num3);
					break;
				case 7:
					System.out.println("Ejercicio 7. Calificacion");
					act.calificacion(num1);
					break;
				case 8:
					System.out.println("Ejercicio 8. �Que hora es?");
					/*
					Date date = new Date();   								// Instancia de Date
					Calendar calendar = GregorianCalendar.getInstance(); 	// crea una nueva instancia de Calendar
					calendar.setTime(date); 								// setea time de calendar con lo obtenido de Date
					num1 = calendar.get(Calendar.HOUR_OF_DAY);				// podemos sacar entonces de calendar lo que necesitemos
					num2= calendar.get(Calendar.MINUTE);
					num3 = calendar.get(Calendar.SECOND);
					System.out.println("Ahora mismo son las "+num1+" horas, "+num2+" minutos y "+num3+" segundos");
					*/
					act.horaEnUnSegundo(num1, num2, num3);
					break;
	
				default:
					if(ejer!=0) {
						System.out.println("Error, indique numero del 1 al 8 (0 para salir)");
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
	
	///////////////////////////////////////////////////////////
	//////////////////EJERCICICIOS JEDI////////////////////////
	///////////////////////////////////////////////////////////

	
	/**
	 * Ejer1:  Escribe un programa que lee dos n�meros, calcula y muestra el valor de su suma, 
	 * resta, producto y divisi�n. (Ten en cuenta la divisi�n por cero).
	 * @param num1
	 * @param num2
	 */
	private void operacion (int num1, int num2) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el primer n�mero");
		num1 = sc.nextInt();
		System.out.println("");
		System.out.println("Hecho.");
		System.out.println("");
		System.out.println("Introduzca el segundo n�mero");
		num2 = sc.nextInt();
		int suma = num1+num2;
		int resta = num1-num2;
		int producto = num1*num2;
		System.out.println("Introduzca el tipo de operador que usaremos : ");
		String operador = "";
		operador = sc.nextLine();
		if(operador.equals("+")) {
			System.out.println("SUMA : " + suma);
		}else if(operador.equals("-")) {
			System.out.println("RESTA : " + resta);
		}else if(operador.equals("*")) {
			System.out.println("PRODUCTO :" + producto);
		}else if(operador.equals("/")) {
			if(num2 == 0) {
				System.out.println("DIVISI�N : 0/0 INDETERMINADO");
			}else{
				System.out.println("DIVISI�N : " + num1/num2);
			}	
		}
	}
	
	
	/**
	 * Ejer2: Escribe un programa que lee 2 numeros y muestra el mayor
	 * @param num1
	 * @param num2
	 */
	private void mayor (int num1, int num2) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el primer n�mero");
		num1 = sc.nextInt();
		System.out.println("Hecho.");
		System.out.println("");
		System.out.println("Introduzca el segundo n�mero");
		num2 = sc.nextInt();
		if(num1 > num2) {
			System.out.println("El mayor n�mero es : " + num1);
		}else{
			System.out.println("El mayor n�mero es : " + num2);
		}
	}
	
	/**
	 * Ejer3: Escribe un programa que lee un numero y dice si es positivo o negativo
	 * Consideramos 0, que debe decir que el numero es 0 (ni positivo ni negativo)
	 * @param num
	 */
	private void esPositivo(int num) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el n�mero a identificar si es negativo o positivo : ");
		num = sc.nextInt();
		System.out.println("Hecho.");
		if (num == 0) {
			System.out.println("El n�mero introducido es : 0");
		}else{
			if (num < 0) {
				System.out.println("El n�mero es NEGATIVO.");
			}else{
				if (num > 0) {
					System.out.println("El n�mero es POSITIVO.");
				}
			}
		}
	}
	
	/**
	 * Ejer4: Escribe un programa que lee dos numeros y los visualiza en orden ascendente
	 * @param num1
	 * @param num2
	 */
	private void ascendente(int num1, int num2) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el primer n�mero");
		num1 = sc.nextInt();
		System.out.println("");
		System.out.println("Hecho.");
		System.out.println("");
		System.out.println("Introduzca el segundo n�mero");
		num2 = sc.nextInt();
		if(num1 > num2 | num1 == num2) {
			System.out.println(num1);
			System.out.println(num2);
		}else{
			System.out.println(num2);
			System.out.println(num1);
		}
	}
	
	/**
	 * Ejer5: Escribe un programa que lee dos numeros y nos dice cual es el mayor o 
	 * si son iguales
	 * @param num1
	 * @param num2
	 */
	private void mayorV2(int num1, int num2) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el primer n�mero");
		num1 = sc.nextInt();
		System.out.println("Hecho.");
		System.out.println("");
		System.out.println("Introduzca el segundo n�mero");
		num2 = sc.nextInt();
		if(num1 == num2) {
			System.out.println("Ambos n�meros son IGUALES.");
			}else{
				if(num1 > num2) {
					System.out.println("El mayor n�mero es : " + num1);
				}else{
					System.out.println("El mayor n�mero es : " + num2);
			}	
		}
	}
	
	/**
	 * Ejer 6: Escribe un programa que lea tres numeros distintos y nos diga
	 * cual es el mayor
	 * @param num1
	 * @param num2
	 * @param num3
	 */
	private void igualesV2(int num1, int num2, int num3) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el primer n�mero");
		num1 = sc.nextInt();
		System.out.println("Introduzca el segundo n�mero");
		num2 = sc.nextInt();
		System.out.println("Introduzca el tercer n�mero");
		num3 = sc.nextInt();
		if(num1 > num2 && num1 > num3) {
			System.out.println("El mayor n�mero es : " + num1);
		}else{
			if(num2 > num1 && num2 > num3) {
				System.out.println("El mayor n�mero es : " + num2);
			}else{
				if(num3 > num1 && num3 > num2) {
					System.out.println("El mayor n�mero es : " + num3);
				}
			}
		}
	}
	
	///////////////////////////////////////////////////////////
	/////////////EJERCICICIOS GRAN JEDI////////////////////////
	///////////////////////////////////////////////////////////
	
	/**
	 * Ejer 7: Escribe un programa que lea una calificacion numerica entre 0 y 10
	 * y la transforme en calificacion alfabetica de la siguiente manera:
	 * 
	 * De 0 a <3 -> Muy deficiente
	 * De 3 a <5 -> Insuficiente
	 * De 5 a <6 -> Bien
	 * De 6 a <9 -> Notable
	 * De 9 a 10 -> Sobresaliente
	 * 
	 * @param num
	 */
	private void calificacion(int num) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca una calificacion num�rica entre 0 y 10.");
		num = sc.nextInt();
		System.out.println("");
		System.out.println("Calculando. . . ");
		if (num == 9 | num == 10){
			System.out.println("Sobresaliente ");
		}else if (num >= 6 | num < 9 ){
			System.out.println("Notable ");
		}else if (num >= 5 | num < 6){
			System.out.println("Bien ");
		}else if (num >= 3 | num < 5){
			System.out.println("Insuficiente ");
		}else if (num >= 0 | num < 3) {
			System.out.println("Muy deficiente ");
		}																								
	}
	
	/**
	 * Ejer 8: Escribe un programa que recibe como datos de entrada una hora expresada en horas, minutos
	 * y segundos, y que nos calcula y escribe la hora minutos y segundos que ser�n transcurridos en un segundo.
	 * @param hora
	 * @param minutos
	 * @param segundos
	 */
	public void horaEnUnSegundo(int hora, int minutos, int segundos) {
		Date date = new Date();   								// Instancia de Date
		Calendar calendar = GregorianCalendar.getInstance(); 	// crea una nueva instancia de Calendar
		calendar.setTime(date); 								// setea time de calendar con lo obtenido de Date
		hora = calendar.get(Calendar.HOUR_OF_DAY);				// podemos sacar entonces de calendar lo que necesitemos
		minutos = calendar.get(Calendar.MINUTE);
		segundos = calendar.get(Calendar.SECOND);
		if(segundos == 59){
				segundos = 0;
				minutos++;
				if(minutos==60) {
					minutos = 0;
					hora=hora+1;
					if(hora == 24) {
						hora = 0;
						System.out.println(""+hora+":"+minutos+":"+segundos);
					}
				}
		}else{
			segundos++;
			System.out.println(""+hora+":"+minutos+":"+segundos);
		}
		
		}
	}

	