
package com.daw.pruebas;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.InputMismatchException;

/*
 * 
 * Luis Francisco Mateo Parra
 * Programaci�n. 1� DAW.
 * Tema3. Actividad 2.
 * 
 */

public class Tema3Actividad2 {
	
	/*
	 * Enunciado Ejercicio.
	 * 
	 * 	Hay que crear un programa en Java que simule una cafeter�a.
	 * 	Los precios de los productos son:
	 * 	Caf�: 		1.20�
	 * 	Tostada: 	1.50�
	 * 	Zumo: 		2�
	 * 
	 * 	a) 1 PUNTO
	 *  El programa debe permitir al usuario que seleccione una opci�n de lo que se ofrece en el bar.
	 *  Es decir, el programa le preguntar� al usuario que indique qu� desea tomar (despu�s de haberle ense�ado el men�
	 *  que esa cafeter�a oferta).
	 *  En el caso de que no quisiera nada, se le permite marcar la opci�n 0 para terminar con el proceso y pasar por caja.
	 *  
	 *  (Ejemplo)
	 *  Bienvenido a la cafeter�a Las Almadrabillas
	 *  Por favor, indique qu� desea tomar:
	 *  1. Caf�
	 *  2. Tostada
	 *  3. Zumo
	 *  
	 *  0. Terminar
	 *  
	 *  b) 1 PUNTO
	 *  Tras esto, se le debe preguntar la cantidad de caf�s, tostadas o zumos (seg�n lo que haya seleccionado el usuario)
	 *  que desea.
	 *  
	 *  (Ejemplo)
	 *  Ha seleccionado: Caf�.
	 *  �Cu�ntos caf�s desea tomar? ___
	 *  
	 *  c) 1 PUNTO
	 *  Una vez seleccionada la cantidad que el usuario desea tomar, se le debe preguntar si desea cualquier otra cosa.
	 *  Si el usuario deseara otra cosa, se repetir�a el proceso anterior.
	 *  
	 *  (ejemplo)
	 *  �Desea algo m�s? Marque la opci�n que desee.
	 * 	1. Caf�
	 *  2. Tostada
	 *  3. Zumo
	 *  
	 *  0. Terminar
	 *  
	 *  
	 *  d) 1 PUNTO
	 *  Cuando el usuario no quiera nada m�s y marque la opci�n 0 para terminar y pasar por caja, se le debe comunicar
	 *  la cuenta.
	 *  
	 *  (ejemplo)
	 *  Ser�an XX.XX�
	 *  Gracias y hasta pronto.
	 *  
	 *  
	 *  (OPCIONAL. No cuenta para nota)
	 *  e)
	 *  A la hora de ofrecer el caf� o las tostadas, se le podr�a preguntar de qu� quiere cada cosa. 
	 *  (caf� solo, caf� con leche, tostada de tomate, tostada de atun y queso, etc). Habr�a que aplicar un suplemento en el precio.
	 *  
	 *  
	 *  Adem�s, se le debe comunicar en el mensaje de despedida: 
	 *  "Gracias y que tenga buen d�a" (si es por la ma�ana)
	 *  "Gracias y que pase una buena tarde" (si es por la tarde)
	 *  "Gracias y que vaya bien la noche" (si es por la noche)
	 *  
	 *  
	 *  
	 */
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Date date = new Date();   								
		Calendar calendar = GregorianCalendar.getInstance(); 									
		int pedido = 0;
		int numTecl = 1;
		double cafe = 0;
		double tostada = 0;
		double zumo = 0;
		double cuenta = 0;
		int cantidad = 0;
		double total;
		
		System.out.println("Bienvenido a <<El Caf� del Cid>>");
		System.out.println("�Qu� desea tomar?");
		System.out.println("MEN�");	
		System.out.println("__________________");		
		System.out.println("1. Caf� ");
		System.out.println("2. Tostada ");
		System.out.println("3. Zumo ");
		System.out.println("");
		System.out.println("0. Terminar ");
		System.out.println("__________________");	
		System.out.println("Introduzca el n�mero del pedido del 1 al 3 :");
		System.out.println("");
		numTecl = sc.nextInt();	
						
	switch(numTecl) {
		case 1: 
			System.out.println("Ud.ha pedido un caf�.");
			System.out.println("");
			System.out.println("�Cu�ntos quiere tomar?");
			System.out.println("");
			numTecl = sc.nextInt();	
			cantidad = numTecl;
			System.out.println("Ud. quiere tomar " + cantidad);
			pedido++;
			cafe = 1.20*cantidad;
			break;
		case 2:
			System.out.println("Ud.ha pedido una tostada.");
			System.out.println("�Cu�ntos quiere tomar?");
			System.out.println("");
			numTecl = sc.nextInt();
			cantidad = numTecl;
			System.out.println("Ud. quiere tomar " + cantidad);
			pedido++;
			tostada = 1.50*cantidad;
			break;
		case 3:
			System.out.println("Ud.ha pedido un zumo.");
			System.out.println("�Cu�ntos quiere tomar?");
			System.out.println("");
			numTecl = sc.nextInt();
			cantidad = numTecl;
			System.out.println("Ud. quiere tomar " + cantidad);
			pedido++;
			zumo = 2*cantidad;
			break;
		default: 
			if(numTecl != 0) {
			System.out.println("Ud. no ha pedido nada.");
			System.out.println("");
			}
			break;
		}	
		while (numTecl != 0) {
			try {	
				System.out.println("�Desea tomar otra cosa?");	
				System.out.println("MEN�");
				System.out.println("__________________");	
				System.out.println("1. Caf� ");
				System.out.println("2. Tostada ");
				System.out.println("3. Zumo ");
				System.out.println("");
				System.out.println("0. Terminar ");
				System.out.println("__________________");
				System.out.println("Introduzca el n�mero del pedido: ");
				numTecl = sc.nextInt();									
			switch(numTecl) {
				case 1: 
					System.out.println("Ud.ha pedido un caf�.");
					System.out.println("");
					System.out.println("�Cu�ntos quiere tomar?");
					numTecl = sc.nextInt();	
					cantidad = numTecl;
					System.out.println("Ud. quiere tomar " + cantidad);
					cafe = 1.20*cantidad;
					break;
				case 2:
					System.out.println("Ud.ha pedido una tostada.");
					System.out.println("");
					System.out.println("�Cu�ntos quiere tomar?");
					numTecl = sc.nextInt();
					cantidad = numTecl;
					System.out.println("Ud. quiere tomar " + cantidad);
					tostada = 1.50*cantidad;
					break;
				case 3:
					System.out.println("Ud.ha pedido un zumo.");
					System.out.println("");
					System.out.println("�Cu�ntos quiere tomar?");
					numTecl = sc.nextInt();
					cantidad = numTecl;
					System.out.println("Ud. quiere tomar " + cantidad);
					zumo = 2*cantidad;
					break;
				default: 
					if(numTecl != 0) {
					System.out.println("Ud. no ha pedido nada.");
					}
					break;
				}
			} catch (InputMismatchException e) {
				System.out.println("Error cr�tico, apagando...");
				break;
			}
		}
		total = zumo+tostada+cafe;
		System.out.println("Cuenta: "+total+"�");
		calendar.setTime(date); 
		double hora = calendar.get(Calendar.HOUR_OF_DAY);
			if (hora > 0 & hora < 12) {
				System.out.println("Gracias, que tenga buen d�a");
			}else if (hora > 12 & hora < 20) {
				System.out.println("Gracias, que pase una buena tarde");
			}else{
				System.out.println("Gracias, que vaya bien la noche");
			}
		}

	/*
	 * Encima de la declaraci�n de la clase con comentarios multil�nea
	 * 
	 * Vuestro nombre y apellidos
	 * Programaci�n. 1er Curso.
	 * Tema3. Actividad 2.
	 * 
	 * 0.25 pts
	 * 
	 */
			
}
