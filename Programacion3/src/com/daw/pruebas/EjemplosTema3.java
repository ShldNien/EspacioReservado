package com.daw.pruebas;

import java.util.Scanner;

public class EjemplosTema3 {

	public static void main(String[] args) {
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un número : ");
		
		num = sc.nextInt();
		
		switch(num) {
		case 1:
			System.out.println("Este es el primero");
			break;
		case 2:
			System.out.println("Este es el segundo");
			break;
		case 3:
			System.out.println("Este es el tercero");
			break;
		case 4:
			System.out.println("Este es el cuarto");
			break;
		default:
			System.out.println("Este sale por defecto");
			break;
		}

		String cad = sc.nextLine();
		switch(cad) {
		case "Hola":
			System.out.println("Este es el primero");
			break;
		case "Adios":
			System.out.println("Este es el segundo");
			break;
		default:
			System.out.println("A pastar");
			break;
		}

	}
	
}
