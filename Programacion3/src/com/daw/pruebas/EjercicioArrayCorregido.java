package com.daw.pruebas;

import java.util.Scanner;

public class EjercicioArrayCorregido {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] arrStr = new String[5];
		for(int i=0; i<arrStr.length;i++) {
			System.out.println("Introduce una palabra: ");
			arrStr[i] = sc.nextLine();
		}
		System.out.println("Introduce la palabra a buscar: ");
		String cadenaUsuario = sc.nextLine();
		boolean encontrado = false;
		for(int i=0;i<arrStr.length;i++) {
			if(arrStr[i].equals(cadenaUsuario)) {
				encontrado = true;
			}
		}
		if(encontrado==true) {
			System.out.println("La palabra se ha encontrado.");
		}else{
			System.out.println("La palabra no se ha encontrado.");
		}
	}

}
