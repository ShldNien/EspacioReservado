package com.daw.pruebas;

import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {
		 System.out.println ("Empezamos el programa");

	        System.out.println ("Por favor introduzca una cadena por teclado:");

	        String entradaTeclado = "";

	        Scanner entradaEscaner = new Scanner (System.in); //Creaci�n de un objeto Scanner

	        entradaTeclado = entradaEscaner.nextLine (); //Invocamos un m�todo sobre un objeto Scanner

	        System.out.println ("Entrada recibida por teclado es: \"" + entradaTeclado +"\"");;

	}

}
