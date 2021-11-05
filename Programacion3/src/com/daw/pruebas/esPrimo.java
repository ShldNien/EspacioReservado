package com.daw.pruebas;

import java.util.Scanner;

public class esPrimo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numTecl;
		int cont=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un 5 números por teclado.");
		for (int i=0;i<5;i++) {
			numTecl = sc.nextInt();
			cont = numTecl;
			System.out.println("El número "+cont);
		}
	}
}
