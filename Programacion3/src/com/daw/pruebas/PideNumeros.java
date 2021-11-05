package com.daw.pruebas;

import java.util.Scanner;

public class PideNumeros {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numTecl;
		int suma = 0;
		do {
			System.out.println("Introduzca un número: ");
			numTecl = sc.nextInt();	
		} while(numTecl!=0); 
		for (int i=1;i<5;i++) {
			suma = suma + i;
			System.out.println(suma);
		}
	}

}
