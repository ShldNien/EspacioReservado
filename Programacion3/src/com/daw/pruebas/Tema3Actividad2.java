
package com.daw.pruebas;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.InputMismatchException;

/*
 * 
 * Luis Francisco Mateo Parra
 * Programación. 1º DAW.
 * Tema3. Actividad 2.
 * 
 */

public class Tema3Actividad2 {
	
	/*
	 * Enunciado Ejercicio.
	 * 
	 * 	Hay que crear un programa en Java que simule una cafetería.
	 * 	Los precios de los productos son:
	 * 	Café: 		1.20€
	 * 	Tostada: 	1.50€
	 * 	Zumo: 		2€
	 * 
	 * 	a) 1 PUNTO
	 *  El programa debe permitir al usuario que seleccione una opción de lo que se ofrece en el bar.
	 *  Es decir, el programa le preguntará al usuario que indique qué desea tomar (después de haberle enseñado el menú
	 *  que esa cafetería oferta).
	 *  En el caso de que no quisiera nada, se le permite marcar la opción 0 para terminar con el proceso y pasar por caja.
	 *  
	 *  (Ejemplo)
	 *  Bienvenido a la cafetería Las Almadrabillas
	 *  Por favor, indique qué desea tomar:
	 *  1. Café
	 *  2. Tostada
	 *  3. Zumo
	 *  
	 *  0. Terminar
	 *  
	 *  b) 1 PUNTO
	 *  Tras esto, se le debe preguntar la cantidad de cafés, tostadas o zumos (según lo que haya seleccionado el usuario)
	 *  que desea.
	 *  
	 *  (Ejemplo)
	 *  Ha seleccionado: Café.
	 *  ¿Cuántos cafés desea tomar? ___
	 *  
	 *  c) 1 PUNTO
	 *  Una vez seleccionada la cantidad que el usuario desea tomar, se le debe preguntar si desea cualquier otra cosa.
	 *  Si el usuario deseara otra cosa, se repetiría el proceso anterior.
	 *  
	 *  (ejemplo)
	 *  ¿Desea algo más? Marque la opción que desee.
	 * 	1. Café
	 *  2. Tostada
	 *  3. Zumo
	 *  
	 *  0. Terminar
	 *  
	 *  
	 *  d) 1 PUNTO
	 *  Cuando el usuario no quiera nada más y marque la opción 0 para terminar y pasar por caja, se le debe comunicar
	 *  la cuenta.
	 *  
	 *  (ejemplo)
	 *  Serían XX.XX€
	 *  Gracias y hasta pronto.
	 *  
	 *  
	 *  (OPCIONAL. No cuenta para nota)
	 *  e)
	 *  A la hora de ofrecer el café o las tostadas, se le podría preguntar de qué quiere cada cosa. 
	 *  (café solo, café con leche, tostada de tomate, tostada de atun y queso, etc). Habría que aplicar un suplemento en el precio.
	 *  
	 *  
	 *  Además, se le debe comunicar en el mensaje de despedida: 
	 *  "Gracias y que tenga buen día" (si es por la mañana)
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
		
		System.out.println("Bienvenido a <<El Café del Cid>>");
		System.out.println("¿Qué desea tomar?");
		System.out.println("MENÚ");	
		System.out.println("__________________");		
		System.out.println("1. Café ");
		System.out.println("2. Tostada ");
		System.out.println("3. Zumo ");
		System.out.println("");
		System.out.println("0. Terminar ");
		System.out.println("__________________");	
		System.out.println("Introduzca el número del pedido del 1 al 3 :");
		System.out.println("");
		numTecl = sc.nextInt();	
						
	switch(numTecl) {
		case 1: 
			System.out.println("Ud.ha pedido un café.");
			System.out.println("");
			System.out.println("¿Cuántos quiere tomar?");
			System.out.println("");
			numTecl = sc.nextInt();	
			cantidad = numTecl;
			System.out.println("Ud. quiere tomar " + cantidad);
			pedido++;
			cafe = 1.20*cantidad;
			break;
		case 2:
			System.out.println("Ud.ha pedido una tostada.");
			System.out.println("¿Cuántos quiere tomar?");
			System.out.println("");
			numTecl = sc.nextInt();
			cantidad = numTecl;
			System.out.println("Ud. quiere tomar " + cantidad);
			pedido++;
			tostada = 1.50*cantidad;
			break;
		case 3:
			System.out.println("Ud.ha pedido un zumo.");
			System.out.println("¿Cuántos quiere tomar?");
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
				System.out.println("¿Desea tomar otra cosa?");	
				System.out.println("MENÚ");
				System.out.println("__________________");	
				System.out.println("1. Café ");
				System.out.println("2. Tostada ");
				System.out.println("3. Zumo ");
				System.out.println("");
				System.out.println("0. Terminar ");
				System.out.println("__________________");
				System.out.println("Introduzca el número del pedido: ");
				numTecl = sc.nextInt();									
			switch(numTecl) {
				case 1: 
					System.out.println("Ud.ha pedido un café.");
					System.out.println("");
					System.out.println("¿Cuántos quiere tomar?");
					numTecl = sc.nextInt();	
					cantidad = numTecl;
					System.out.println("Ud. quiere tomar " + cantidad);
					cafe = 1.20*cantidad;
					break;
				case 2:
					System.out.println("Ud.ha pedido una tostada.");
					System.out.println("");
					System.out.println("¿Cuántos quiere tomar?");
					numTecl = sc.nextInt();
					cantidad = numTecl;
					System.out.println("Ud. quiere tomar " + cantidad);
					tostada = 1.50*cantidad;
					break;
				case 3:
					System.out.println("Ud.ha pedido un zumo.");
					System.out.println("");
					System.out.println("¿Cuántos quiere tomar?");
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
				System.out.println("Error crítico, apagando...");
				break;
			}
		}
		total = zumo+tostada+cafe;
		System.out.println("Cuenta: "+total+"€");
		calendar.setTime(date); 
		double hora = calendar.get(Calendar.HOUR_OF_DAY);
			if (hora > 0 & hora < 12) {
				System.out.println("Gracias, que tenga buen día");
			}else if (hora > 12 & hora < 20) {
				System.out.println("Gracias, que pase una buena tarde");
			}else{
				System.out.println("Gracias, que vaya bien la noche");
			}
		}

	/*
	 * Encima de la declaración de la clase con comentarios multilínea
	 * 
	 * Vuestro nombre y apellidos
	 * Programación. 1er Curso.
	 * Tema3. Actividad 2.
	 * 
	 * 0.25 pts
	 * 
	 */
			
}
