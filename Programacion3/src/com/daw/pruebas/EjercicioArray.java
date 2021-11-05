package com.daw.pruebas;

import java.util.Scanner;

public class EjercicioArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * un programa que lea 5 palabras por teclado
		 * esas palabras las almacena en un array de Strings(arrStr)
		 * después, se lee otra palabra que se almacena en un 
		 * String (cadenaUsuario)
		 * el programa tiene que decir si esa palabra (cadenaUsuario) 
		 * se halla dentro del array de Strings del principio
		 * 
		 */
		//Declaramos un Scanner que usaremos mas tarde
		Scanner sc = new Scanner(System.in);
		//Inicializamos 2 array de String 
		String[] arrStr = new String[5];
		String[] cadenaUsuario = new String[5];
		//String aux = "";
		// encontrado nos chiva cuándo se encuentra una palabra en el array inicial
		System.out.println("Introduzca un total de 5 palabras por teclado: ");
		//for para almacenar palabras en cadenaUsuario
		for(int i=0;i<arrStr.length;i++) {
				arrStr[i] = sc.nextLine();
				cadenaUsuario[i] = arrStr[i];
		for(int j=i;j<cadenaUsuario.length;j++) {
			System.out.println("Introduzca una palabra para comprobar si está dentro del array.");
				arrStr[j] = sc.nextLine();
				cadenaUsuario[j] = arrStr[j];
			if(cadenaUsuario[i].equals(cadenaUsuario[j])) {
				System.out.println(cadenaUsuario[j]+" está dentro del array.");
			}else{
				System.out.println(cadenaUsuario[j]+" no está dentro del array.");
			}
		}
		}
	}
}