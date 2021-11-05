		 /* 		Actividad 2
		 * 			Luis Francisco Mateo Parra
		 *			1Âº DAW
		 */ 	
package com.daw.pruebas;

import java.util.Scanner;

public class Actividad2 {

	public static void main(String[] args) {
		/*
		 * 1ï¿½. Crear 8 variables. ï¿½TODAS LAS TENEIS QUE INICIALIZAR A ALGO!
		 * 		2 de tipo entero (int)
		 * 		2 de tipo nï¿½mero real (double)
		 * 		2 de tipo booleano (boolean)
		 * 		2 de tipo String (String)
		 * 
		 * 		1.5 puntos
		 */
		// DECLARAMOS CADA PAR DE VARIABLES
		int primerEntero = 1;
		int segundoEntero = 2;
		double numeroReal1 = 1.3;
		double numeroReal2 = 2.1;
		boolean esVerdadero = true;
		boolean esFalso = false;
		String cadena1 = "Mbappe";
		String cadena2 = "Ã�ker Casillas";
		
		/*
		 * 2ï¿½. 	Tenï¿½is que crear 8 sentencias if donde comparï¿½is cada par de variables que habï¿½is creado en el apartado 1.
		 * 		Dentro de cada if tenï¿½is que imprimir por pantalla 2 mensajes, uno que indica que la condiciï¿½n sï¿½ se ha cumplido,
		 * 		y otro que indique que la condiciï¿½n no se ha cumplido.
		 * 		Tenï¿½is que usar todos los operadores lï¿½gicos simples (==, !=, >, <, >=, <=) AL MENOS 1 VEZ.
		 * 		Para comparar 2 Strings, TENï¿½IS QUE MIRAR EL DOCUMENTO DE AYUDA QUE OS HE PROPORCIONADO.
		 * 		
		 * 		2 puntos
		 */
		// COMPARAMOS CADA PAR DE VARIABLES 
		// COMPARAMOS CADA PAR DE VARIABLES 
		if(primerEntero < segundoEntero) {
			System.out.println("Es verdadera ");
		}else{
			System.out.println("Es falsa ");
		}
		if(numeroReal1 > numeroReal2) {
			System.out.println("Es verdadera ");
		}else{
			System.out.println("Es falsa ");
		}
		if(esVerdadero == esFalso) {
			System.out.println("Es verdadera ");
		}else{
			System.out.println("Es falsa ");
		}
		if(cadena1.equals(cadena2)) {
			System.out.println("Es verdadera ");
		}else{
			System.out.println("Es falsa ");
		}
		if(segundoEntero <= numeroReal2) {
			System.out.println("Es verdadera ");
		}else{
			System.out.println("Es falsa ");
		}
		if(numeroReal1 >= primerEntero) {
			System.out.println("Es verdadera ");
		}else{
			System.out.println("Es falsa ");
		}
		if(esVerdadero != esFalso) {
			System.out.println("Es verdadera ");
		}else{
			System.out.println("Es falsa ");
		}
		if(cadena1.equals(cadena2)) {
			System.out.println("Es verdadera ");
		}else{
			System.out.println("Es falsa ");
		}
		
		/*
		 * 3ï¿½. 	a) 	Tenï¿½is que crear 4 variables mï¿½s. Una de cada tipo indicado en el ejercicio 1
		 * 		b)	Tenï¿½is que crear 4 sentencias if donde usï¿½is los comparadores logicos "complejos" (& y |)
		 * 		c) 	Dentro de cada if, tenï¿½is que imprimir por pantalla dos mensajes, uno que indique que la condiciï¿½n se ha cumplido
		 * 				y otro que indique que la condiciï¿½n no se ha cumplido
		 * 
		 * 		2 puntos
		 */
		int num1;
		double numReal;
		boolean esVerdadero2;
		String cadenaReal;
		num1 = 1;
		numReal = 3.14;
		esVerdadero2 = true;
		cadenaReal = "Cadena de Prueba";
		if(esVerdadero2 | num1 < numReal) {
			System.out.println("Es verdadera ");
		}else{
			System.out.println("Es falsa ");
		}
		if(num1 != numReal & esVerdadero2) {
			System.out.println("Es verdadera ");
		}else{
			System.out.println("Es falsa ");
		}
		if(num1 == numReal | esVerdadero2) {
			System.out.println("Es verdadera ");
		}else{
			System.out.println("Es falsa ");
		}
		if(esVerdadero == false & num1 > numReal) {
			System.out.println("Es verdadera ");
		}else{
			System.out.println("Es falsa ");
		}
		/*
		 * 4ï¿½	a)	Tenï¿½is que crear 2 variables mï¿½s. Una de tipo entero y otra de tipo String
		 * 		b)	Tenï¿½is que crear 2 trozos de cï¿½digo que pida al usuario que introduzca datos por teclado. Uno para introducir String y otro para introducir nï¿½meros.
		 * 		c)	Tenï¿½is que crear 2 sentencias if que comparen lo que el usuario ha introducido por teclado con ALGUNA DE VUESTRAS VARIABLES ANTERIORMENTE INICIALIZADAS.
		 * 
		 * 		2 puntos
		 */
		//Ejemplo
    Scanner scan =new Scanner(System.in);

		System.out.println("<<COMPARADOR de String e Int>>");
		System.out.println("Introduce la primera cadena");
		String cad = scan.nextLine();
		if(cad.equals(cadenaReal)) {
			System.out.println("Es verdadera ");
		}else{
			System.out.println("Es falsa ");
		}
		System.out.println("Introduce la segunda cadena");
		String cad1 = scan.nextLine();
		if(cad1.equals(cadenaReal)) {
			System.out.println("Es verdadera ");
		}else{
			System.out.println("Es falsa ");
		}
		
		System.out.println("Introduce el primer numero");
		int num = scan.nextInt();
		if(num == num1) {
			System.out.println("Es verdadera ");
		}else{
			System.out.println("Es falsa ");
		}
		System.out.println("Introduce el segundo numero");
		int numero = scan.nextInt();
		if(numero != primerEntero) {
			System.out.println("Es verdadera ");
		}else{
			System.out.println("Es falsa ");
		/*
		 * 5ï¿½	1. Dados dos nï¿½meros que el usuario introducirï¿½a por teclado, elaborar un trozo de cï¿½digo que sume ambos nï¿½meros y te muestre el resultado por pantalla.
		 * 		2. Dado un aï¿½o que el usuario introducirï¿½a por teclado, hay que averiguar a quï¿½ siglo pertenecerï¿½a dicho aï¿½o y mostrar dicho siglo por pantalla.
		 * 
		 * 		Ejemplo: Dado el aï¿½o 1989 -> El programa nos mostrarï¿½a por pantalla: Siglo 20.
		 * 		Ejemplo2: Dado el aï¿½o 1800 -> El programa nos mostrarï¿½a por pantalla: Siglo 18.
		 * 		*Nota aclaratoria. El siglo se empieza a contar a partir del aï¿½o xx00 . Osea, el aï¿½o 1700 es siglo 17. El aï¿½o 1701 serï¿½a siglo 18.
		 * 
		 * 		1 punto
		 */
		Scanner sc =new Scanner(System.in);
		System.out.println("<<SUMA DE NÃšMEROS>>");
		System.out.println("Introduce el primer numero a sumar : ");
		int primerNum = sc.nextInt();
		System.out.println("Introduce el segundo numero a sumar : ");
		int segundoNum = sc.nextInt();
		int suma = primerNum + segundoNum;
		System.out.println("El resultado es : " + suma);
		System.out.println("");
		System.out.println("<<AVERIGUAR SIGLO>>");
		System.out.println("Â¿A quÃ© siglo pertenece el aÃ±o que escribes?");
		System.out.println("Por favor, escriba en pantalla un aÃ±o : ");
		int anio = sc.nextInt();
		int siglo = anio%100;
		if(siglo == 0) {
			System.out.println(anio/100);
		}else{
			System.out.println((anio/100)+1);
		}

		
		/*
		 * 		Para entregar el ejercicio, tenï¿½is que indicar al principio de todo:
		 * 		Nombre de la actividad
		 * 		Nombre y apellidos
		 * 		Nombre del mï¿½dulo
		 * 
		 * 		Debï¿½is hacerlo poniendo 3 lï¿½neas de comentarios usando los comentarios MULTILï¿½NEA.
		 * 		
		 * 		0.5 puntos
		 */

		}

	}
	
}
	
